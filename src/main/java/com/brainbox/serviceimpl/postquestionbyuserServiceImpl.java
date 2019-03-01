/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.postquestionbyuserRipo;
import com.brainbox.service.postquestionbyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class postquestionbyuserServiceImpl implements postquestionbyuserService{

    @Autowired
    postquestionbyuserRipo postquestionbyuserRipo; 
    
    @Override
    public void postquestionbyuserService(PostQuestionModel pqm) {
        
        postquestionbyuserRipo.postquestionbyuserRipo(pqm);
    }
    
    
}
