<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yulia
  Date: 17.07.17
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PhoneBook</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />


	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	<%----%>
    <%--<c:url value="/css/main.css" var="jstlCss" />--%>
    <%--<link href="${jstlCss}" rel="stylesheet" />--%>
</head>
<body>
<form:form role="form" action="userMainPage" modelAttribute="userName" method="post" class="form-signin">
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="https://github.com/Ju5tEgoist">Ju5tEgoist</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class=""><a href="#">Home</a></li>
                <li><a href="about">About</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="user">${userName}</a></li>
                <li><a href="createContact">Create_contact</a></li>
                <li><a href="viewAllContacts">View_all_contacts</a></li>
                <li><a href="logout">LogOut</a></li>
            </ul>
        </div>

    </div>
</nav>

<h2><c:out value="${message}"/></h2>
</form:form>
<%--<form:form>--%>
    <%--<div class="container">--%>
        <%--<div class="row centered-form">--%>
            <%--<div class="col-xs-12 col-sm-8 col-md-8 col-sm-offset-2">--%>
                <%--<div class="panel panel-default">--%>
                    <%--<div class="panel-heading">--%>
                        <%--<h3 class="panel-title">Please sign up <small>It's free!</small></h3>--%>
                    <%--</div>--%>
                    <%--<div class="panel-body">--%>
                        <%--<form:form role="form" action="registration" modelAttribute="userForm" method="post" class="form-signin">--%>
                            <%--<input type="submit" value="Create_contact" class="btn btn-info btn-block" onclick="location.href='createContact.jsp';">--%>
                            <%--<a href="viewAllContacts.jsp"> <input type="submit" value="View_all_contacts" class="btn btn-info btn-block"></a>--%>
                            <%--<a href="createContact.jsp"><input type="button" value="Create_contact"></a>--%>
                        <%--</form:form>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</form:form>--%>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
