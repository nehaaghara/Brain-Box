/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.ripoimpl.DeleteTopicAdminSideRipoImpl;
import com.brainbox.service.DeleteTopicAdminSideService;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class DeleteTopicAdminSideServiceImpl implements DeleteTopicAdminSideService{

    @Autowired
    DeleteTopicAdminSideRipoImpl deleteTopicAdminSideRipoImpl; 
    
    @Override
    public String deletetopicadminsideservice(BigInteger id) {
       
        deleteTopicAdminSideRipoImpl.deleteTopicAdminSideRipo(id);
        
    return "";
    }
    
    
}
