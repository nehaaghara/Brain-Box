<%-- 
    Document   : showalldata
    Created on : Feb 8, 2019, 6:09:46 PM
    Author     : ITMCS-Java
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.brainbox.model.UserTable"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
                  <th>User Name</th>
                  <th>Password</th>
                  <th>Conform Password</th>
                  <th>Email</th>
                  <th>Role Pk</th>
                </tr>
                </thead>
                <tbody>
                    
              <%  List<UserTable> lstuser1 = (List<UserTable>)request.getAttribute("alluser"); %>
                     
   <% for(int i=0; i<lstuser1.size();i++){  %>
 
        <tr>
            <% if(lstuser1.get(i).getUserrole().getRolename().equals("user")) { %>
            <td><%=  lstuser1.get(i).getUsername() %></td>
            <td><%= lstuser1.get(i).getPassword() %></td>
            <td><%= lstuser1.get(i).getConformpassword() %></td>
            <td><%= lstuser1.get(i).getEmail() %></td>
            
          
            <td><%= lstuser1.get(i).getUserrole().getRolename() %></td>
            
            <% } %>
        
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