/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.ripo.PostQuestionSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-Java
 */
@Repository
public class PostQuestionSaveImpl  implements PostQuestionSave{

    @Autowired
    CommonDAO commondao;
    
    @Override
    public void savedata(PostQuestionModel pqm) {
    
        commondao.saveOrUpdate(pqm);
    
    }
    
    
}
