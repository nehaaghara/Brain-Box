/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.ContectUsModel;
import com.brainbox.service.ShowUserRequestAdminSideService;
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
public class ShowUserRequestAdminSide {
    
    @Autowired
     ShowUserRequestAdminSideService  showUserRequestAdminSideService;
    
    @RequestMapping("/showalluserrequest")
    public ModelAndView showUserRequestAdminSide(HttpServletRequest req)
    {
        ModelAndView mv =new ModelAndView();
        List<ContectUsModel> lstrequest=showUserRequestAdminSideService.showUserRequestAdminSideService();
        System.out.println("size:"+lstrequest.size());
        mv.addObject("lstrequest", lstrequest);
        mv.setViewName("viewuserrequestadminside");
        return mv;
    }
            
            
 }
