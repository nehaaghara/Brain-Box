/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.ContectUsModel;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public interface ShowUserRequestAdminSideRipo {
    
    public List<ContectUsModel> showUserRequestAdminSideRipo();
    
}
