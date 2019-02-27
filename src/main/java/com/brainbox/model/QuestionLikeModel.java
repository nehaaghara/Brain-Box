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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ITMCS-Java
 */
@Entity
@Table(name = "like_track_question")
public class QuestionLikeModel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "que_like_id",nullable = false)
    BigInteger que_like_id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    UserTable usertable;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "que_id")
    PostQuestionModel postquestionmodel;

    public UserTable getUsertable() {
        return usertable;
    }

    public void setUsertable(UserTable usertable) {
        this.usertable = usertable;
    }

    public PostQuestionModel getPostquestionmodel() {
        return postquestionmodel;
    }

    public void setPostquestionmodel(PostQuestionModel postquestionmodel) {
        this.postquestionmodel = postquestionmodel;
    }
    public BigInteger getQue_like_id() {
        return que_like_id;
    }

    public void setQue_like_id(BigInteger que_like_id) {
        this.que_like_id = que_like_id;
    }
}
