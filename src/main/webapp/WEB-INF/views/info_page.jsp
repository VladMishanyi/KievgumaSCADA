<%--
  Created by IntelliJ IDEA.
  User: KIP-PC99
  Date: 21.04.2020
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Info</title>
    <link rel="icon" type="image/png" href="resources/img/favicons.png">
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
</head>
<body>

<jsp:include page="/WEB-INF/views/footer.jsp"/>
<table class="table">
    <tr>
        <th style="text-align: center;">
            <span style="color: red; font-family: sans-serif; font-size: 20px; font-variant: small-caps;">Видео инструкция пользования</span>
        </th>
    </tr>
    <tr>
        <td style="text-align: center;">
            <video width="1024" height="768" controls>
                <source src="<c:url value="/resources/video/info.mp4"/>" type="video/mp4">
                Your browser does not support the video tag.
            </video>
        </td>
    </tr>
</table>
</body>
