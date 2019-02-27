/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.FetchRecentQuestionRipo;
import com.brainbox.serviceimpl.RecentAnsServiceImpl;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-Java
 */
@Controller
public class RecentAnsController {
    
    @Autowired
    RecentAnsServiceImpl  recentansserviceimpl;
    
    @Autowired
    FetchRecentQuestionRipo fetchrecentquestionripo;
    
    @RequestMapping("/recentanscontroller")
    public ModelAndView recentanscontroller(@ModelAttribute(value = "answertable") AnswerTable answerTable , HttpServletRequest req,HttpServletResponse res)
    {
        ModelAndView mv=new ModelAndView();
        List<UserTable> lstuser=(List<UserTable>)req.getSession(false).getAttribute("lstuser");
        if(lstuser == null && lstuser.isEmpty())
        {
            mv.setViewName("logintiles");
        }
        else
        {
            String questionid=req.getParameter("qid");
            answerTable.setUsertable(lstuser.get(0));
            PostQuestionModel pqm=new PostQuestionModel();
            pqm.setId(new BigInteger(questionid));
            answerTable.setPostquestionmodel(pqm);
            AnswerTable objans = recentansserviceimpl.recentansservice(answerTable);
            List<PostQuestionModel> lstquestion=fetchrecentquestionripo.fetchrecentquestion() ;
            mv.addObject("lstquestion", lstquestion);
            mv.addObject("lstans",objans);
            mv.setViewName("redirect:/showrecent");
        }
        return mv;
    }
  
}
