/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.model.AdminTopic;
import com.brainbox.ripo.AdminAddTopicRipo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class AdminAddTopicRipoImpl implements AdminAddTopicRipo{
    @Autowired
    AdminImpl adminimpl;
   
    @Override
    public String addtopicripo(AdminTopic admintopic) {
        
      
        
        adminimpl.saveorupdate(admintopic);
        return "";
    }
    
}
