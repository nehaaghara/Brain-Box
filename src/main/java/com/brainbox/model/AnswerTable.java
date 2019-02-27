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
import javax.persistence.Transient;

/**
 *
 * @author ITMCS-Java
 */
@Entity
@Table(name = "answertable")
public class AnswerTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Aid")
    BigInteger aid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    PostQuestionModel postquestionmodel;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    UserTable usertable;

    @Column(name = "no_of_like")
    int no_of_like;

    @Column(name = "answer")
    String answer;

    @Transient
    boolean user;

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public BigInteger getAid() {
        return aid;
    }

    public void setAid(BigInteger aid) {
        this.aid = aid;
    }

    public PostQuestionModel getPostquestionmodel() {
        return postquestionmodel;
    }

    public void setPostquestionmodel(PostQuestionModel postquestionmodel) {
        this.postquestionmodel = postquestionmodel;
    }

    public UserTable getUsertable() {
        return usertable;
    }

    public void setUsertable(UserTable usertable) {
        this.usertable = usertable;
    }

    public int getNo_of_like() {
        return no_of_like;
    }

    public void setNo_of_like(int no_of_like) {
        this.no_of_like = no_of_like;
    }
}
