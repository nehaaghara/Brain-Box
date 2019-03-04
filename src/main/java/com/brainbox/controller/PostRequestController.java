/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.ContectUsModel;
import com.brainbox.model.UserTable;
import com.brainbox.service.PostRequestService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class PostRequestController {
    
    @Autowired
    PostRequestService postRequestService;
    
    @RequestMapping("/postreq")
    public String postreq(HttpServletRequest req)
    {
        List<UserTable> lstuser=(List<UserTable>)  req.getSession(false).getAttribute("lstuser");
        UserTable ut=new UserTable();
        ut.setUid(lstuser.get(0).getUid());
        ContectUsModel cum=new ContectUsModel();
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String subject=req.getParameter("subject");
        String message=req.getParameter("message");
        
        cum.setEmail(email);
        cum.setMessage(message);
        cum.setName(name);
        cum.setSubject(subject);
        cum.setUsertable(ut);
        
        postRequestService.postRequestService(cum);
        return "contectustiles";
    }
    
}
