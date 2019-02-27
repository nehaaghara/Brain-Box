/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.serviceimpl.DeleteQuestionAdminSideServiceImpl;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ITMCS-Java
 */
@Controller
public class DeleteQuestionAdminSide {
    
    @Autowired
    DeleteQuestionAdminSideServiceImpl  deleteQuestionAdminSideServiceImpl;
    
     @RequestMapping(value = "/deletequestion/{id}", method = RequestMethod.GET)
    String deleteQuestionAdminSide(@PathVariable("id") BigInteger id,  Model model)
    {
        deleteQuestionAdminSideServiceImpl.deleteQuestionAdminSideService(id);
        
        return "redirect:/showallquestion1";
    }
    
}
