/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.PostQuestionModel;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-Java
 */
@Repository
public interface FetchQuestionIdRipo {
    
    List<PostQuestionModel> fetchid(String question);
    
}
