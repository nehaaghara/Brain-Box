/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.serviceimpl.DeleteTopicAdminSideServiceImpl;
import java.math.BigInteger;
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
public class DeleteTopicAdminSide {
 
    @Autowired
    DeleteTopicAdminSideServiceImpl deleteTopicAdminSideServiceimpl; 
    
    @RequestMapping(value="/deletetopic/{id}",method = RequestMethod.GET)
    public String deletetopic(@PathVariable("id") BigInteger id,Model model)
    {
        ModelAndView mv=new ModelAndView();
        
        deleteTopicAdminSideServiceimpl.deletetopicadminsideservice(id);
        return "redirect:/viewalltopic";
        
        
    }
}
