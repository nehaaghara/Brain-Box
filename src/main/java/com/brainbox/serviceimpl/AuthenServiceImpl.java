/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.UserTable;
import com.brainbox.ripoimpl.Authenripoimpl;
import com.brainbox.service.AuthenticationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class AuthenServiceImpl implements AuthenticationService {

    @Autowired
    Authenripoimpl authenripoimpl;

    @Override
    public String authenservice(String username, String cpassword,String pass,String email) {

        authenripoimpl.authenripo(username, cpassword,pass,email);

        return "";
    }

    @Override
    public List<UserTable> loginauthenservice(String username, String password) {

       
        return authenripoimpl.loginauthenripo(username, password);
    }

}
