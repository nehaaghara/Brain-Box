/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainbox.ripoimpl;

import com.brainbox.dal.CommonDAO;
import com.brainbox.dal.OperationTypeEnum;
import com.brainbox.model.AnswerTable;
import com.brainbox.model.PostQuestionModel;
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.YourQuestionUserSideRipo;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author ITMCS-PC
 */
@Repository
public class YourQuestionUserSideRipoImpl implements  YourQuestionUserSideRipo{

    @Autowired
    CommonDAO commonDAO;
    
    @Override
    public List<Object> yourQuestionUserSideRipo(List<UserTable> lstuser) {
     List<Object> lstobject=new ArrayList<Object>();
      List<PostQuestionModel> lstuserquestion = commonDAO.findEntity(PostQuestionModel.class,"usertable.uid",OperationTypeEnum.EQ,lstuser.get(0).getUid());
      for(int i=0 ; i < lstuserquestion.size() ; i++)
      {
         List<AnswerTable> lstanswerbyquestion = commonDAO.findEntity(AnswerTable.class , "postquestionmodel.id" , OperationTypeEnum.EQ , lstuserquestion.get(i).getId());
         List<QuestionLikeModel> lstlikes    =  commonDAO.findEntity(QuestionLikeModel.class,"postquestionmodel.id",OperationTypeEnum.EQ,lstuserquestion.get(i).getId());
         lstobject.add(lstuserquestion.get(i));
         lstobject.add(lstlikes .size());
         lstobject.add(lstanswerbyquestion);
         
      }
      return lstobject;
 
    }
    
    
}
