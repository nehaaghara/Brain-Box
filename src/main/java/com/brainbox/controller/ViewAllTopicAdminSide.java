/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AdminTopic;
import com.brainbox.ripoimpl.FetchAlltopicUserSideImpl;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-Java
 */
@Controller
public class ViewAllTopicAdminSide {
    
    @Autowired
    FetchAlltopicUserSideImpl fetchalltopicusersideimpl; 
    
    @RequestMapping("/viewalltopic")
    public  ModelAndView ViewAllTopicAdminSide()
   {
        ModelAndView mv=new ModelAndView();
        List<AdminTopic> lsttopic=fetchalltopicusersideimpl.fetchalltopic();
        mv.addObject("lsttopic", lsttopic);
        mv.setViewName("viewtopicadminside");
        return mv;
    }
    
     @RequestMapping(value="/edittopic/{id}",method = RequestMethod.GET)
    public  ModelAndView edittopic(@PathVariable("id") BigInteger id,Model model)
   {
        ModelAndView mv=new ModelAndView();
        List<AdminTopic> lsttopicid= fetchalltopicusersideimpl.fetchtopicbyid((BigInteger)id);
        mv.addObject("addTopic", lsttopicid.get(0));
        mv.setViewName("addtopictiles");
        return mv;
    }
    
}
