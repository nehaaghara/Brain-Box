/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.UserTable;
import com.brainbox.ripo.YourQuestionUserSideRipo;
import com.brainbox.service.YourQuestionUserSideService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class YourQuestionUserSideServiceImpl implements YourQuestionUserSideService{

    @Autowired
    YourQuestionUserSideRipo yourQuestionUserSideRipo;
    
    @Override
    public List<Object> yourQuestionUserSideService(List<UserTable> lstuser) {
       return yourQuestionUserSideRipo.yourQuestionUserSideRipo(lstuser);
        
        
    }
    
}
