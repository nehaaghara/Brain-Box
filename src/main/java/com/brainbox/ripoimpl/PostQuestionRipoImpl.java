/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.model.AdminTopic;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.PostQuestionRipo;
import com.brainbox.ripo.PostQuestionSave;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class PostQuestionRipoImpl implements PostQuestionRipo{

    @Autowired
    CommonDAO commondao;
    
    
    
    
    @Override
    public String postquestionripo(PostQuestionModel postQuestionModel) {
        try {
            commondao.saveOrUpdate(postQuestionModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
    
    
}
