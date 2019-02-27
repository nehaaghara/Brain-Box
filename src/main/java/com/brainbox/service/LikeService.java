/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.service;

import com.brainbox.model.AnswerLikeModel;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
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

}
