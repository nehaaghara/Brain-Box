/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.RecentAnsRipo;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class RecentAnsRipoImpl implements RecentAnsRipo {

    @Autowired
    FetchQuestionIdRipoImpl fetchQuestionIdRipoImpl;

    @Autowired
    UserImpl userimpl;
    
    @Autowired
    CommonDAO commonDAO;

    @Override
    public AnswerTable recentansripo(AnswerTable answerTable) {
        userimpl.saveanswer(answerTable);
        return answerTable;

    }

    @Override
    public List<AnswerTable> findAnswersByQuestionId(BigInteger questionId) {
        List<AnswerTable> lstAnswers = commonDAO.findEntity(AnswerTable.class,"postquestionmodel.id",OperationTypeEnum.EQ,questionId);
        if(lstAnswers!=null){
            return lstAnswers;
        }
        return null;
    }

}
