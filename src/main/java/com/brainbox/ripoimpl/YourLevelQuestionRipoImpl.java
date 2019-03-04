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
import com.brainbox.ripo.YourLevelQuestionRipo;
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
public class YourLevelQuestionRipoImpl implements YourLevelQuestionRipo {

    @Autowired
    CommonDAO commonDAO;

    @Override
    public List<Map<String, Object>> yourLevelQuestionRipo(List<UserTable> lstuser) {

        List<UserTable> lstuserbyquelevel = commonDAO.findEntity(UserTable.class, "queAskLevel", OperationTypeEnum.GE, lstuser.get(0).getQueAskLevel());
        List<Map<String, Object>> lstMapObject = new ArrayList<>();

        for (int i = 0; i < lstuserbyquelevel.size(); i++) {
            List<PostQuestionModel> lstquestionbyuid = commonDAO.findEntity(PostQuestionModel.class, "usertable.uid", OperationTypeEnum.EQ, lstuserbyquelevel.get(i).getUid());

            for (int j = 0; j < lstquestionbyuid.size(); j++) {
                Map<String, Object> queMap = new HashMap();
                queMap.put("queObject", lstquestionbyuid.get(j));

                List<QuestionLikeModel> lstquelike = commonDAO.findEntity(QuestionLikeModel.class, "postquestionmodel.id", OperationTypeEnum.EQ, lstquestionbyuid.get(j).getId());
                List<AnswerTable> lstansbyqueid = commonDAO.findEntity(AnswerTable.class, "postquestionmodel.id", OperationTypeEnum.EQ, lstquestionbyuid.get(j).getId());

                queMap.put("queLikes", lstquelike.size());
                for (QuestionLikeModel questionLikeModel : lstquelike) {
                    if (questionLikeModel.getUsertable().getUid().equals(lstuser.get(0).getUid())) {
                        queMap.put("user", true);
                    } else {
                        queMap.put("user", false);
                    }
                }

                for (AnswerTable answerTable : lstansbyqueid) {
                    List<AnswerLikeModel> lstanslike = commonDAO.findEntity(AnswerLikeModel.class, "answertable.aid", OperationTypeEnum.EQ, answerTable.getAid());
                    answerTable.setNo_of_like(lstanslike.size());
                    for (AnswerLikeModel answerLikeModel : lstanslike) {
                        if (answerLikeModel.getUsertable().getUid().equals(lstuser.get(0).getUid())) {
                            answerTable.setUser(true);
                            break;
                        }
                    }
                }
                queMap.put("queWiseAnswer", lstansbyqueid);
                lstMapObject.add(queMap);
            }
        }
        return lstMapObject;
    }

}
