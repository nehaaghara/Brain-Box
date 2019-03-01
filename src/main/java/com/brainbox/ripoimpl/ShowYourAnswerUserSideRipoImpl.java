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
import com.brainbox.model.QuestionLikeModel;
import com.brainbox.model.UserTable;
import com.brainbox.ripo.ShowYourAnswerUserSideRipo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class ShowYourAnswerUserSideRipoImpl implements  ShowYourAnswerUserSideRipo{

    @Autowired
    CommonDAO commonDAO; 
    
    @Override
    public List<Object> ShowYourAnswerUserSideRipo(List<UserTable> lstuser) {
        
      List<AnswerTable> listofanstable= commonDAO.findEntity(AnswerTable.class,"usertable.uid" , OperationTypeEnum.EQ , lstuser.get(0).getUid());
      List<Object> listfobject =new ArrayList<>();
      
      for(int i = 0 ; i < listofanstable.size() ; i++)
      {
          List<AnswerLikeModel> lstanslike = commonDAO.findEntity(AnswerLikeModel.class, "answertable.aid" , OperationTypeEnum.EQ , listofanstable.get(i).getAid());
          List<QuestionLikeModel> lstquelike =commonDAO.findEntity(QuestionLikeModel.class,"postquestionmodel.id",OperationTypeEnum.EQ , listofanstable.get(i).getPostquestionmodel().getId());
          listfobject.add(listofanstable.get(i).getPostquestionmodel().getQtitle());
          listfobject.add(lstquelike.size());
          listfobject.add(listofanstable.get(i).getAnswer());
          listfobject.add(lstanslike.size());
          
          
      }
     return listfobject;
    }
     
}
