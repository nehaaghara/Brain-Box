/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.postquestionbyuserRipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class postquestionbyuserRipoImpl implements postquestionbyuserRipo{

    @Autowired
    CommonDAO commonDAO;
    
    @Override
    public void postquestionbyuserRipo(PostQuestionModel pqm) {
        System.out.println("vikas hingu");
        commonDAO.saveOrUpdate(pqm);
    }
    
}
