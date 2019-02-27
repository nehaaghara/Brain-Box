/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.AdminTopic;
import com.brainbox.ripo.FetchAllTopicUserSide;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class FetchAlltopicUserSideImpl  implements FetchAllTopicUserSide{

    @Autowired
    CommonDAO commondao;
    
    @Override
    public List<AdminTopic> fetchalltopic() {
 
        List<AdminTopic> lsttopic=commondao.findEntity(AdminTopic.class);
       
        return lsttopic;
    }

    @Override
    public List<AdminTopic> fetchtopicbyid(BigInteger id) {
       
        List<AdminTopic> lsttopicid=commondao.findEntity(AdminTopic.class, "id",OperationTypeEnum.EQ,id);
        return lsttopicid;
    }
    
}
