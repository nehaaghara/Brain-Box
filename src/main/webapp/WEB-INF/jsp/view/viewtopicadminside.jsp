<%-- 
    Document   : viewtopicadminside
    Created on : Feb 20, 2019, 3:45:52 PM
    Author     : ITMCS-Java
--%>

<%@page import="java.util.List"%>
<%@page import="com.brainbox.model.AdminTopic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                 <th>Topic Name</th>
                  <th> Discription</th>
                  <th>Edit</th>
                  <th>Delete</th>
                  
                </tr>
                </thead>
                <tbody>
                    <% List<AdminTopic> lsttopic=(List<AdminTopic>)request.getAttribute("lsttopic"); 
                        for(int i=0;i<lsttopic.size();i++){
                    %>   
                  
 
        <tr>
            
            <td><%= lsttopic.get(i).getId() %></td>
            <td><%= lsttopic.get(i).getTopicname() %></td>
            <td><%= lsttopic.get(i).getDiscription() %></td>
            
            <td><a href="${pageContext.servletContext.contextPath}/edittopic/<%= lsttopic.get(i).getId() %>" style="font-size: 22px"><i class="fa fa-edit"></i></a></td>
          <td><a href="${pageContext.servletContext.contextPath}/deletetopic/<%= lsttopic.get(i).getId() %>" style="font-size: 22px"><i class="fa fa-trash"></i></a></td>
            
            
                    
        </tr>
             
        <% } %>
               
                </tbody>
                          
              </table>
                    </form>
            </div>
            
          </div>
            </div>
      </div>
        </div>
    </body>
    </html>