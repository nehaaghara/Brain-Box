<%@page import="com.brainbox.model.UserTable"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="top-bar">
    <div class="container">
        <%List<UserTable> lstuser = (List<UserTable>) request.getSession(false).getAttribute("lstuser");%>
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-4">
                <ul class="top-nav nav-left">
                  <li class="hidden-xs"><a href="blog.html">Blog</a>
                    </li>
                    <li  class="hidden-xs"><a href="${pageContext.servletContext.contextPath}/contectusindex">Contact Us</a>
                    </li>
                </ul>
            </div>
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-8">
                <ul class="top-nav nav-right">
                    <li><a href="${pageContext.servletContext.contextPath}/login"><i class="fa fa-lock" aria-hidden="true"></i>Login</a>
                    </li>
                    <li><a href="${pageContext.servletContext.contextPath}/signup"><i class="fa fa-user-plus" aria-hidden="true"></i>Signup</a>
                    </li>
                    <li class="dropdown"> 
                        <a class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown" data-animations="fadeInUp">
                            <img class="img-circle resize" alt="" src="${pageContext.servletContext.contextPath}/webResource/admin/dist/img/avatar5.png">
                            <span class="hidden-xs small-padding">
                                <span><%=lstuser.get(0).getUsername()%></span>
                                <i class="fa fa-caret-down"></i>
                            </span>
                        </a>
                        <ul class="dropdown-menu ">
                            <li><a href="${pageContext.servletContext.contextPath}/logout"><i class="icon-lock"></i>Logout</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- =-=-=-=-=-=-= HEADER Navigation =-=-=-=-=-=-= -->
<div class="navbar navbar-default">
    <div class="container">
        <!-- header -->
        <div class="navbar-header">
            <button data-target=".navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">	<span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!-- logo -->
            <a href="index.html" class="navbar-brand">
                <img class="img-responsive" alt="" src="${pageContext.servletContext.contextPath}/webResource/user/images/logo.png">
            </a>
            <!-- header end -->
        </div>
        <!-- navigation menu -->
        <div class="navbar-collapse collapse">
            <!-- right bar -->
            <ul class="nav navbar-nav navbar-right">
                <li class="hidden-sm"><a href="${pageContext.servletContext.contextPath}/workit">How  It Works</a>
                </li>
                <li>
                    <div class="btn-nav"><a href="${pageContext.servletContext.contextPath}/postquestion" class="btn btn-primary btn-small navbar-btn">Post Question</a>
                    </div>
                </li>
            </ul>

            <!-- HEADER Navigation End -->		</div>
        <!-- navigation menu end -->
        <!--/.navbar-collapse -->
    </div>
</div>
<!-- HEADER Navigation End -->