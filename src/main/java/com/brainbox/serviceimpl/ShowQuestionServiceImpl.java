/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.PostQuestionModel;

import com.brainbox.ripoimpl.ShowQuestionRipoImpl;
import com.brainbox.service.ShowQuestionService;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class ShowQuestionServiceImpl implements ShowQuestionService{

    @Autowired
    ShowQuestionRipoImpl showquestionripoimpl; 

    @Override
    public PostQuestionModel fetchquestionid(BigInteger id) {
        
       return showquestionripoimpl.fetchQuestionsById(id);
    }
    
   
    
}
