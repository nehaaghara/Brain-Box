<%-- 
    Document   : showuserrequestadminside
    Created on : Mar 4, 2019, 1:46:42 PM
    Author     : ITMCS-PC
--%>

<%@page import="com.brainbox.model.ContectUsModel"%>
<%@page import="java.util.List"%>
<%-- 
    Document   : viewtopicadminside
    Created on : Feb 20, 2019, 3:45:52 PM
    Author     : ITMCS-Java
--%>

<
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
              <h3 class="box-title">User Request</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <form>
              <table id="example2" class="table table-bordered table-hover">
                
                  <thead>
                <tr>
                 <th>Id</th>
                 <th>Name</th>
                 <th>email</th>
                 <th>subject</th>
                 <th>message</th>
                 <th>uid</th>
                  
                  
                </tr>
                </thead>
                <tbody>
                    <% List<ContectUsModel> lstrequest=(List<ContectUsModel>)request.getAttribute("lstrequest"); 
                        for(int i= 0;i<lstrequest.size();i++){
                    %>    
                  
 
        <tr>
            
            <td><%=  lstrequest.get(i).getReqid() %></td>
            <td><%=  lstrequest.get(i).getName() %></td>
            <td><%=  lstrequest.get(i).getEmail() %></td>
            <td><%=  lstrequest.get(i).getSubject() %></td>
            <td><%=  lstrequest.get(i).getMessage() %></td>
            <td><%=  lstrequest.get(i).getUsertable().getUid() %></td>
                    
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
