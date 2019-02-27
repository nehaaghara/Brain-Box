/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ITMCS-Java
 */
@Entity
@Table(name="user_signup_table")
public class UserTable implements Serializable {
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="uid")
    BigInteger uid;
    
    @Column(name="username")
    String username;
    
    @Column(name="password")
    String password;
    
    @Column(name="conformpassword")
    String conformpassword;
    
    @Column(name="email")
    String email;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleFK")
    UserRole userrole;

    public UserRole getUserrole() {
        return userrole;
    }

    public void setUserrole(UserRole userrole) {
        this.userrole = userrole;
    }
   
    
    

    public String getConformpassword() {
        return conformpassword;
    }

    public void setConformpassword(String conformpassword) {
        this.conformpassword = conformpassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public BigInteger getUid() {
        return uid;
    }

    public void setUid(BigInteger uid) {
        this.uid = uid;
    }
    
    
}
