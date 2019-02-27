/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.AdminTopic;
import com.brainbox.ripo.AdminAddTopicRipo;
import com.brainbox.service.AdminAddTopicService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class AdminAddTopicServiceImpl implements AdminAddTopicService{

    @Autowired
    AdminAddTopicRipo  adminaddtopicripo;
   
    @Override
    public String addtopicservice(AdminTopic admintopic) {
       
        adminaddtopicripo.addtopicripo(admintopic);
        return "";
    }
    
    
}
