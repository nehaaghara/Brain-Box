/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.service;

import com.brainbox.model.ContectUsModel;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public interface PostRequestService {
    
    public String postRequestService( ContectUsModel cum);
}
