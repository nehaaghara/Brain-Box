<%-- 
    Document   : Adminpostque
    Created on : Feb 14, 2019, 4:52:34 PM
    Author     : ITMCS-Java
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="java.util.List"%>
<%@page import="com.brainbox.model.AdminTopic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
<!DOCTYPE html>
<html>
    <body>
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Post Question
        <small>Preview</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Forms</a></li>
        <li class="active">General Elements</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Add Question</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form:form action="${pageContext.servletContext.contextPath}/question/post" modelAttribute="postQuestion" method="post">
                <form:hidden path="id" name="id" id="id"/>
              <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">Question</label>
                  <form:input type="text" path="qtitle" name="qtitle" class="form-control" id="exampleInputEmail1" placeholder="Enter Question"/>
                </div>
                  
                  <div class="form-group">
                    
                  <label>Category</label>
                  <form:select path="stopic.id" class="questions-category form-control" name="stopic.id">
                  <%
                      List<AdminTopic> lsttopic=(List)request.getAttribute("lsttopic");
                        for(int i=0;i<lsttopic.size();i++) { %>
                  
                  <form:option value="<%= lsttopic.get(i).getId() %>"><%= lsttopic.get(i).getTopicname() %></form:option>
                  <% } %>
                  </form:select>
                </div>
                  
                <div class="form-group">
                  <label for="exampleInputPassword1">Question Discription</label>
                  <form:textarea cols="30" path="qdiscription" name="qdiscription" rows="7" class="form-control" id="exampleInputPassword1" placeholder="Discription"></form:textarea>
                </div>
                
              <!-- /.box-body -->

              <div class="box-footer">
                <form:button type="submit" class="btn btn-primary">Submit</form:button>
              </div>
            </form:form>
          </div>
          <!-- /.box -->

          <!-- Form Element sizes -->
          
        <!-- right column -->
        </div>
      </div>
  </div>
    </div>
  <!-- /.content-wrapper -->
    </body>
</html>

 
