/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AdminTopic;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.UserTable;

import com.brainbox.ripo.FetchAllTopicUserSide;
import com.brainbox.service.PostQuestionService;
import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-Java
 */
@Controller
@RequestMapping("/question")
public class PostQuestion {
    @Autowired
    PostQuestionService postquestionservice; 
    
    @Autowired
    FetchAllTopicUserSide fetchalltopicuserside;
    
    @RequestMapping(value="/post",method = RequestMethod.POST)
    public String postquestion(@ModelAttribute("postQuestion") PostQuestionModel postQuestionModel ,HttpServletRequest req,HttpServletResponse res)
    {
        List<UserTable> lstuser= (List<UserTable>)req.getSession(false).getAttribute("lstuser");
     
        if(lstuser == null || lstuser.isEmpty())
        {
         
            return "logintiles";
        } 
        else 
        {
            postQuestionModel.setUsertable(lstuser.get(0));
            postquestionservice.postquestionservice(postQuestionModel);
            if(lstuser.get(0).getUserrole().getRolepk().equals(new BigInteger("1")))
            {
                return "redirect:/adminpostque1";
            } 
            else 
            {
                return "redirect:/postquestion";
            }
        }
    }
}
