<%-- 
    Document   : contectus
    Created on : Mar 4, 2019, 12:40:35 PM
    Author     : ITMCS-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- =-=-=-=-=-=-= Main Area =-=-=-=-=-=-= -->
  <div class="main-content-area">

    <!-- =-=-=-=-=-=-= Page Breadcrumb =-=-=-=-=-=-= -->
    <section class="page-title">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-sm-7 co-xs-12 text-left">
            <h1>Contact Us</h1>
          </div>
          <!-- end col -->
          <div class="col-md-6 col-sm-5 co-xs-12 text-right">
           
            <!-- end bread -->
          </div>
          <!-- end col -->
        </div>
        <!-- end row -->
      </div>
      <!-- end container -->
    </section>

    <!-- =-=-=-=-=-=-= Page Breadcrumb End =-=-=-=-=-=-= -->

    <!-- =-=-=-=-=-=-= Contact Us  =-=-=-=-=-=-= -->
    <section class="section-padding-80 white contact-us" id="contacts">
      <div class="container">
        <div class="row">
          <div class="col-sm-8 col-sm-8 col-xs-12">

            <h2>Send a Message</h2>

            <form id="contactForm" method="post" action="postreq">
              <div class="row">
                <div class="col-lg-6 formmargin">

                  <div class="form-group">
                    <input type="text" placeholder="Name" id="name" name="name" class="form-control" required>

                  </div>

                  <div class="form-group">
                    <input type="email" placeholder="Email" id="email" name="email" class="form-control" required>

                  </div>

                  <div class="form-group">
                    <input type="text" placeholder="Subject" id="subject" name="subject" class="form-control" required>
                  </div>

                </div>
                <div class="col-lg-6">
                  <div class="form-group">
                    <textarea cols="12" rows="8" placeholder="Message..." id="message" name="message" class="form-control" required></textarea>
                  </div>
                </div>
                <div class="col-lg-12">
                  <button id="yes" class="btn btn-primary" type="submit">Send Message</button>

                </div>
              </div>
            </form>
          </div>

          <div class="col-md-4 col-sm-4 col-xs-12 contact-detail">

            <h2>Contact Details</h2>

            <div class="contact-info">
              <p>Etiam sit amet orci eget eros faucibus tincidunt. Pellentesque commodo eros a enim. Etiam rhoncus. Nulla facilisi. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras sagittis. </p>
              <p>Vestibulum turpis sem, aliquet eget, lobortis pellentesque.</p>
              <div class="social-links-two clearfix">
                <a class="facebook img-circle" href="#">
                  <span class="fa fa-facebook-f"></span>
                </a>
                <a class="twitter img-circle" href="#">
                  <span class="fa fa-twitter"></span>
                </a>
                <a class="google-plus img-circle" href="#">
                  <span class="fa fa-google-plus"></span>
                </a>
                <a class="linkedin img-circle" href="#">
                  <span class="fa fa-pinterest-p"></span>
                </a>
                <a class="linkedin img-circle" href="#">
                  <span class="fa fa-linkedin"></span>
                </a>
              </div>
            </div>
            <!-- end links -->

          </div>

          <div class="clearfix"></div>
        </div>
      </div>
      <!-- end container -->
    </section>
    <!-- =-=-=-=-=-=-= Contact Us End =-=-=-=-=-=-= -->

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
