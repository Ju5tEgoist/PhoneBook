<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yulia
  Date: 12.07.17
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>PhoneBook</title>
    <%--<link href="<c:url value="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />" rel="stylesheet">--%>
    <%--<link href="<c:url value="/resources/css/registration.css" />" rel="stylesheet">--%>
    <script src="<c:url value="${contextPath}/resources/js/registration.js" />"></script>
</head>
<body>
<form:form>
    <div class="container">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-8 col-sm-offset-2">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please sign up <small>It's free!</small></h3>
                    </div>
                    <div class="panel-body">
                        <form:form role="form" action="registration" modelAttribute="userForm" method="post" class="form-signin">
                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <input type="text" name="fullName" id="fullName" class="form-control input-sm floatlabel" placeholder="Full name">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <input type="text" name="login" id="login" class="form-control input-sm" placeholder="Login">
                            </div>

                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
                                    </div>
                                </div>
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
                                    </div>
                                </div>
                            </div>
                            <input type="submit" value="Register" class="btn btn-info btn-block">
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form:form>
</body>
</html>
