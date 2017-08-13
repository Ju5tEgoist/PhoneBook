<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yulia
  Date: 12.07.17
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
          xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

        <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
        <%--<c:url value="/css/main.css" var="jstlCss" />--%>
        <link href="${jstlCss}" rel="stylesheet" />
        <title>PhoneBook</title>
    </head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="https://github.com/Ju5tEgoist">Ju5tEgoist</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="about">About</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login">LogIn</a></li>
                <li><a href="logOut">LogOut</a></li>
            </ul>
        </div>

    </div>
</nav>
<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
