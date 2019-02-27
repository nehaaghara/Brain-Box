/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.UserTable;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface Authenripo {
    
    public String authenripo(String username,String cpassword,String pass,String email);
    public List<UserTable> loginauthenripo(String username,String password);
    
}
