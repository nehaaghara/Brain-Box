/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ITMCS-Java
 */
@Entity
@Table(name="like_track_ans")
public class AnswerLikeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ans_like_id")
    BigInteger ans_like_id;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    UserTable usertable;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ans_id")
    AnswerTable answertable;

    public BigInteger getAns_like_id() {
        return ans_like_id;
    }

    public void setAns_like_id(BigInteger ans_like_id) {
        this.ans_like_id = ans_like_id;
    }

    public UserTable getUsertable() {
        return usertable;
    }

    public void setUsertable(UserTable usertable) {
        this.usertable = usertable;
    }

    public AnswerTable getAnswertable() {
        return answertable;
    }

    public void setAnswertable(AnswerTable answertable) {
        this.answertable = answertable;
    }
    
    
    
}
