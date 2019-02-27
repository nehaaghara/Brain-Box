/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.model.UserRole;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.Authenripo;
import com.brainbox.ripo.User;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class Authenripoimpl implements Authenripo{
    @Autowired
    User userimpl;
    
    @Override
    public String authenripo(String username, String cpassword,String pass,String email) {
        
        UserTable usertable=new UserTable();
        usertable.setPassword(cpassword);
        usertable.setUsername(username);
        usertable.setEmail(email);
        usertable.setConformpassword(cpassword);
        UserRole userRole = new UserRole();
        userRole.setRolepk(new BigInteger("2"));
        usertable.setUserrole(userRole);
        userimpl.saveOrUpdateParty(usertable);
        return "";
    }

    @Override
    public List<UserTable> loginauthenripo(String username, String password) {
       
        UserTable usertable=new UserTable();
        usertable.setPassword(password);
        usertable.setUsername(username);
        return userimpl.fetchUser(usertable);
         
    }
    
    
    
    
}
