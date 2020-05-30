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

<jsp:include page="/WEB-INF/views/admin/admin_footer.jsp"/>
<div class="sidebar">
    <a href="/info"><span class="glyphicon glyphicon-info-sign"></span>Info</a>
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
        <div class="container">
            <form action="/admin/add_user" enctype="multipart/form-data" method="post">

                <label for="role">Role</label>
                <select id="role" name="role">
                    <option value="SUPERADMIN">SUPERADMIN</option>
                    <option value="ADMIN">ADMIN</option>
                    <option value="CLIENT">CLIENT</option>
                    <option value="ANOTHER">ANOTHER</option>
                </select>

                <label for="name">Name</label>
                <input type="text" id="name" name="name" placeholder="Your name">

                <label for="login">Login</label>
                <input type="text" id="login" name="login" placeholder="Login">

                <label for="password_first">Password</label>
                <input type="password" id="password_first" name="password_first" placeholder="Password">

                <label for="confirm_password">Confirm password</label>
                <input type="password" id="confirm_password" name="confirm_password" placeholder="Confirm password">

                <label for="description">Description</label>
                <textarea id="description" name="description" placeholder="Write something.." style="height:200px"></textarea>


                ${info}
<%--                <input type="text" style="color: red" value="пароль уже существует !">--%>

                <input type="submit" class="btn btn-success" value="Submit">
            </form>

            <table class="table">
                <tr>
                    <th>Login</th>
                    <th>Role</th>
                    <th>Manage</th>
                </tr>
                <c:forEach items="${users}" var="listUsers">
                    <tr>
                        <td>${listUsers.login}</td>
                        <td>${listUsers.role.toString()}</td>
                        <td><a href="/admin/delete_user?login=${listUsers.login}" class="btn btn-danger">DELETE</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

    <div id="logger" class="tabcontent">
        <h3>Logger</h3>
        <p>This service provide information about users actions.</p>
        <form action="/admin/get_log" enctype="multipart/form-data" method="post">
            <table class="table">
                <tr>
                    <th>Период</th>
                </tr>
                <tr>
                    <td>
                        <div class="input-group input-group-sm">
                            <span class="input-group-addon" id="startMark">Начало</span>
                            <input type="datetime-local" class="form-control" aria-describedby="startMark" id="startChart" name="startChart" value="2017-12-19T07:30">
                        </div>
                    </td>
                    <td>
                        <div class="input-group input-group-sm">
                            <span class="input-group-addon" id="endMark">Конец</span>
                            <input type="datetime-local" class="form-control" aria-describedby="endMark" id="endChart" name="endChart" value="2017-12-19T18:00">
                        </div>
                    </td>
                    <td>
                        <div>
                            <input type="submit" class="btn btn-success" value="Submit">
                        </div>
                    </td>
                </tr>
            </table>
        </form>

        <table class="table">
            <tr>
                <th>Date</th>
                <th>Login</th>
                <th>Information</th>
            </tr>
            <c:forEach items="${loggers}" var="listLoggers">
                <tr>
                    <td>${listLoggers.date}</td>
                    <td>${listLoggers.name}</td>
                    <td>${listLoggers.information}</td>
                </tr>
            </c:forEach>
        </table>
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
