/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.User;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Repository
public class UserImpl implements User{

    @Autowired
    CommonDAO commondao;
    
    
   
    @Override
    public UserTable saveOrUpdateParty(UserTable ut) {
        
       commondao.saveOrUpdate(ut);
        
    return ut;
    } 
    
   @Override
    public List<UserTable> fetchUser(UserTable ut) {
        return  commondao.findEntity(UserTable.class,"username",OperationTypeEnum.EQ,ut.getUsername(),"password",OperationTypeEnum.EQ,ut.getPassword()) ;
    }

    @Override
    public List<UserTable> fetchAllUser() {
        System.out.println("FETCH ALL USER");
        return commondao.findEntity(UserTable.class);
        
    }

    @Override
    public void saveanswer(AnswerTable at) {
        
       
    List<AnswerTable>  lstansbyidbyuid =  commondao.findEntity(AnswerTable.class , "postquestionmodel.id" , OperationTypeEnum.EQ , at.getPostquestionmodel().getId() , "usertable.uid" , OperationTypeEnum.EQ , at.getUsertable().getUid());
        if(lstansbyidbyuid.isEmpty())
        {
            commondao.saveOrUpdate(at);
        }
        else
        {
            for(int i=0 ; i<lstansbyidbyuid.size() ; i++)
            {
                 commondao.delete(lstansbyidbyuid.get(i));
            }
            commondao.saveOrUpdate(at);
        }
        
    }
    
}
