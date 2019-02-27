/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.AdminTopic;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.Admin;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-Java
 */
@Repository
public class AdminImpl  implements Admin{

    
    @Autowired
    CommonDAO commondao;
    
    @Override
    public String saveorupdate(AdminTopic adminTopic) {
       
        commondao.saveOrUpdate(adminTopic);
        
        return "";
    }

    @Override
    public String deletetopic(BigInteger id) {
        
       List<AdminTopic> lsttopicbyid= commondao.findEntity(AdminTopic.class, "id",OperationTypeEnum.EQ,id);
       commondao.delete(lsttopicbyid.get(0));
       return "";
    }

    @Override
    public String deleteQuestion(BigInteger id) {
       List<PostQuestionModel> lstquebyid= commondao.findEntity(PostQuestionModel.class, "id",OperationTypeEnum.EQ,id);
       commondao.delete(lstquebyid.get(0));
       return "";
    }
    
    
    
}
