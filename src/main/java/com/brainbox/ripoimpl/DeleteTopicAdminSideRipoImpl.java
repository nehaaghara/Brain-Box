/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.ripo.DeleteTopicAdminSideRipo;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class DeleteTopicAdminSideRipoImpl implements DeleteTopicAdminSideRipo{

    @Autowired
    AdminImpl  adminImpl; 
    
    @Override
    public String deleteTopicAdminSideRipo(BigInteger id) {
       
        adminImpl.deletetopic(id);
   return "";
    
    }
    
    
}
