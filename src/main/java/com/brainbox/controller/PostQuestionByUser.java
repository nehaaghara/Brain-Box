/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AdminTopic;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.UserTable;
import com.brainbox.service.postquestionbyuserService;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class PostQuestionByUser {
    
    @Autowired
    postquestionbyuserService postquestionbyuserService;
    
    @RequestMapping("/postquestionbyuser")
    public ModelAndView postquestionbyuser(HttpServletRequest req)
    {
        List<UserTable> lstusertable=(List<UserTable>)req.getSession(false).getAttribute("lstuser");
        UserTable usertable=new UserTable();
        usertable.setUid(lstusertable.get(0).getUid());
        
        String qtitle=req.getParameter("qtitle");
        BigInteger stopic=(new BigInteger(req.getParameter("stopic")));
        String qdiscription=req.getParameter("qdiscription");
        
        AdminTopic at=new AdminTopic();
        at.setId(stopic);
        
        PostQuestionModel pqm=new PostQuestionModel();
        pqm.setQtitle(qtitle);
        pqm.setStopic(at);
        pqm.setQdiscription(qdiscription);
        pqm.setUsertable(usertable);
        
        postquestionbyuserService.postquestionbyuserService(pqm);
         ModelAndView mv=new ModelAndView();
         mv.setViewName("redirect:/postquestion");
         return mv;
    }
}
