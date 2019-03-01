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
                                <li class="active"> <a data-toggle="tab" onclick="window.location.href = '${pageContext.servletContext.contextPath}/youranswer'"><i class="icofont icon-global"></i><span class="hidden-xs">Your Answer</span></a> 
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
                                    List<Object> lstobject=(List<Object>)request.getAttribute("lstofobject");
                                    for(int i = 0 ; i < lstobject.size() ; i++)
                                    {
                                        if(lstobject.isEmpty())
                                        {%>
                                        <h3> Sorry You Have No Data.....</h3>
                                        <% break; }
                                  
                                  %>
                                    
                                    
                                    <div class="row">
                                        <div class="col-md-2 col-sm-2 col-xs-12 hidden-xs">
                                            <a data-toggle="tooltip" data-placement="bottom" data-original-title="Martina Jaz" href="#">
                                                <img alt="" class="img-responsive center-block" src="${pageContext.servletContext.contextPath}/webResource/user/images/authors/1.jpg">
                                            </a>
                                        </div>
                                        <form action="recentanscontroller" method="get" >
                                            <input path="qid" type="hidden" name="qid" value="" />    
                                            <div class="col-md-7 col-sm-8  col-xs-12">
                                               
                                                <h3><%= lstobject.get(i) %><% i=i+1; %><div class="listing-meta pull-right"> <span></span>  <span> <%= lstobject.get(i) %><% i=i+1; %> Likes</span>
                                                       
                                                        <i class="fa fa-thumbs-up" style="color: #bb2026"></i>
                                                 </div></h3>
                                            </div>
                                           <div class="col-md-9 col-sm-8  col-xs-12">
                                                <hr>
                                                              <div class="questionAnswerScroll" style="background-color: white">
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
                                                                       <%= lstobject.get(i) %><% i=i+1; %>
                                                                       </font>
                                                                   </p>
                                                                    <ul class="list-inline">
                                                                        <li><i class="fa fa-thumbs-up margin-r-5" style="color: #bb2026"></i> <%= lstobject.get(i) %> Likes
                                                                       </li>
                                                                   </ul>
                                                                    </div>
                                                                 <hr>
                                                                 </div>
                                                                </div>
                                        </form>
                                    </div>
                                            <% } %>
                                 </div>
                            </div>
                        </div>

                    </div>
                </div>
                </section>
            </div>
                                 

