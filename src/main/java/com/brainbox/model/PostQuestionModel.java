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
import javax.persistence.Table;

/**
 *
 * @author ITMCS-Java
 */
@Entity
@Table(name="postquestion")
public class PostQuestionModel {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     BigInteger id;
     
     @Column(name="question_title")
     String qtitle;
    
     @JoinColumn(name="selected_topic")
     @ManyToOne(fetch = FetchType.EAGER)
     AdminTopic stopic;
      
      @Column(name="question_discription")
     String qdiscription;
      
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    UserTable usertable;

    public UserTable getUsertable() {
        return usertable;
    }

    public void setUsertable(UserTable usertable) {
        this.usertable = usertable;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }


    public String getQtitle() {
        return qtitle;
    }

    public void setQtitle(String qtitle) {
        this.qtitle = qtitle;
    }

    public AdminTopic getStopic() {
        return stopic;
    }

    public void setStopic(AdminTopic stopic) {
        this.stopic = stopic;
    }

    

    public String getQdiscription() {
        return qdiscription;
    }

    public void setQdiscription(String qdiscription) {
        this.qdiscription = qdiscription;
    }
      
      
}
