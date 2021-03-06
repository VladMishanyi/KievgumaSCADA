<%--
  Created by IntelliJ IDEA.
  User: vlad
  Date: 20/04/2020
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">KIEVGUMA LCC</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <security:authorize access="!isAuthenticated()">
                <li>
                    <form class="form-inline" style="margin-top: 8px" action="/login" method="post">
                        <div class="form-group">
                            <label class="sr-only" for="username">Username</label>
                            <input type="text" class="form-control" name="username" id="username" placeholder="Email">
                        </div>
                        <div class="form-group">
                            <label class="sr-only" for="password">Password</label>
                            <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <button type="submit" name="login-submit" id="login-submit" class="form-control btn btn-login">Login</button>
                        </div>
                    </form>
                </li>
            </security:authorize>
            <security:authorize access="isAuthenticated()">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Welcome Back, <security:authentication property="name"/></a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
            </security:authorize>
        </ul>
    </div>
</nav>
