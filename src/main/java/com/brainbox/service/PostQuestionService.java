/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.service;

import com.brainbox.model.PostQuestionModel;
import java.math.BigInteger;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface PostQuestionService {
 
    public String postquestionservice(PostQuestionModel postQuestionModel);
}
