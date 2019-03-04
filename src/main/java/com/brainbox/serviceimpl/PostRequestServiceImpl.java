/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.ContectUsModel;
import com.brainbox.ripo.PostRequestRipo;
import com.brainbox.service.PostRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class PostRequestServiceImpl implements PostRequestService{

    @Autowired
    PostRequestRipo postRequestRipo;
    
    @Override
    public String postRequestService(ContectUsModel cum) {
        
        postRequestRipo.postRequestRipo(cum);
        
        return "";
    }
    
}
