/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.AdminTopic;
import com.brainbox.ripoimpl.FetchAlltopicUserSideImpl;
import com.brainbox.service.FetchTopicById;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class FetchTopicByIdImpl implements FetchTopicById{

    @Autowired
    FetchAlltopicUserSideImpl fetcalltopicusersideimpl;
    
    @Override
    public List<AdminTopic> fetchtopicuseid(BigInteger id) {
      return fetcalltopicusersideimpl.fetchtopicbyid(id);
    }
    
}
