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
    <link href="<c:url value="/resources/css/admin.css"/>" rel="stylesheet" type="text/css" />
    <script src="<c:url value="/resources/js/jquery-3.2.1.js"/>" rel="script" type="text/javascript" ></script>
    <script src="<c:url value="/resources/bootstrap-3.3.7/js/bootstrap.js"/>" rel="script" type="text/javascript"></script>
</head>
<body>

<div class="sidebar">
    <a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
    <a href="/"><span class="glyphicon glyphicon-home"></span> Home</a>
    <a class="tablinks" onclick="openMenu(event, 'user')" href="#"><span class="glyphicon glyphicon-user"></span> Users</a>
    <a class="tablinks" onclick="openMenu(event, 'logger')" href="#"><span class="glyphicon glyphicon-list-alt"></span> Logger</a>
    <a href="/service-desk"><span class="glyphicon glyphicon-paperclip"></span> Service Desk</a>
    <a href="/contact-desk"><span class="glyphicon glyphicon-book"></span> Contact Desk</a>
    <a class="tablinks" onclick="openMenu(event, 'memory')" id="defaultOpen" href="#"><span class="glyphicon glyphicon-floppy-disk"></span> Memory</a>
</div>

<div class="main">

    <div id="user" class="tabcontent">
        <h3>User</h3>
        <p>This service provide information about available users that could logging.</p>
    </div>

    <div id="logger" class="tabcontent">
        <h3>Logger</h3>
        <p>This service provide information about users actions.</p>
    </div>

    <div id="memory" class="tabcontent">
        <h3>Memory</h3>
        <p>This service provide information about current memory use.</p>
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

</div>

<script rel="script" type="text/javascript">
    function openMenu(evt, cityName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        document.getElementById(cityName).style.display = "block";
        evt.currentTarget.className += " active";
    }

    // Get the element with id="defaultOpen" and click on it
    document.getElementById("defaultOpen").click();

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
