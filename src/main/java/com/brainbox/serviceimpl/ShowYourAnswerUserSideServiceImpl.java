/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.UserTable;
import com.brainbox.ripo.ShowYourAnswerUserSideRipo;
import com.brainbox.service.ShowYourAnswerUserSideService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class ShowYourAnswerUserSideServiceImpl implements ShowYourAnswerUserSideService{

    @Autowired
    ShowYourAnswerUserSideRipo showYourAnswerUserSideRipo;
    
    @Override
    public List<Object> showYourAnswerUserSideService(List<UserTable> lstuser) {
 
      return  showYourAnswerUserSideRipo.ShowYourAnswerUserSideRipo(lstuser);
        
    }

     
}
