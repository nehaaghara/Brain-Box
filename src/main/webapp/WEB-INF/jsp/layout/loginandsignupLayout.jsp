<%-- 
    Document   : loginandsignupLayout
    Created on : Feb 21, 2019, 12:54:29 PM
    Author     : ITMCS-Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
    <head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="author" content="ScriptsBundle">
	<title>Knowledge Q&A Dashboard Template</title>
	<!-- =-=-=-=-=-=-= Favicons Icon =-=-=-=-=-=-= -->
	<link rel="icon" href="${pageContext.servletContext.contextPath}/webResource/user/images/favicon.ico" type="image/x-icon" />
	<!-- =-=-=-=-=-=-= Mobile Specific =-=-=-=-=-=-= -->
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
	<!-- =-=-=-=-=-=-= Bootstrap CSS Style =-=-=-=-=-=-= -->
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/bootstrap.css">
	<!-- =-=-=-=-=-=-= Template CSS Style =-=-=-=-=-=-= -->
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/style.css">
	<!-- =-=-=-=-=-=-= Font Awesome =-=-=-=-=-=-= -->
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/font-awesome.css">
	<!-- =-=-=-=-=-=-= Et Line Fonts =-=-=-=-=-=-= -->
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/et-line-fonts.css">
	<!-- =-=-=-=-=-=-= Google Fonts =-=-=-=-=-=-= -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic|Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css">
	<!-- =-=-=-=-=-=-= Owl carousel =-=-=-=-=-=-= -->
	<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/webResource/user/css/owl.carousel.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/webResource/user/css/owl.style.css">
	<!-- =-=-=-=-=-=-= Highliter Css =-=-=-=-=-=-= -->
	<link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/styles/shCoreDefault.css" />
    <!-- =-=-=-=-=-=-= Css Animation =-=-=-=-=-=-= -->
    <link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/animate.min.css" />
    <!-- =-=-=-=-=-=-= Hover Dropdown =-=-=-=-=-=-= -->
    <link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath}/webResource/user/css/bootstrap-dropdownhover.min.css" />
	<!-- JavaScripts -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/modernizr.js"></script>
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
    <script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
    <body>
        <!-- =-=-=-=-=-=-= PRELOADER =-=-=-=-=-=-= -->
	<div class="preloader"><span class="preloader-gif"></span>
	</div>
	
        <tiles:insertAttribute name="body" flush="true" />
	 <!-- =-=-=-=-=-=-= JQUERY =-=-=-=-=-=-= -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/jquery.min.js"></script>
	<!-- Bootstrap Core Css  -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/bootstrap.min.js"></script>
	<!-- Jquery Smooth Scroll  -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/jquery.smoothscroll.js"></script>
	<!-- Jquery Easing -->
	<script type="text/javascript" src="${pageContext.servletContext.contextPath}/webResource/user/js/easing.js"></script>
	<!-- Jquery Counter -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/jquery.countTo.js"></script>
	<!-- Jquery Waypoints -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/jquery.waypoints.js"></script>
	<!-- Jquery Appear Plugin -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/jquery.appear.min.js"></script>
	<!-- Carousel Slider  -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/carousel.min.js"></script>
	<!-- Jquery Parallex -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/jquery.stellar.min.js"></script>
	<!--Style Switcher -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/bootstrap-dropdownhover.min.js"></script>
	<!-- Include jQuery Syntax Highlighter -->
	<script type="text/javascript" src="${pageContext.servletContext.contextPath}/webResource/user/scripts/shCore.js"></script>
	<script type="text/javascript" src="${pageContext.servletContext.contextPath}/webResource/user/scripts/shBrushPhp.js"></script>
	<!-- Template Core JS -->
	<script src="${pageContext.servletContext.contextPath}/webResource/user/js/custom.js"></script>
</body>

    </body>
</html>
