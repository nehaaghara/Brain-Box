/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.service;

import com.brainbox.model.AdminTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface FetchTopicById {
    
    List<AdminTopic> fetchtopicuseid(BigInteger id); 
    
}
