<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: yulia--%>
  <%--Date: 12.07.17--%>
  <%--Time: 13:31--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"--%>
<%--xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">--%>
<%--<head>--%>
    <%--<title>PhoneBook</title>--%>
    <%--<link href="<c:url value="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />" rel="stylesheet">--%>
    <%--<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">--%>
    <%--<script src="<c:url value="/resources/js/login.js" />"></script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div th:if="${param.error}">--%>
    <%--Invalid username and password.--%>
<%--</div>--%>
<%--<div th:if="${param.logout}">--%>
    <%--You have been logged out.--%>
<%--</div>--%>
<%--<form th:action="@{/login}" method="post">--%>
    <%--<div class="container">--%>
        <%--&lt;%&ndash;<c:url value="/j_spring_security_check" var="loginUrl" />&ndash;%&gt;--%>
        <%--<div class="card card-container">--%>
            <%--<img id="profile-img" class="profile-img-card" src="http://www.freeiconspng.com/uploads/profile-icon-9.png" />--%>
            <%--<p id="profile-FIO" class="profile-FIO-card"></p>--%>
            <%--<form class="form-signin">--%>
                <%--<span id="reauth-email" class="reauth-email"></span>--%>
                <%--<input type="text" id="inputLogin" class="form-control" name="j_username" placeholder="Login" required autofocus>--%>
                <%--<input type="password" id="inputPassword" class="form-control" name="j_password" placeholder="Password" required>--%>
                <%--<div id="remember" class="checkbox">--%>
                    <%--<label>--%>
                        <%--<input type="checkbox" value="remember-me"> Remember me--%>
                    <%--</label>--%>
                <%--</div>--%>

                <%--<button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>--%>
            <%--</form><!-- /form -->--%>
            <%--<a href="#" class="forgot-password">--%>
                <%--Forgot the password?--%>
            <%--</a>--%>
        <%--</div><!-- /card-container -->--%>
    <%--</div><!-- /container -->--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-4 autowindow">
            <form class="form-horizontal" id="login" action="/spring_security_check" method="post">
                <h3>Выполните вход</h3>
                <div class="form-group">
                    <div class="col-sm-4">
                        <label for="j_username" class="control-label">Логин</label>
                    </div>
                    <div class="col-sm-8">
                        <input name="j_username" type="text" class="form-control" id="j_username"
                               placeholder="email">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-4">
                        <label for="j_password" class="control-label">Пароль</label>
                    </div>
                    <div class="col-sm-8">
                        <input name="j_password" type="password" class="form-control" id="j_password"
                               placeholder="password">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-6">
                        <a class="btn btn-primary col-sm-12" href="/registration">Регистрация</a>
                    </div>
                    <div class="col-sm-6 rightbutton">
                        <input class="btn btn-primary col-sm-12" type="submit" value="Войти">
                    </div>
                </div>
            </form>
            <c:if test="${param.error!=null}">
                <div class="alert alert-warning">
                        ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                </div>
            </c:if>
            <c:if test="${param.logout!=null}">
                <div class="alert alert-warning">
                    Вы разлогиниись.
                </div>
            </c:if>
            <c:if test="${not empty message}">
                <div class="alert alert-success">
                        ${message}
                </div>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>