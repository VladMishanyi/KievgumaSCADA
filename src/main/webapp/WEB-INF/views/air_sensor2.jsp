<%--
  Created by IntelliJ IDEA.
  User: KIP-PC99
  Date: 04.02.2021
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE HTML>
<html lang="ua">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Air sensor2</title>
    <link rel="icon" type="image/png" href="resources/img/favicons.png">
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/stomp.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/moment.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/Chart.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/FileSaver.js"></script>
</head>
<body>

<jsp:include page="/WEB-INF/views/footer.jsp"/>
<div id="main" class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
    <div class="container">

        <div class="row">
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 col-md-offset-2 col-lg-offset-2">
                <h4 class="modal-title" id="myModalLabel" style="margin-top: 40px; text-align: center">
                    Звіт сформовано:  <i id="datePart"></i>
                    <script rel="script" type="text/javascript">
                        var currentDateTime = moment().format("YYYY-MM-DD HH:mm:ss");
                        $("#datePart").text(currentDateTime);
                    </script>
                </h4>
            </div>
        </div>

        <table class="table">
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику SDS_P1, Пил 2.5 мкм</span></th>
                <th><span id="air-sensor1-SDS_P1" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> мкг/m³</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику SDS_P2, Пил 10 мкм</span></th>
                <th><span id="air-sensor1-SDS_P2" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> мкг/m³</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику BME280_temperature, Температура</span></th>
                <th><span id="air-sensor1-BME280_temperature" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> °C</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику BME280_humidity, Відносна вологість</span></th>
                <th><span id="air-sensor1-BME280_humidity" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> %</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику BME280_pressure, Атмосферний тиск</span></th>
                <th><span id="air-sensor1-BME280_pressure" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> мм.рт.ст</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику NH3, Аміак</span></th>
                <th><span id="air-sensor1-NH3" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> мкг/m³</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику CO, Монооксид вуглецю</span></th>
                <th><span id="air-sensor1-CO" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> мкг/m³</th>
            </tr>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Поточне значення на датчику NO2, Діоксид азоту</span></th>
                <th><span id="air-sensor1-NO2" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> мкг/m³</th>
            </tr>
        </table>

        <%--        <security:authorize access="isAuthenticated()">--%>
        <table class="table">
            <tr>
                <th>Інформація</th>
            </tr>
            <tr>
                <td>
                    <jsp:include page="/WEB-INF/views/info/info.jsp"/>
                </td>
            </tr>
        </table>

        <table class="table">
            <tr>
                <th>Графік</th>
            </tr>
            <tr>
                <td>
                    <div>
                        <div class="input-group input-group-sm">
                            <span class="input-group-addon" id="startMark">Початок</span>
                            <input type="datetime-local" class="form-control" aria-describedby="startMark" id="startChart" name="startChart" value="2017-12-19T07:30">
                        </div>
                    </div>
                </td>
                <td>
                    <div>
                        <div class="input-group input-group-sm">
                            <span class="input-group-addon" id="endMark">Кінець</span>
                            <input type="datetime-local" class="form-control" aria-describedby="endMark" id="endChart" name="endChart" value="2017-12-19T18:00">
                        </div>
                    </div>
                </td>
                <td>
                    <div>
                        <div>
                            <input type="button" id="generateChart" name="generateChart" onclick="sendChartBody();" class="btn btn-sm btn-success" value="Згенерувати">
                            <a href="/" id="back" class="btn btn-sm btn-success" onclick="disconnect();" value="Сохранить график"> Назад</a>
                            <input type="button" id="saveChart" name="saveChart" onclick="saveChart();" class="btn btn-sm btn-success" value="Зберегти графік">
                        </div>
                    </div>
                </td>
            </tr>
        </table>

        <table class="table">
            <tr>
                <th>Тред</th>
            </tr>
            <tr>
                <td>
                    <div class="input-group input-group-sm">
                        <span class="input-group-addon" id="bufferChartMark">Буфер графіку</span>
                        <input type="number" width="5" style="width: 100px;" class="form-control" aria-describedby="bufferChartMark" id="bufferChart" name="bufferChart" value="10000">
                    </div>
                </td>
                <td>
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
                </td>
                <td>
                    <h6 style="font-weight: bold;">Старт/Стоп</h6>
                    <label class="switch">
                        <input type="checkbox" id="id_switch_tred">
                        <span class="slider round"></span>
                    </label>
                    <input type="button" id="removeChart" name="removeChart" onclick="clearChart();" class="btn btn-sm btn-success" value="Стерти">
                </td>
            </tr>
        </table>
        <%--        </security:authorize>--%>
    </div>

    <%--    <security:authorize access="isAuthenticated()">--%>
    <div id="graph-container">
        <canvas id="myChart" width="500" height="320"></canvas>
    </div>
    <%--    </security:authorize>--%>

    <%--    <security:authorize access="!isAuthenticated()">--%>
    <%--        <jsp:include page="/WEB-INF/views/restriction.jsp"/>--%>
    <%--    </security:authorize>--%>
</div>

<script rel="script" type="text/javascript" src="<c:url value="/resources/js/air_sensor2.js"/>"></script>
</body>
</html>
