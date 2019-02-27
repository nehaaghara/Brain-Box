/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.AnswerTable;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface RecentAnsRipo {
    
    AnswerTable recentansripo(AnswerTable answerTable);
    public List<AnswerTable> findAnswersByQuestionId(BigInteger questionId);
    
}
