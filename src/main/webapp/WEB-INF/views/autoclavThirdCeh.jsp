<%--
  Created by IntelliJ IDEA.
  User: KIP
  Date: 11.12.2017
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Autoclav Third Department</title>
    <link rel="icon" type="image/png" href="resources/img/favicons.png">
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/stomp.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/Chart.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/moment.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/FileSaver.js"></script>
</head>
<body>

<div id="main" class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
    <div class="container">
        <div class="row">
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 col-md-offset-2 col-lg-offset-2">
                <h4 class="modal-title" id="myModalLabel" style="margin-top: 40px; text-align: center">
                    Отчет сформирован:  <i id="datePart"></i>
                    <script rel="script" type="text/javascript">
                        var currentDateTime = moment().format("YYYY-MM-DD HH:mm:ss");
                        $("#datePart").text(currentDateTime);
                    </script>
                </h4>
            </div>
        </div>
        <table class="table">
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Реальное значение температуры</span></th>
                <th><span id="realAutoclavThirdCehTemperaturaValue" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> град.</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Реальное значение давления</span></th>
                <th><span id="realAutoclavThirdCehDavlenieValue" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> бар.</th>
            </tr>
        </table>
        <div class="row">
            <div class="col-md-3 col-lg-3">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="startMark">Начало</span>
                    <input type="datetime-local" class="form-control" aria-describedby="startMark" id="startChart" name="startChart" value="2017-12-15T07:30">
                </div>
            </div>
            <div class="col-md-3 col-lg-3">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="endMark">Конец</span>
                    <input type="datetime-local" class="form-control" aria-describedby="endMark" id="endChart" name="endChart" value="2017-12-15T18:00">
                </div>
            </div>
            <div class="col-md-4 col-lg-4">
                <div>
                    <input type="button" id="generateChart" name="generateChart" onclick="sendChartBody();" class="btn btn-sm btn-success" value="Сгенерировать">
                    <a href="/" id="back" class="btn btn-sm btn-success" onclick="disconnect();" value="Сохранить график"> Назад</a>
                    <input type="button" id="saveChart" name="saveChart" onclick="saveChart();" class="btn btn-sm btn-success" value="Сохранить график">
                </div>
            </div>
        </div>
        <div class="row" style="margin-top: 10px">
            <div class="col-md-4 col-lg-4 col-">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="bufferChartMark">Буфер графика</span>
                    <input type="number" width="5" style="width: 100px;" class="form-control" aria-describedby="bufferChartMark" id="bufferChart" name="bufferChart" value="1000">
                </div>
            </div>
            <div class="col-md-4 col-lg-4 col-">
                <input type="button" id="goChart" name="goChart" onclick="onDrawChange();" class="btn btn-sm btn-success" value="Старт/Стоп">
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 col-">
                <input type="button" id="removeChart" name="removeChart" onclick="clearChart();" class="btn btn-sm btn-success" value="Стереть">
            </div>
        </div>
        <div class="row" style="margin-top: 10px; margin-left: 30%; margin-bottom: 10px">
            <a id="increase-chart" class="btn btn-sm btn-danger" onclick="increaseChart();">
                <span class="glyphicon glyphicon-plus"></span>
            </a>
            <a id="decrease-chart" class="btn btn-sm btn-danger" onclick="decreaseChart();">
                <span class="glyphicon glyphicon-minus"></span>
            </a>
            <input type="number" id="zoom-chart" name="zoom-chart" width="5" class="btn btn-sm btn-default" value="10">
            <a id="left-chart" class="btn btn-sm btn-danger" onclick="leftChart();">
                <span class="glyphicon glyphicon-arrow-left"></span>
            </a>
            <a id="right-chart" class="btn btn-sm btn-danger" onclick="rightChart();">
                <span class="glyphicon glyphicon-arrow-right"></span>
            </a>
        </div>
    </div>

    <div id="graph-container">
        <canvas id="myChart" width="500" height="320"></canvas>
    </div>
</div>

<script rel="script" type="text/javascript" src="<c:url value="/resources/js/autoclavThirdCeh.js"/>"></script>
</body>
</html>
