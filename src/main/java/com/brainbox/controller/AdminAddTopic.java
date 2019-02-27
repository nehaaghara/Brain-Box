/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.AdminTopic;
import com.brainbox.service.AdminAddTopicService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ITMCS-Java
 */
@Controller
public class AdminAddTopic {
    @Autowired
    AdminAddTopicService adminaddTopicservice; 
  
    @RequestMapping( value="/addtopic" , method = RequestMethod.GET)
    public String addtopic(@ModelAttribute("addTopic") AdminTopic admintopic , HttpServletRequest req,HttpServletResponse res)
    {
        adminaddTopicservice.addtopicservice(admintopic);
        return "addtopictiles";
    }
    
    
    
}
