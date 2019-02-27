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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ITMCS-Java
 */
@Entity
@Table(name="tbl_role")
public class UserRole implements Serializable{
    
    @Id
    @Column(name="Rolepk")
    BigInteger rolepk;
    
    @Column(name="Rolename")
    String rolename;
    
    @Column(name="Isactive")
    Integer isactive;

    public BigInteger getRolepk() {
        return rolepk;
    }

    public void setRolepk(BigInteger rolepk) {
        this.rolepk = rolepk;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }
    
    
    
}
