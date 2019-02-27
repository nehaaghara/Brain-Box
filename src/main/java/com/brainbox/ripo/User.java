/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.AnswerTable;
import com.brainbox.model.UserTable;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface User {
    
     UserTable saveOrUpdateParty(UserTable ut);
    public List<UserTable> fetchUser(UserTable ut);
    public List<UserTable> fetchAllUser();
    public void saveanswer(AnswerTable at);
    
}
