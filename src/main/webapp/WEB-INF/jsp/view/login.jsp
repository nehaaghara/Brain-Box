<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<body>
 
  
    
<div class="main-content-area">

   

    <!-- =-=-=-=-=-=-= Page Breadcrumb End =-=-=-=-=-=-= -->

    <!-- =-=-=-=-=-=-= Login Form =-=-=-=-=-=-= -->
    <section class="section-padding-80 white" id="login">
      <div class="container">
        <div class="row">
          <div class="col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">

            <div class="box-panel">

            

              <!-- form login -->
              <form action="loginauthen" method="get">
                <div class="form-group">
                    <h1 style="text-align: center">Login</h1><hr>
                </div>
                  <div class="form-group">
                  <label>UserName</label>
                  <input type="text" placeholder="Your Name" name="uname" class="form-control">
                </div>
                <div class="form-group">
                  <label>Password</label>
                  <input type="password" placeholder="Your Password" name="pass" class="form-control">
                </div>
                <div class="form-group">
                  <div class="row">
                    <div class="col-xs-6">
                      <div class="checkbox flat-checkbox">
                        <label>
                          <input type="checkbox">
                          <span class="fa fa-check"></span> Remember me?
                        </label>
                      </div>
                    </div>
                    <div class="col-xs-6 text-right">
                      <p class="help-block"><a data-toggle="modal" href="#myModal">Forgot password?</a>
                      </p>
                    </div>
                  </div>
                </div>

                <button class="btn btn-primary btn-lg btn-block">Log In</button>

              </form>
              <!-- form login -->

            </div>
          </div>

          <div class="clearfix"></div>
        </div>
      </div>
      <!-- end container -->
    </section>
    <!-- =-=-=-=-=-=-= Login Form   End =-=-=-=-=-=-= -->

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
        
  </body>
</html>