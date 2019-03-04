/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AnswerLikeModel;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.FetchRecentQuestionRipo;
import com.brainbox.service.LikeService;
import com.brainbox.serviceimpl.LikeServiceImpl;
import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
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
public class LikeController {

    @Autowired
    FetchRecentQuestionRipo fetchrecentquestionripo;

    @Autowired
    LikeService likeService;

    @RequestMapping(value = "/likequestion/{qid}/{flag}")
    public ModelAndView likeQuestion(@PathVariable("flag") String flag, @PathVariable("qid") BigInteger qid, HttpServletRequest request, HttpServletResponse res) {

        ModelAndView mv = new ModelAndView();
        List<PostQuestionModel> lstquestion = fetchrecentquestionripo.fetchrecentquestion();

        PostQuestionModel postquestionmodel = new PostQuestionModel();
        postquestionmodel.setId(qid);

        List<UserTable> lstuser = (List<UserTable>) request.getSession(false).getAttribute("lstuser");

        UserTable usertable = new UserTable();
        usertable.setUid(lstuser.get(0).getUid());

        QuestionLikeModel questionlikemodel = new QuestionLikeModel();
        questionlikemodel.setUsertable(usertable);
        questionlikemodel.setPostquestionmodel(postquestionmodel);

        boolean response = likeService.likeQuestionService(questionlikemodel);

        mv.addObject("lstquestion", lstquestion);
        mv.addObject("answertable", new AnswerTable());
        mv.addObject("response", response);
        if ("yourlevel".equalsIgnoreCase(flag)) {
            mv.setViewName("redirect:/yourlevelquestion");
        } else {
            mv.setViewName("redirect:/showrecent");
        }
        return mv;
    }

    @RequestMapping(value = "/likeanswer/{aid}/{flag}")
    public ModelAndView likeAnswer(@PathVariable("flag") String flag, @PathVariable("aid") BigInteger aid, HttpServletRequest request, HttpServletResponse res) {

        List<UserTable> lstuser = (List<UserTable>) request.getSession(false).getAttribute("lstuser");

        UserTable usertable = new UserTable();
        usertable.setUid(lstuser.get(0).getUid());
        boolean answerLikeResponse = likeService.likeAnswerService(aid, usertable);

        ModelAndView mv = new ModelAndView();
        mv.addObject("AnswerLikeResponse", answerLikeResponse);
        if ("yourlevel".equalsIgnoreCase(flag)) {
            mv.setViewName("redirect:/yourlevelquestion");
        } else {
            mv.setViewName("redirect:/showrecent");
        }
        return mv;
    }

    @RequestMapping(value = "dislikequestion/{userId}/{questionId}/{flag}")
    public ModelAndView disLikeQuestion(@PathVariable("flag") String flag, @PathVariable("userId") BigInteger userId, @PathVariable("questionId") BigInteger questionId) {
        PostQuestionModel postQuestionModel = new PostQuestionModel();
        postQuestionModel.setId(questionId);

        UserTable userTable = new UserTable();
        userTable.setUid(userId);
        likeService.disLikeQuestion(postQuestionModel, userTable);

        ModelAndView mv = new ModelAndView();
        if ("yourlevel".equalsIgnoreCase(flag)) {
            mv.setViewName("redirect:/yourlevelquestion");
        } else {
            mv.setViewName("redirect:/showrecent");
        }

        return mv;
    }

    @RequestMapping(value = "dislikeanswer/{userId}/{answerId}/{flag}")
    public ModelAndView disLikeAnswer(@PathVariable("flag") String flag, @PathVariable("userId") BigInteger userId, @PathVariable("answerId") BigInteger answerId) {

        AnswerTable answerTable = new AnswerTable();
        answerTable.setAid(answerId);

        UserTable userTable = new UserTable();
        userTable.setUid(userId);
        likeService.disLikeAnswer(answerTable, userTable);

        ModelAndView mv = new ModelAndView();
        if ("yourlevel".equalsIgnoreCase(flag)) {
            mv.setViewName("redirect:/yourlevelquestion");
        } else {
            mv.setViewName("redirect:/showrecent");
        }
        return mv;
    }
}
