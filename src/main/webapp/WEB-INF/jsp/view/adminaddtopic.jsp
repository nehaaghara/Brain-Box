<%-- 
    Document   : postquestiondelete
    Created on : Feb 13, 2019, 3:20:10 PM
    Author     : ITMCS-Java
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Update Topic 
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
                <h3 class="box-title">Add Topic</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form:form action="${pageContext.servletContext.contextPath}/addtopic" modelAttribute="addTopic" method="get">
               <form:hidden path="id" name="id" id="id"/>
                <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">Topic Name</label>
                  <form:input path="topicname" type="email" name="topicname" class="form-control" id="exampleInputEmail1" placeholder="Enter Topic Name"/>
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Discription</label>
                  <form:textarea path="discription" cols="30" name="discription" rows="7" class="form-control" id="exampleInputPassword1" placeholder="Discription"></form:textarea>
                </div>
              
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
