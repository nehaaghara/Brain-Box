/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.PostQuestionRipo;
import com.brainbox.service.PostQuestionService;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class PostQuestionServiceImpl implements PostQuestionService{
    @Autowired
    PostQuestionRipo postquestionripo; 
    
    @Override
    public String postquestionservice(PostQuestionModel postQuestionModel) {
        postquestionripo.postquestionripo(postQuestionModel);
        
        return "";
    }
    
}
