<%-- 
    Document   : post-question
    Created on : Feb 8, 2019, 3:46:45 PM
    Author     : ITMCS-Java
--%>


<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="com.brainbox.model.UserTable"%>
<%@page import="com.brainbox.model.AdminTopic"%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 
        <!-- =-=-=-=-=-=-= Main Area =-=-=-=-=-=-= -->
  <div class="main-content-area">

    <!-- =-=-=-=-=-=-= Page Breadcrumb =-=-=-=-=-=-= -->
    <section class="page-title">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-sm-7 co-xs-12 text-left">
            <h1>Post Your Question</h1>
          </div>
          <!-- end col -->
          <div class="col-md-6 col-sm-5 co-xs-12 text-right">
            <div class="bread">
              <ol class="breadcrumb">
                <li><a href="#">Home</a>
                </li>
                <li><a href="#">Pages</a>
                </li>
                <li class="active">Post Question</li>
              </ol>
            </div>
            <!-- end bread -->
          </div>
          <!-- end col -->
        </div>
        <!-- end row -->
      </div>
      <!-- end container -->
    </section>

    <!-- =-=-=-=-=-=-= Page Breadcrumb End =-=-=-=-=-=-= -->

    <!-- =-=-=-=-=-=-= Post Question  =-=-=-=-=-=-= -->
    <section class="section-padding-80 white" id="post-question">
      <div class="container">
        <div class="row">
          <div class="col-sm-12 col-md-8 ">

            <div class="box-panel">

              <h2>Post Your Question</h2>
              <p>Duis dapibus aliquam mi, eget euismod sem scelerisque ut. Vivamus at elit quis urna adipiscing iaculis. Curabitur vitae velit in neque dictum blandit. Proin in iaculis neque. </p>
              <hr>
              <!-- form login -->
              <form action="postquestionbyuser" method="post">
                <div class="form-group">
                  <label>Question Title</label>
                  <input  type="text" placeholder="Bootstrap Not Working" name="qtitle" class="form-control"/>
                </div>
                <div class="form-group">
                    
                  <label>Category</label>
                  <select  class="questions-category form-control" name="stopic">
                      
                    
                    <% List<AdminTopic> lsttopic=(List<AdminTopic>)request.getAttribute("lsttopic");
                        
                    %>
                  <% for(int i=0;i<lsttopic.size();i++) { %>
                  
                  <option value="<%= lsttopic.get(i).getId() %>"><%= lsttopic.get(i).getTopicname() %></option>
                  <% } %>
                  </select>
                </div>

              

                <div class="form-group">
                  <label>Question Detials</label>
                  <textarea cols="12" rows="12" name="qdiscription" placeholder="Post Your Question Details Here....." id="message"  class="form-control"></textarea>
                </div>
                  
                  

                <button class="btn btn-primary pull-right">Publish Your Question</button>

              </form>
              <!-- form login -->

            </div>
          </div>

          <!-- Blog Right Sidebar -->
          <div class="col-sm-12 col-xs-12 col-md-4">

            <!-- sidebar -->
            <div class="side-bar">

              <!-- widget -->
              <div class="widget">
                <div class="recent-comments">
                  <h2>Hot Questions</h2>
                  <hr class="widget-separator no-margin">
                  <ul>
                    <li><a href="#">Twitter Bootsrap 3.0 - tabs-left not working anymore?</a>
                    </li>
                    <li><a href="#">Changing the color on my tabbed left bootstrap3 tabs</a>
                    </li>
                    <li><a href="#">How to create tabs on the left in bootstrap.js v3.0.0? </a>
                    </li>
                    <li><a href="#">A Repository class - would you use it to handle multi records? </a>
                    </li>

                    <li><a href="#">post data from html form to php script and return result to ajax/js/jquery </a>
                    </li>
                  </ul>
                </div>
              </div>
              <!-- widget -->

              <!-- widget -->
              <div class="widget">
                <div class="latest-news">
                  <h2>Latest News</h2>
                  <hr class="widget-separator no-margin">

                  <div class="news-post">
                    <div class="post">
                      <figure class="post-thumb"><img alt="" src="${pageContext.servletContext.contextPath}/webResource/user/images/blog/small-1.png">
                      </figure>
                      <h4><a href="#">Differentiate Yourself And Attract More Attention </a></h4>
                      <div class="post-info">1 hour ago</div>
                    </div>

                    <div class="post">
                      <figure class="post-thumb"><img alt="" src="${pageContext.servletContext.contextPath}/webResource/user/images/blog/small-2.png">
                      </figure>
                      <h4><a href="#">Differentiate Yourself And Attract More Attention </a></h4>
                      <div class="post-info">1 hour ago</div>
                    </div>

                    <div class="post">
                      <figure class="post-thumb"><img alt="" src="${pageContext.servletContext.contextPath}/webResource/user/images/blog/small-3.png">
                      </figure>
                      <h4><a href="#">Differentiate Yourself And Attract More Attention </a></h4>
                      <div class="post-info">1 hour ago</div>
                    </div>

                  </div>

                </div>
              </div>
              <!-- widget end -->

            </div>
            <!-- sidebar end -->

          </div>
          <!-- Blog Right Sidebar End -->
          <div class="clearfix"></div>
        </div>
      </div>
      <!-- end container -->
    </section>
    <!-- =-=-=-=-=-=-= Post QuestionEnd =-=-=-=-=-=-= -->

    <!-- =-=-=-=-=-=-= Our Clients =-=-=-=-=-=-= -->
    <section class="custom-padding" id="clients">
      <div class="container">

        <!-- Row -->
        <div class="row">

          <!-- col-md-2 client-block -->
          <div class="col-md-2 col-xs-6 col-sm-4 client-block">

            <!-- client-item client-item-style-2 -->
            <div class="client-item client-item-style-2">
              <a title="Client Logo" href="#"> <img alt="Clients Logo" src="${pageContext.servletContext.contextPath}/webResource/user/images/clients/client_5.png"> </a>
            </div>
            <!-- /client-item client-item-style-2 -->

          </div>
          <!-- /col-md-2 client-block -->

          <!-- col-md-2 client-block -->
          <div class="col-md-2 col-xs-6 col-sm-4 client-block">

            <!-- client-item client-item-style-2 -->
            <div class="client-item client-item-style-2">
              <a title="Client Logo" href="#"> <img alt="Clients Logo" src="${pageContext.servletContext.contextPath}/webResource/user/images/clients/client_6.png"> </a>
            </div>
            <!-- /client-item client-item-style-2 -->

          </div>
          <!-- /col-md-2 client-block -->

          <!-- col-md-2 client-block -->
          <div class="col-md-2 col-xs-6 col-sm-4 client-block">

            <!-- client-item client-item-style-2 -->
            <div class="client-item client-item-style-2">
              <a title="Client Logo" href="#"> <img alt="Clients Logo" src="${pageContext.servletContext.contextPath}/webResource/user/images/clients/client_7.png"> </a>
            </div>
            <!-- /client-item client-item-style-2 -->

          </div>
          <!-- /col-md-2 client-block -->

          <!-- col-md-2 client-block -->
          <div class="col-md-2 col-xs-6 col-sm-4 client-block">

            <!-- client-item client-item-style-2 -->
            <div class="client-item client-item-style-2">
              <a title="Client Logo" href="#"> <img alt="Clients Logo" src="${pageContext.servletContext.contextPath}/webResource/user/images/clients/client_8.png"> </a>
            </div>
            <!-- /client-item client-item-style-2 -->

          </div>
          <!-- /col-md-2 client-block -->

          <!-- col-md-2 client-block -->
          <div class="col-md-2 col-xs-6 col-sm-4 client-block">

            <!-- client-item client-item-style-2 -->
            <div class="client-item client-item-style-2">
              <a title="Client Logo" href="#"> <img alt="Clients Logo" src="${pageContext.servletContext.contextPath}/webResource/user/images/clients/client_9.png"> </a>
            </div>
            <!-- /client-item client-item-style-2 -->

          </div>
          <!-- /col-md-2 client-block -->

          <!-- col-md-2 client-block -->
          <div class="col-md-2 col-xs-6 col-sm-4 client-block">

            <!-- client-item client-item-style-2 -->
            <div class="client-item client-item-style-2">
              <a title="Client Logo" href="#"> <img alt="Clients Logo" src="${pageContext.servletContext.contextPath}/webResource/user/images/clients/client_10.png"> </a>
            </div>
            <!-- /client-item client-item-style-2 -->

          </div>
          <!-- /col-md-2 client-block -->

        </div>
        <!-- Row End -->

      </div>
      <!-- end container -->
    </section>
    <!-- =-=-=-=-=-=-= Our Clients -end =-=-=-=-=-=-= -->

  </div>
  <!-- =-=-=-=-=-=-= Main Area End =-=-=-=-=-=-= -->
   

