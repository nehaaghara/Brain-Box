/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripo;

import com.brainbox.model.AnswerLikeModel;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-Java
 */
@Repository
public interface LikeRipo {

    public boolean likeQuestionRepository(QuestionLikeModel questionlikemodel);

    public List<QuestionLikeModel> fetchQueLikesbyID(PostQuestionModel postquestionmodel);

    public boolean likeAnswerRepository(BigInteger aid, UserTable usertable);
    
    public List<AnswerLikeModel> fetchAnswerLikeById(AnswerTable answerTable);

}
