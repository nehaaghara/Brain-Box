/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.AnswerLikeModel;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.LikeRipo;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author ITMCS-Java
 */
@Repository
public class LikeRipoImpl  implements LikeRipo{

    @Autowired
    CommonDAO commonDAO;
    
    @Override
    public boolean likeQuestionRepository(QuestionLikeModel questionlikemodel) {

        List<QuestionLikeModel> lstQuestionLike=  commonDAO.findEntity(QuestionLikeModel.class,"usertable.uid",OperationTypeEnum.EQ,questionlikemodel.getUsertable().getUid(),"postquestionmodel.id",OperationTypeEnum.EQ,questionlikemodel.getPostquestionmodel().getId());
        if(lstQuestionLike.isEmpty())
        {
            commonDAO.saveOrUpdate(questionlikemodel);
            return true;
        }
         return false;
     }
    
    @Override
    public List<QuestionLikeModel> fetchQueLikesbyID(PostQuestionModel postquestionmodel){
       List<QuestionLikeModel> lstQuestionLike=  commonDAO.findEntity(QuestionLikeModel.class,"postquestionmodel.id",OperationTypeEnum.EQ,postquestionmodel.getId());
       return lstQuestionLike;
    }
 
    @Override
    public boolean likeAnswerRepository(BigInteger aid, UserTable usertable) {
    AnswerLikeModel answerLikeModel=new AnswerLikeModel();
        answerLikeModel.setUsertable(usertable);
        AnswerTable anstbl = new AnswerTable();
        anstbl.setAid(aid);
        answerLikeModel.setAnswertable(anstbl);
       List<AnswerLikeModel> lstanslike =commonDAO.findEntity(AnswerLikeModel.class,"answertable.aid",OperationTypeEnum.EQ,aid,"usertable.uid",OperationTypeEnum.EQ,usertable.getUid());
         
        if(lstanslike.isEmpty())
        {
            commonDAO.saveOrUpdate(answerLikeModel);
            return true;
        }
       
        return false;
    }

    @Override
    public List<AnswerLikeModel> fetchAnswerLikeById(AnswerTable answerTable) {
         List<AnswerLikeModel>  lstAnswerLikes = commonDAO.findEntity(AnswerLikeModel.class,"answertable.aid",OperationTypeEnum.EQ,answerTable.getAid());
         return lstAnswerLikes;
    }
    
}
