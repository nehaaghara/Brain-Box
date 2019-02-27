/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.UserTable;
import com.brainbox.service.AuthenticationService;
import static java.lang.System.in;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-Java
 */
@Controller

public class Authentication {
    
    @Autowired
    AuthenticationService authService;
    
    @RequestMapping("/signupauthen")
    public String signup(HttpServletRequest req,HttpServletResponse res)
    {
        String username=req.getParameter("uname");
        String cpassword=req.getParameter("cpass");
        String password=req.getParameter("pass");
        String email=req.getParameter("email");
        
        authService.authenservice(username, cpassword,password,email);
        
        return "logintiles";
    }
    @RequestMapping(value="/loginauthen",method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest req,HttpServletResponse res)
    {
        System.out.println("nilesh hingu");
        ModelAndView mv=new ModelAndView();
        String username=req.getParameter("uname");
        String password=req.getParameter("pass");
        
        List<UserTable> lstuser = authService.loginauthenservice(username, password);
        System.out.println("lstsize"+lstuser.size());
         HttpSession session=req.getSession(true);
         session.setAttribute("lstuser", lstuser);
         
        
        if(!lstuser.isEmpty())
        {
            UserTable user = lstuser.get(0);
            mv.addObject("data", user);
            if(user.getUserrole().getRolepk().equals(new BigInteger("1"))){                
                mv.setViewName("dian.ublosis.index");
            }else if(user.getUserrole().getRolepk().equals(new BigInteger("2"))){
                mv.setViewName("redirect:/showrecent");
           }else if(user.getUserrole().getRolepk().equals(new BigInteger("3"))){
                mv.setViewName("dian.user.index");
           }
           
        }
        
        return mv;
        
    }
    
    
}
