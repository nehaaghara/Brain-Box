/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.ripoimpl.DeleteQuestionAdminSideRipoImpl;
import com.brainbox.service.DeleteQuestionAdminSideService;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class DeleteQuestionAdminSideServiceImpl implements  DeleteQuestionAdminSideService{

    @Autowired
    DeleteQuestionAdminSideRipoImpl deleteQuestionAdminSideRipoImpl;
    
    @Override
    public String deleteQuestionAdminSideService(BigInteger id) {
        
        deleteQuestionAdminSideRipoImpl.DeleteQuestionAdminSideRipo(id);
        return "";
        
    }
    
}
