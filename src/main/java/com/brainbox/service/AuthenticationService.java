/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.service;

import com.brainbox.model.UserTable;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface AuthenticationService {
    
    public String authenservice(String username,String cpassword,String pass,String email);
    public List<UserTable> loginauthenservice(String username,String password);
    
}
