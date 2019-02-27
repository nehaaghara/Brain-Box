/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.ShowQuestionRipo;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class ShowQuestionRipoImpl  implements ShowQuestionRipo{

    @Autowired
    CommonDAO commondao;
    
    
    
    @Override
    public List<PostQuestionModel> showquestion() {
        
        List<PostQuestionModel> lstque=commondao.findEntity(PostQuestionModel.class);
        return lstque;
        
    }

    @Override
    public PostQuestionModel fetchQuestionsById(BigInteger id) {
        
       List<PostQuestionModel> lstquestionmodel=commondao.findEntity(PostQuestionModel.class, "id",OperationTypeEnum.EQ,id);
       return lstquestionmodel.get(0);
    }
    
    
}
