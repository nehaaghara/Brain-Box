/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.controller;

import com.brainbox.model.UserTable;
import com.brainbox.service.YourLevelQuestionService;
import java.util.List;
import java.util.Map;
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
public class YourLevelQuestionController {
    
    @Autowired
     YourLevelQuestionService  yourLevelQuestionService ;
    
    @RequestMapping("/yourlevelquestion")
    public ModelAndView yourLevelQuestionController(HttpServletRequest req)
    {
        List<UserTable> lstuser = (List<UserTable>)req.getSession(false).getAttribute("lstuser");
        ModelAndView mv=new ModelAndView();
       List<Map<String,Object>> lstmapobject= yourLevelQuestionService.yourLevelQuestionService(lstuser);
       mv.addObject("lstmapobject" , lstmapobject);
       mv.setViewName("yourlevelquestiontiles");
        return mv;
    }
    
}
