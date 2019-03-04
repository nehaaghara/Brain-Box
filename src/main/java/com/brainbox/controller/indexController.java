/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AdminTopic;
import com.brainbox.model.AnswerLikeModel;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.FetchAllTopicUserSide;
import com.brainbox.ripo.FetchRecentQuestionRipo;
import com.brainbox.ripo.LikeRipo;
import com.brainbox.ripo.ShowQuestionRipo;
import com.brainbox.ripoimpl.UserImpl;
import com.brainbox.service.LikeService;
import com.brainbox.service.RecentAnsService;
import com.brainbox.serviceimpl.ShowQuestionServiceImpl;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ITMCS-Java
 */
@Controller
public class indexController {

    @Autowired
    UserImpl userimpl;

    @Autowired
    ShowQuestionRipo showquestionripo;

    @Autowired
    FetchAllTopicUserSide fetchalltopicuserside;

    @Autowired
    FetchRecentQuestionRipo fetchrecentquestionripo;

    @Autowired
    ShowQuestionServiceImpl showsuestionserviceimpl;

    @Autowired
    LikeService likeService;

    @Autowired
    RecentAnsService recentAnsService;

    ModelAndView mv = new ModelAndView();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "logintiles";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "logintiles";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupPage() {
        System.out.println("vikas hingu");
        return "signuptiles";
    }

    @RequestMapping(value = "/postquestion", method = RequestMethod.GET)
    public ModelAndView postquestionPage(HttpServletRequest req, HttpServletResponse res) {

        List<AdminTopic> lsttopic = fetchalltopicuserside.fetchalltopic();
        mv.addObject("lsttopic", lsttopic);
        List<UserTable> lstuser = (List<UserTable>) req.getSession(false).getAttribute("lstuser");
        if (lstuser == null || lstuser.isEmpty()) {

            mv.setViewName("logintiles");

        } else {
            mv.addObject("postQuestion", new PostQuestionModel());
            mv.setViewName("postQuestiontiles");
            return mv;
        }
        return mv;
    }

    @RequestMapping(value = "/showalldata1")
    public ModelAndView showalldataPage() {
        List<UserTable> lstuser = new ArrayList<>();

        try {
            lstuser = userimpl.fetchAllUser();

        } catch (Exception e) {

            System.out.println("error" + e);
        }

        mv.addObject("alluser", lstuser);
        mv.setViewName("showalldatatiles");
        return mv;
    }

    @RequestMapping(value = "/postordelete", method = RequestMethod.GET)
    public ModelAndView postquestionordelete() {
        mv.addObject("addTopic", new AdminTopic());
        mv.setViewName("addtopictiles");
        return mv;
    }

    @RequestMapping(value = "/showallquestion1", method = RequestMethod.GET)
    public ModelAndView showquestion() {

        List<PostQuestionModel> lstque = showquestionripo.showquestion();
        mv.addObject("lstque", lstque);
        mv.setViewName("showallquestiontiles");

        return mv;
    }

    @RequestMapping(value = "/adminpostque1", method = RequestMethod.GET)
    public ModelAndView adminpostque() {

        List<AdminTopic> lsttopic = fetchalltopicuserside.fetchalltopic();
        mv.addObject("lsttopic", lsttopic);
        mv.addObject("postQuestion", new PostQuestionModel());
        mv.setViewName("postquestionadmin");
        return mv;
    }

    @RequestMapping(value = "/showrecent", method = RequestMethod.GET)
    public ModelAndView showrecent(HttpServletRequest req, HttpServletRequest res, RedirectAttributes redirectAttributes) {
        ModelAndView mv = new ModelAndView();
        List<UserTable> lstuser = (List<UserTable>) req.getSession(false).getAttribute("lstuser");
        if (lstuser == null || lstuser.isEmpty()) {
            mv.setViewName("dian.user.index");
        } else {
            //answer like functionality && show all answers function
            List<PostQuestionModel> lstquestion = fetchrecentquestionripo.fetchrecentquestion();
            Map<String, Object> answerByQuestion = likeService.fetchAnserLikebyId(lstquestion, lstuser.get(0).getUid());

            //question like functionality
            List<Map<String, Object>> likelstMapQuestion = new ArrayList();
            for (PostQuestionModel postQuestionModel : lstquestion) {
                Map<String, Object> likeMapQuestion = new HashMap();
                List<QuestionLikeModel> lstQuestionModel = likeService.fetchQueLikesbyID(postQuestionModel);
                likeMapQuestion.put("likeQuestion", lstQuestionModel.size());
                likeMapQuestion.put("questionId", postQuestionModel.getId());
                for (QuestionLikeModel questionLikeModel : lstQuestionModel) {
                    if (questionLikeModel.getUsertable().getUid().equals(lstuser.get(0).getUid())) {
                        likeMapQuestion.put("user", true);
                    } else {
                        likeMapQuestion.put("user", false);
                    }
                }
                likelstMapQuestion.add(likeMapQuestion);
            }

            mv.addObject("mapQuestionAnswer", answerByQuestion);
            mv.addObject("likelstMapQuestion", likelstMapQuestion);
            mv.addObject("lstquestion", lstquestion);
            mv.addObject("answertable", new AnswerTable());
            mv.setViewName("showrecentquestionusertiles");
        }
        return mv;
    }

    @RequestMapping(value = "/editquestion/{id}", method = RequestMethod.GET)
    public ModelAndView editAccount(@PathVariable("id") BigInteger id, Model model) {
        try {

            PostQuestionModel postQuestionModel = showsuestionserviceimpl.fetchquestionid(id);
            List<AdminTopic> lsttopic = fetchalltopicuserside.fetchalltopic();
            mv.addObject("lsttopic", lsttopic);
            mv.addObject("postQuestion", postQuestionModel);
            mv.setViewName("postquestionadmin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        try {
            HttpSession session = request.getSession();
            session.invalidate();
            return "redirect:/login";
        } catch (Exception e) {
            return "";
        }
    }
}
