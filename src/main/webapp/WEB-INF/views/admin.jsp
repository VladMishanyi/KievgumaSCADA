<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2017-12-20
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Admin panel</title>
    <link href="<c:url value="/resources/img/favicons.png"/>" rel="icon" type="image/png" >
    <link href="<c:url value="/resources/css/index.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/resources/bootstrap-3.3.7/css/bootstrap.css"/>" rel="stylesheet" type="text/css" />
    <script src="<c:url value="/resources/js/jquery-3.2.1.js"/>" rel="script" type="text/javascript" ></script>
    <script src="<c:url value="/resources/bootstrap-3.3.7/js/bootstrap.js"/>" rel="script" type="text/javascript"></script>
</head>
<body>

<div class="container">
    <table class="table" style="font-family: sans-serif; font-size: 24px;">
        <tr>
            <th>Занято на диске суммарно, байт</th>
            <th><span id="amountSizeTableByte" style="color: red"></span> byte</th>
            <th><button id="buttonAmountSizeTableByte" onclick="genAmountSizeTableByte()" class="btn btn-sm btn-success">Вычитать</button></th>
        </tr>
        <tr>
            <th>Занято на диске суммарно, кило байт</th>
            <th><span id="amountSizeTableKByte" style="color: red"></span> kb</th>
        </tr>
        <tr>
            <th>Занято на диске суммарно, мега байт</th>
            <th><span id="amountSizeTableMByte" style="color: red"></span> Mb</th>
        </tr>
    </table>
</div>

<script rel="script" type="text/javascript">
    function genAmountSizeTableByte() {
        $.ajax({
            type: "POST",
            url: "/generateAmountSizeTableByte",
            dataType: "json",
            cache: false,
            success: function(data){
                var countTableByte = parseFloat(data);
                var countTableKByte = countTableByte / 1024;
                var countTableMByte = countTableKByte / 1024;
                $("#amountSizeTableByte").text(countTableByte);
                $("#amountSizeTableKByte").text(countTableKByte);
                $("#amountSizeTableMByte").text(countTableMByte);
            }
        });
    }
</script>
</body>
</html>
