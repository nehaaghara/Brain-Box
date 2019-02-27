/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.FetchRecentQuestionRipo;
import com.brainbox.ripo.RecentQuestion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class FetchRecentQuestionImpl implements FetchRecentQuestionRipo{

    @Autowired
    RecentQuestion recentquestion; 
    
    public List<PostQuestionModel> fetchrecentquestion() {
        
       List<PostQuestionModel> lstquestion= recentquestion.fetchrecentquestion();
        
        return lstquestion;
        
    }
    
    
}
