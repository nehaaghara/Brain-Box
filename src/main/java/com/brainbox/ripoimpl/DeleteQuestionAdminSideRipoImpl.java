/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.ripo.DeleteQuestionAdminSideRipo;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class DeleteQuestionAdminSideRipoImpl implements DeleteQuestionAdminSideRipo{

    @Autowired
    AdminImpl adminImpl;
    
    @Override
    public String DeleteQuestionAdminSideRipo(BigInteger id) {
 
        adminImpl.deleteQuestion(id);
        
        return "";
    }
    
}
