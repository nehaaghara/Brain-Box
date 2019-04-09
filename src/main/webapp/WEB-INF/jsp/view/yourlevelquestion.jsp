<%-- 
    Document   : yourlevelquestion
    Created on : Mar 1, 2019, 3:52:14 PM
    Author     : ITMCS-PC
--%>

<%@page import="com.brainbox.model.AnswerLikeModel"%>
<%@page import="com.brainbox.model.QuestionLikeModel"%>
<%-- 
    Document   : showyouranswer
    Created on : Mar 1, 2019, 11:36:17 AM
    Author     : ITMCS-PC
--%>


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
                                <li > <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/showrecent'" href="#"><i class="icofont icon-ribbon"></i><span class="hidden-xs">Recent Questions</span></a> 
                                </li>
                                <li> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/yourquestion'"><i class="icofont icon-layers"></i><span class="hidden-xs">Your Question</span></a>
                                </li>
                                <li> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/youranswer'"><i class="icofont icon-global"></i><span class="hidden-xs">Your Answer</span></a> 
                                </li>
                                <li class="active"> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/yourlevelquestion'"><i class="icofont icon-linegraph"></i><span class="hidden-xs">Your Level Question</span></a> 
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
                                        List<UserTable> lstuser = (List<UserTable>) request.getSession(false).getAttribute("lstuser");
                                        String user = lstuser.get(0).getUid().toString();
                                        List<Map<String, Object>> lstmapobject = (List<Map<String, Object>>) request.getAttribute("lstmapobject");
                                        for (int i = 0; i < lstmapobject.size(); i++) {
                                            Map<String, Object> map = lstmapobject.get(i);

                                    %>   


                                    <div class="row">
                                        <div class="col-md-2 col-sm-2 col-xs-12 hidden-xs">
                                            <a data-toggle="tooltip" data-placement="bottom" data-original-title="Martina Jaz" href="#">
                                                <img alt="user image" class="img-responsive center-block img-circle" src="${pageContext.servletContext.contextPath}/webResource/user/images/avtar.jpg">
                                            </a>
                                            <h5><center> <font color="#3c8dbc"><%=lstuser.get(0).getUsername().toUpperCase()%></font></center></h5>
                                        </div>
                                        <% PostQuestionModel question = (PostQuestionModel) map.get("queObject");%>
                                        <form action="recentanscontroller" method="get" >
                                            <input path="qid" type="hidden" name="qid" value="<%= question.getId()%>" />    
                                            <div class="col-md-7 col-sm-12  col-xs-12">
                                                <h3> <%= question.getQtitle()%> </h3>
                                                <div style="height: 5%"></div>
                                            </div>
                                            <div class="col-md-3 col-sm-12  col-xs-12">
                                                <% if (null != map.get("user") && (boolean) map.get("user")) {%>
                                                <a  href ="dislikequestion/<%= user%>/<%= question.getId()%>/yourlevel"><i class="fa fa-thumbs-up" style="color: #bb2026"></i></a> <span><%= map.get("queLikes")%> Likes</span>
                                                    <% } else {%>
                                                <a href="likequestion/<%= question.getId()%>/yourlevel"><i class="fa fa-thumbs-o-up"></i></a> <span><%=map.get("queLikes")%> Likes</span>
                                                    <% } %>

                                            </div>

                                            <div class="col-md-9 col-sm-8  col-xs-12">
                                                <h3><a  href="#"> Your Answer </a></h3>

                                                <div class="form-group">
                                                    <textarea path="answer" name="answer" cols="12" rows="4" class="form-control" placeholder="Write your Answer" /></textarea>

                                                </div>
                                                <button class="btn btn-primary btn-lg btn-block">Post Your Answer</button>

                                                <hr>
                                                <% List<AnswerTable> lstanswer = (List<AnswerTable>) map.get("queWiseAnswer");
                                                %>
                                                <%if(lstanswer.size()>0){ %>
                                                <div class="questionAnswerScroll" style="background-color: white">
                                                    <% for (int j = 0; j < lstanswer.size(); j++) {%>  
                                                    <div class="post">
                                                        <div class="user-block">
                                                            <img class="img-circle img-bordered-sm" src="webResource/admin/dist/img/avatar5.png" alt="user image">
                                                            <span class="username">
                                                                <a href="#" style="font-size: 20px;"><font color="#3c8dbc"></font></a>
                                                            </span>
                                                            <span class="description" style="font-size: 12px;"><h3>Your Answer:</h3></span>
                                                        </div>
                                                        <!-- /.user-block -->
                                                        <p style="font-size: 16px;">
                                                            <font color="black">
                                                            <%= lstanswer.get(j).getAnswer()%>
                                                            </font>
                                                        </p>
                                                        <ul class="list-inline">
                                                            <li>
                                                                <% if (lstanswer.get(j).isUser()) {%>
                                                                <a href="dislikeanswer/<%= user%>/<%= lstanswer.get(j).getAid()%>/yourlevel" class="link-black text-sm"><i class="fa fa-thumbs-up margin-r-5" style="color: #bb2026"></i> <%= lstanswer.get(j).getNo_of_like()%> Likes</a>
                                                                <% } else {%>
                                                                <a href="likeanswer/<%= lstanswer.get(j).getAid()%>/yourlevel" class="link-black text-sm"><i class="fa fa-thumbs-o-up margin-r-5"></i> <%= lstanswer.get(j).getNo_of_like()%> Likes</a>
                                                                <%} %>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <hr>
                                                    <% }
                                                   %>
                                                   
                                                </div> <% }else{ %>
                                                <div style="height: 5%">
                                                <b style="font-size: 16px; color: #bb2026">Sorry...You have no answer for the above question Right Now....</b>
                                                </div>
                                                <hr>
                                                <% } %>
                                            </div>
                                        </form>
                                    </div>
                                    <% }%>   
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                </section>
            </div>


