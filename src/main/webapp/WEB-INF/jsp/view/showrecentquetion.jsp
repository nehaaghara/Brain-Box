
<%@page import="com.brainbox.model.UserTable"%>
<%@page import="java.util.Map"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="com.brainbox.model.PostQuestionModel"%>
<%@page import="com.brainbox.model.AnswerTable"%>
<%@page import="java.util.List"%>

<div class="main-content-area">
    <!-- =-=-=-=-=-=-= Latest Questions  =-=-=-=-=-=-= -->
    <section class="white question-tabs padding-bottom-80" id="latest-post">
        <div class="container">
            <div class="row">
                <!-- Content Area Bar -->
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <!-- Tabs -->
                            <ul class="nav panel-tabs">
                                <li class="active"> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/showrecent'" href="#"><i class="icofont icon-ribbon"></i><span class="hidden-xs">Recent Questions</span></a> 
                                </li>
                                <li> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/yourquestion'"><i class="icofont icon-layers"></i><span class="hidden-xs">Your Question</span></a>
                                </li>
                                <li> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/youranswer'"><i class="icofont icon-global"></i><span class="hidden-xs">Your Answer</span></a> 
                                </li>
                                <li> <a data-toggle="tab" href="#tab4"><i class="icofont icon-linegraph"></i><span class="hidden-xs">No answers</span></a> 
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="panel-body">
                        <div class="tab-content">
                            <div id="tab1" class="tab-pane active">
                                <!-- Question Listing -->

                                <div class="listing-grid">
                                    <% 
                                        List<PostQuestionModel> lstquestion = (List<PostQuestionModel>) request.getAttribute("lstquestion");
                                        List<Map<String,Object>> lstQueMap = (List<Map<String,Object>>)request.getAttribute("likelstMapQuestion");
                                        List<UserTable> lstuser = (List<UserTable>) request.getSession(false).getAttribute("lstuser");
                                        String user = lstuser.get(0).getUid().toString();
                                        for (int i = 0; i < lstquestion.size(); i++) { 
                                            String likeVal = "0";
                                            if(lstquestion.get(i).getId() == lstQueMap.get(i).get("questionId")){
                                                likeVal = lstQueMap.get(i).get("likeQuestion").toString();
                                            }
                                    %>

                                    <div class="row">
                                        <div class="col-md-2 col-sm-2 col-xs-12 hidden-xs">
                                            <a data-toggle="tooltip" data-placement="bottom" data-original-title="Martina Jaz" href="#">
                                                <img alt="User Image" class="img-responsive center-block" src="${pageContext.servletContext.contextPath}/webResource/user/images/authors/1.jpg">
                                            </a>
                                                <h5><center> <font color="#3c8dbc"><%=lstuser.get(0).getUsername().toUpperCase()%></font></center></h5>
                                        </div>
                                        <form:form action="recentanscontroller" method="get" modelAttribute="answertable">
                                            <input path="qid" type="hidden" name="qid" value="<%= lstquestion.get(i).getId()%>" />    
                                            <div class="col-md-7 col-sm-8  col-xs-12">
                                                <h3> <%= lstquestion.get(i).getQtitle()%><div class="listing-meta pull-right"> <span><i class="fa fa-clock-o" aria-hidden="true"></i>8 minutes ago</span>  
                                                        <%if(null!=lstQueMap.get(i).get("user") && (boolean)lstQueMap.get(i).get("user")){
                                                        %><a href="dislikequestion/<%= user%>/<%= lstquestion.get(i).getId()%>"><i class="fa fa-thumbs-up" style="color: #bb2026"></i></a> <span><%=likeVal%> Likes</span><%
                                            }else{
                                                            %><a href="likequestion/<%= lstquestion.get(i).getId()%>"><i class="fa fa-thumbs-o-up"></i></a> <span><%=likeVal%> Likes</span><%    
                                                    }%> 

                                                    </div></h3>
                                            </div>
                                            <div class="col-md-9 col-sm-8  col-xs-12">
                                                <h3><a  href="#"> Your Answer </a></h3>

                                                <div class="form-group">
                                                    <form:textarea path="answer" name="answer" cols="12" rows="4" class="form-control" placeholder="Write your Answer" /></textarea>

                                                </div>
                                                <form:button class="btn btn-primary btn-lg btn-block">Post Your Answer</form:button>
                                                    <hr>
                                                <%
                                                    Map<String,Object> mapQuestionAnswer = (Map<String,Object>) request.getAttribute("mapQuestionAnswer");
                                                   if(String.valueOf(lstquestion.get(i).getId()).equalsIgnoreCase(String.valueOf(mapQuestionAnswer.get("queID")))){
                                                     List<AnswerTable> lstAnswerTables =(List<AnswerTable>) mapQuestionAnswer.get("answerList");
                                    for(AnswerTable answer :lstAnswerTables){%>
                                                <div class="post">
                                                    <div class="user-block">
                                                        <img class="img-circle img-bordered-sm" src="webResource/admin/dist/img/avatar5.png" alt="user image">
                                                        <span class="username">
                                                            <a href="#" style="font-size: 20px;"><font color="#3c8dbc"><%= answer.getUsertable().getUsername().toUpperCase() %></font></a>
                                                        </span>
                                                        <span class="description" style="font-size: 12px;">Shared publicly</span>
                                                    </div>
                                                    <!-- /.user-block -->
                                                    <p style="font-size: 16px;">
                                                        <font color="black">
                                                        <%= answer.getAnswer()%>
                                                        </font>
                                                    </p>
                                                    <% if(answer.isUser()){%>
                                                    <ul class="list-inline">
                                                        <li><a href="dislikeanswer/<%= user%>/<%= answer.getAid()%>" class="link-black text-sm"><i class="fa fa-thumbs-up margin-r-5" style="color: #bb2026"></i> <%= answer.getNo_of_like()%> Likes</a>
                                                        </li>
                                                    </ul>
                                                    <%
                                             }else{
                                                    %><ul class="list-inline">
                                                        <li><a href="likeanswer/<%= answer.getAid()%>" class="link-black text-sm"><i class="fa fa-thumbs-o-up margin-r-5"></i> <%= answer.getNo_of_like()%> Likes</a>
                                                        </li>
                                                    </ul><%    
                                                    }%>   
                                                </div>
                                                <hr>
                                                <% } } %>
                                            </div>
                                        </form:form>
                                    </div>
                                    <% } %>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>

                </section>
            </div>


