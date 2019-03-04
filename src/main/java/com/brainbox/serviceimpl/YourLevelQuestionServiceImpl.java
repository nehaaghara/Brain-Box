/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.UserTable;
import com.brainbox.ripoimpl.YourLevelQuestionRipoImpl;
import com.brainbox.service.YourLevelQuestionService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class YourLevelQuestionServiceImpl implements YourLevelQuestionService{

    @Autowired
     YourLevelQuestionRipoImpl yourLevelQuestionRipoImpl;
    
    @Override
    public List<Map<String,Object>> yourLevelQuestionService(List<UserTable> lstuser) {
        
      return  yourLevelQuestionRipoImpl.yourLevelQuestionRipo(lstuser);
    }
    
     
}
