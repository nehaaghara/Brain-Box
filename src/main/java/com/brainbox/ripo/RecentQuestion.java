/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.PostQuestionModel;
import java.util.List;

/**
 *
 * @author ITMCS-Java
 */
public interface RecentQuestion {
    
    List<PostQuestionModel> fetchrecentquestion();
    
}
