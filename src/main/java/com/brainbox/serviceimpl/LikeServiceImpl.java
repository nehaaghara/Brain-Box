/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.serviceimpl;

import com.brainbox.model.AnswerLikeModel;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.FetchRecentQuestionRipo;
import com.brainbox.ripo.LikeRipo;
import com.brainbox.ripo.RecentAnsRipo;
import com.brainbox.service.LikeService;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-Java
 */
@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeRipo likeRipo;

    @Autowired
    FetchRecentQuestionRipo fetchrecentquestionripo;

    @Autowired
    RecentAnsRipo recentAnsRipo;

    @Override
    public boolean likeQuestionService(QuestionLikeModel questionlikemodel) {
        return likeRipo.likeQuestionRepository(questionlikemodel);
    }

    @Override
    public List<QuestionLikeModel> fetchQueLikesbyID(PostQuestionModel postquestionmodel) {
        return likeRipo.fetchQueLikesbyID(postquestionmodel);
    }

    @Override
    public boolean likeAnswerService(BigInteger aid, UserTable usertable) {
        return likeRipo.likeAnswerRepository(aid, usertable);

    }

    @Override
    public Map<String, Object> fetchAnserLikebyId(List<PostQuestionModel> lstquestion,BigInteger userId) {
       
        Map<String, Object> answerByQuestion = new HashMap();
        for (PostQuestionModel postQuestionModel : lstquestion) {
            answerByQuestion.put("queID", postQuestionModel.getId());
            List<AnswerTable> lstAnswerTables = recentAnsRipo.findAnswersByQuestionId(postQuestionModel.getId());
            for (AnswerTable answerTable1 : lstAnswerTables) {
                List<AnswerLikeModel> lstAnswers = likeRipo.fetchAnswerLikeById(answerTable1);
                answerTable1.setNo_of_like(lstAnswers.size());
                for(AnswerLikeModel answerLikeModel: lstAnswers){
                    if (answerLikeModel.getUsertable().getUid().equals(userId)) {
                        answerTable1.setUser(true);
                    } else {
                        answerTable1.setUser(false);
                    }
                }                
            }
            answerByQuestion.put("answerList", lstAnswerTables);
        }

        return answerByQuestion;
    }

}
