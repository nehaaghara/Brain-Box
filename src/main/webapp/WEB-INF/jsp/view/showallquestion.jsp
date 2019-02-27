<%-- 
    Document   : showallquestion
    Created on : Feb 14, 2019, 3:54:07 PM
    Author     : ITMCS-Java
--%>

<%@page import="java.util.List"%>
<%@page import="com.brainbox.model.PostQuestionModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    
    <body>
        

        <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Data Tables
        <small>advanced tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Tables</a></li>
        <li class="active">Data tables</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Hover Data Table</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <form>
              <table id="example2" class="table table-bordered table-hover">
                
                  <thead>
                <tr>
                  <th>Id</th>
                  <th>Question Title</th>
                  <th>Selected Topic</th>
                  <th>Question Discription</th>
                  <th>Edit</th>
                  <th>Delete</th>
                  
                </tr>
                </thead>
                <tbody>
                    
                    <%  List<PostQuestionModel> lstque = (List<PostQuestionModel>)request.getAttribute("lstque"); %>
                     
   <% for(int i=0; i<lstque.size();i++){  %>
 
        <tr>
            
            <td><%=  lstque.get(i).getId() %></td>
            <td><%= lstque.get(i).getQtitle() %></td>
            <td><%= lstque.get(i).getStopic().getTopicname() %></td>
            <td><%= lstque.get(i).getQdiscription() %></td>
            <td><a href="${pageContext.servletContext.contextPath}/editquestion/<%= lstque.get(i).getId()%>" style="font-size: 22px"><i class="fa fa-edit"></i></a></td>
          <td><a href="${pageContext.servletContext.contextPath}/deletequestion/<%= lstque.get(i).getId()%>" style="font-size: 22px"><i class="fa fa-trash"></i></a></td>
            
            
                    
        </tr>
             
        <% } %>
               
                </tbody>
                          
              </table>
                    <form>
            </div>
            
          </div>
            </div>
      </div>
        </div>
    </body>
