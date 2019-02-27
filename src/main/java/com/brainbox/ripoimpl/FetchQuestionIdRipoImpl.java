/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.FetchQuestionIdRipo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-Java
 */
@Repository
public class FetchQuestionIdRipoImpl implements FetchQuestionIdRipo{

    @Autowired
    CommonDAO  commondAO; 
    
    @Override
    public List<PostQuestionModel> fetchid(String question) {
        System.out.println("question" + question);
   List<PostQuestionModel> lstque= commondAO.findEntity(PostQuestionModel.class , "qtitle" , OperationTypeEnum.EQ , question);
        System.out.println(lstque.get(0).getId());
   
   return lstque;    
    
    }
    
}
