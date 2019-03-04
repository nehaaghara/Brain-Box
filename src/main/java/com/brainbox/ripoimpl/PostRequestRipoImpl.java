/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.model.ContectUsModel;
import com.brainbox.ripo.PostRequestRipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class PostRequestRipoImpl implements PostRequestRipo{

    @Autowired
    CommonDAO commonDAO; 
    
    @Override
    public String postRequestRipo(ContectUsModel cum) {
        commonDAO.saveOrUpdate(cum);
        
        return "";
    }
    
}
