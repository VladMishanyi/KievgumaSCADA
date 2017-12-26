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
    <title>Admin panel</title>
    <meta charset="UTF-8"/>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0"/>--%>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
    <%--<script rel="script" type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/stomp.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/angular.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/Chart.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/moment.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/html2canvas.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/canvas-toBlob.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/FileSaver.js"></script>--%>
</head>
<body>

<div class="container">
    <table class="table" style="font-family: sans-serif; font-size: 24px;">
        <tr>
            <th>Занято на диске таблицой, первый цех Бузулук ТРМ200</th>
            <th><span id="tableFirstCehBuzuluk" style="color: red"></span> byte</th>
            <th><button id="buttonFirstCehBuzuluk" onclick="genSizeTableFirstCehBuzuluk()" class="btn btn-sm btn-success">Вычитать</button></th>
        </tr>
        <tr>
            <th>Занято на диске таблицой, первый цех Камера Дозревания МПР51</th>
            <th><span id="tableFirstCehKameraDozrevanya" style="color: red"></span> byte</th>
            <th><button id="buttonFirstCehKameraDozrevanya" onclick="genSizeTableFirstCehKameraDozrevanya()" class="btn btn-sm btn-success">Вычитать</button></th>
        </tr>
        <tr>
            <th>Занято на диске таблицой, первый цех Автоклав ТРМ202</th>
            <th><span id="tableFirstCehAutoclav" style="color: red"></span> byte</th>
            <th><button id="buttonFirstCehAutoclav" onclick="genSizeTableFirstCehAutoclav()" class="btn btn-sm btn-success">Вычитать</button></th>
        </tr>
        <tr>
            <th>Занято на диске таблицой, третий цех Автоклав ТРМ202</th>
            <th><span id="tableThirdCehAutoclav" style="color: red"></span> byte</th>
            <th><button id="buttonThirdCehAutoclav" onclick="genSizeTableThirdCehAutoclav()" class="btn btn-sm btn-success">Вычитать</button></th>
        </tr>
        <tr>
            <th>Занято на диске таблицой, отдел энегетика ТРМ202</th>
            <th><span id="tableOtdelEnergetika" style="color: red"></span> byte</th>
            <th><button id="buttonOtdelEnergetika" onclick="genSizeTableOtdelEnergetika()" class="btn btn-sm btn-success">Вычитать</button></th>
        </tr>
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

    function genSizeTableFirstCehBuzuluk() {
        $.ajax({
            type: "POST",
            url: "/generateSizeTableFirstCehBuzuluk",
            dataType: "html",
            cache: false,
            success: function(data){
                $("#tableFirstCehBuzuluk").text(data);
            }
        });
    }
    function genSizeTableFirstCehKameraDozrevanya() {
        $.ajax({
            type: "POST",
            url: "/generateSizeTableFirstCehKameraDozrevanya",
            dataType: "html",
            cache: false,
            success: function(data){
                $("#tableFirstCehKameraDozrevanya").text(data);
            }
        });
    }
    function genSizeTableFirstCehAutoclav() {
        $.ajax({
            type: "POST",
            url: "/generateSizeTableFirstCehAutoclav",
            dataType: "html",
            cache: false,
            success: function(data){
                $("#tableFirstCehAutoclav").text(data);
            }
        });
    }
    function genSizeTableThirdCehAutoclav() {
        $.ajax({
            type: "POST",
            url: "/generateSizeTableThirdCehAutoclav",
            dataType: "html",
            cache: false,
            success: function(data){
                $("#tableThirdCehAutoclav").text(data);
            }
        });
    }
    function genSizeTableOtdelEnergetika() {
        $.ajax({
            type: "POST",
            url: "/generateSizeTableOtdelEnergetika",
            dataType: "html",
            cache: false,
            success: function(data){
                $("#tableOtdelEnergetika").text(data);
            }
        });
    }
    function genAmountSizeTableByte() {
        var sizeTableFirstCehBuzuluk = $("#tableFirstCehBuzuluk").text();
        var sizeTableFirstCehKameraDozrevanya = $("#tableFirstCehKameraDozrevanya").text();
        var sizeTableFirstCehAutoclav = $("#tableFirstCehAutoclav").text();
        var sizeTableThirdCehAutoclav = $("#tableThirdCehAutoclav").text();
        var sizeOtdelEnergetika = $("#tableOtdelEnergetika").text();
        var countTableByte =
            parseFloat(sizeTableFirstCehKameraDozrevanya)
            + parseFloat(sizeTableFirstCehBuzuluk)
            + parseFloat(sizeTableFirstCehAutoclav)
            + parseFloat(sizeTableThirdCehAutoclav)
            + parseFloat(sizeOtdelEnergetika);
        var countTableKByte = countTableByte / 1024;
        var countTableMByte = countTableKByte / 1024;

        $("#amountSizeTableByte").text(countTableByte);
        $("#amountSizeTableKByte").text(countTableKByte);
        $("#amountSizeTableMByte").text(countTableMByte);
        $("#tableFirstCehKameraDozrevanya").text(data);
    }
</script>
</body>
</html>
