/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.UserTable;
import com.brainbox.service.YourQuestionUserSideService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class YourQuestionUserSideController {
    
    @Autowired
    YourQuestionUserSideService yourQuestionUserSideService;
    
    @RequestMapping("/yourquestion")
    public ModelAndView yourquestion(HttpServletRequest req,HttpServletResponse res)
    {
        ModelAndView mv=new ModelAndView();
        List<UserTable> lstuser=(List<UserTable>) req.getSession(false).getAttribute("lstuser");
       List<Object> lstobject =yourQuestionUserSideService.yourQuestionUserSideService(lstuser);
       
       mv.addObject("lstobject", lstobject);
       mv.setViewName("showyourquestion");
        return mv;
    }
    
}
