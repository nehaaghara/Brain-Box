/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.HibernateQueryDao;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.RecentQuestion;
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
public class RecentQuestionImpl implements RecentQuestion{

    
    @Autowired
    CommonDAO commondao;

    @Autowired
    HibernateQueryDao hibernatequerydao;
    
    @Override
    public List<PostQuestionModel> fetchrecentquestion() {
        String query="Select p from PostQuestionModel p order by p.id DESC";
        List lstQuestions = hibernatequerydao.createByCountNewQuery(query, null,0,10);
        List<PostQuestionModel> lstPostQuestions = new ArrayList<>();
        for(int i =0 ; i< lstQuestions.size();i++){
            lstPostQuestions.add((PostQuestionModel)lstQuestions.get(i));
        }
        
        return lstPostQuestions;
    }
    
  
    
    
}
