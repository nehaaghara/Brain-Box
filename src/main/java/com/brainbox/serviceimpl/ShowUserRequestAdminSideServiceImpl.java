/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.ContectUsModel;
import com.brainbox.ripo.ShowUserRequestAdminSideRipo;
import com.brainbox.service.ShowUserRequestAdminSideService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class ShowUserRequestAdminSideServiceImpl implements ShowUserRequestAdminSideService{

    @Autowired
    ShowUserRequestAdminSideRipo showUserRequestAdminSideRipo;
    
    @Override
    public List<ContectUsModel> showUserRequestAdminSideService() {
        
       return showUserRequestAdminSideRipo.showUserRequestAdminSideRipo();
    }
    
}
