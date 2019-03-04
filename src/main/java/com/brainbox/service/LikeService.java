/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.service;


import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public interface LikeService {

    public boolean likeQuestionService(QuestionLikeModel questionlikemodel);

    public List<QuestionLikeModel> fetchQueLikesbyID(PostQuestionModel postquestionmodel);

    public boolean likeAnswerService(BigInteger aid, UserTable usertable);
    
    public Map<String,Object> fetchAnserLikebyId(List<PostQuestionModel> lstquestion,BigInteger userId);
    
    public void disLikeQuestion(PostQuestionModel postQuestionModel,UserTable userTable);
    
    public void disLikeAnswer(AnswerTable answerTable,UserTable userTable);
    
    public Map<String,Object> fetchQuestionLike(List<PostQuestionModel> lstquestion,BigInteger userId);
    
 
}
