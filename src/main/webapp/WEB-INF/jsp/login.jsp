<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: yulia
  Date: 12.07.17
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>PhoneBook</title>
    <link href="<c:url value="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/login.js" />"></script>
</head>
<body>
<div th:if="${param.error}">
    Invalid username and password.
</div>
<div th:if="${param.logout}">
    You have been logged out.
</div>
<form th:action="@{/login}" method="post">
    <div class="container">
        <%--<c:url value="/j_spring_security_check" var="loginUrl" />--%>
        <div class="card card-container">
            <img id="profile-img" class="profile-img-card" src="http://www.freeiconspng.com/uploads/profile-icon-9.png" />
            <p id="profile-FIO" class="profile-FIO-card"></p>
            <form class="form-signin">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="inputLogin" class="form-control" name="j_username" placeholder="Login" required autofocus>
                <input type="password" id="inputPassword" class="form-control" name="j_password" placeholder="Password" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>

                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                Forgot the password?
            </a>
        </div><!-- /card-container -->
    </div><!-- /container -->
</form>
</body>
</html>
