/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.AnswerTable;
import com.brainbox.ripoimpl.RecentAnsRipoImpl;
import com.brainbox.service.RecentAnsService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class RecentAnsServiceImpl implements  RecentAnsService{

    @Autowired
     RecentAnsRipoImpl  recentansripoimpl;
    
    @Override
    public AnswerTable recentansservice(AnswerTable answerTable) {
        
        recentansripoimpl.recentansripo( answerTable);
        
        return  answerTable;
    }

    @Override
    public List<AnswerTable> fetchAnswersByQuestionId(BigInteger questionId) {
       return recentansripoimpl.findAnswersByQuestionId(questionId);
    }
    
}
