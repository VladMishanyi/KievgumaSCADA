<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018-02-07
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0"/>--%>
    <title>FirstCehSmesitel1</title>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/stomp.js"></script>
    <%--<script rel="script" type="text/javascript" src="resources/js/angular.js"></script>--%>
    <script rel="script" type="text/javascript" src="resources/js/Chart.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/moment.js"></script>
    <%--<script rel="script" type="text/javascript" src="resources/js/html2canvas.js"></script>--%>
    <%--<script rel="script" type="text/javascript" src="resources/js/canvas-toBlob.js"></script>--%>
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
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Реальное значение тока</span></th>
                <th><span id="firstCehSmesitel1Tok" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> А</th>
            </tr>
        </table>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-3 col-lg-3">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="startMark">Начало</span>
                    <input type="datetime-local" class="form-control" aria-describedby="startMark" id="startChart" name="startChart" value="2018-02-07T07:30">
                </div>
            </div>
            <div class="col-md-3 col-lg-3">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="endMark">Конец</span>
                    <input type="datetime-local" class="form-control" aria-describedby="endMark" id="endChart" name="endChart" value="2018-02-10T18:00">
                </div>
            </div>
            <div class="col-md-4 col-lg-4">
                <div>
                    <input type="button" id="generateChart" name="generateChart" onclick="genChart();" class="btn btn-sm btn-success" value="Сгенерировать">
                    <a href="/" id="back" class="btn btn-sm btn-success" onclick="disconnect()" value="Сохранить график"> Назад</a>
                    <input type="button" id="saveChart" name="saveChart" onclick="saveChart();" class="btn btn-sm btn-success" value="Сохранить график">
                </div>
            </div>

        </div>
    </div>

    <div class="container" style="margin-top: 10px; margin-left: 30%; margin-bottom: 10px">
        <div>
            <div>
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
    </div>

    <div id="graph-container">
        <canvas id="myChart" width="400" height="150"></canvas>
    </div>
</div>

<script rel="script" type="text/javascript">
    var globalX = Array();
    var globalY1 = Array();
    var increaseDecriaseZoom = 0;
    var leftRightPosition = 0;

    function genChart() {
//        clearChart();
        var x = Array();
        var y1 = Array();
//        var y2 = Array();
        var vStart = document.getElementById("startChart").value;
        var vEnd = document.getElementById("endChart").value;
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/generateChartFirstCehSmesitel1KMSF1",
            data: JSON.stringify({'start' : vStart, 'end' : vEnd}),
            dataType: "json",
            cache: false,
            success: function(data){
                for (var i in data){
                    if (data.hasOwnProperty(i)){
                        try {
                            x[i] = moment(data[i]["date"]).utc().format("YYYY-MM-DD HH:mm:ss");
                            y1[i] = data[i]["channel1"];
//                            y2[i] = data[i]["channel2"];
                        }catch (err){
                            console.log('Ошибка ' + err.name + ":" + err.message + "\n" + err.stack);
                        }
                    }
                }
                globalX = x;
                globalY1 = y1;
                increaseDecriaseZoom = 0;
                leftRightPosition = 0;
                buildChart(x, y1);
            }
        });
    }

    function increaseChart() {
        var increaseZoom = document.getElementById("zoom-chart").value;
        var increaseArrayX = Array();
        var increaseArrayY1 = Array();
//        console.log("in increase bock :"+increaseDecriaseZoom + " globalX :" +globalX.length+" zoom :"+increaseZoom);
        if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
            increaseDecriaseZoom = increaseDecriaseZoom + Number(increaseZoom);
            console.log("in increase body :"+increaseDecriaseZoom);
            var from = increaseDecriaseZoom - leftRightPosition;
            console.log("in increase body from:"+from);
            var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
            console.log("in increase body to:"+to);
            increaseArrayX = globalX.slice(from,to);
            increaseArrayY1 = globalY1.slice(from,to);
            buildChart(increaseArrayX, increaseArrayY1);
        }
    }

    function decreaseChart() {
        var increaseZoom = document.getElementById("zoom-chart").value;
        var increaseArrayX = Array();
        var increaseArrayY1 = Array();
//        console.log("in decrease bock "+increaseDecriaseZoom + " globalX :" +globalX.length+" zoom :"+increaseZoom);
        if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
            increaseDecriaseZoom = increaseDecriaseZoom - Number(increaseZoom);
            console.log("in decrease body :"+increaseDecriaseZoom);
            var from = increaseDecriaseZoom - leftRightPosition;
            console.log("in decrease body from:"+from);
            var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
            console.log("in decrease body to:"+to);
            increaseArrayX = globalX.slice(from,to);
            increaseArrayY1 = globalY1.slice(from,to);
            buildChart(increaseArrayX, increaseArrayY1);
        }
    }

    function leftChart() {
        var increaseZoom = document.getElementById("zoom-chart").value;
        var increaseArrayX = Array();
        var increaseArrayY1 = Array();
//        console.log("in left bock :"+leftRightPosition + " globalX :" +globalX.length+" zoom :"+increaseZoom);
        if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
            leftRightPosition = leftRightPosition + Number(increaseZoom);
            console.log("in left body :"+leftRightPosition);
            var from = increaseDecriaseZoom - leftRightPosition;
            console.log("in left body from:"+from);
            var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
            console.log("in left body to:"+to);
            increaseArrayX = globalX.slice(from,to);
            increaseArrayY1 = globalY1.slice(from,to);
            buildChart(increaseArrayX, increaseArrayY1);
        }
    }

    function rightChart() {
        var increaseZoom = document.getElementById("zoom-chart").value;
        var increaseArrayX = Array();
        var increaseArrayY1 = Array();
//        console.log("in right bock "+increaseDecriaseZoom + " globalX :" +globalX.length+" zoom :"+increaseZoom);
        if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
            leftRightPosition  = leftRightPosition  - Number(increaseZoom);
            console.log("in right body :"+leftRightPosition);
            var from = increaseDecriaseZoom - leftRightPosition;
            console.log("in right body from:"+from);
            var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
            console.log("in right body to:"+to);
            increaseArrayX = globalX.slice(from,to);
            increaseArrayY1 = globalY1.slice(from,to);
            buildChart(increaseArrayX, increaseArrayY1);
        }
    }

    function clearChart(){
//        var canvas = document.getElementById("myChart");
//        var context = canvas.getContext('2d');
//        var startX = 0;
//        var startY = 0;
//        var height = 10000;
//        var width = 10000;
//        context.clearRect(startX, startY, height, width);
//        context.clearShadow();
        $('#myChart').remove(); // this is my <canvas> element
        $('#graph-container').append('<canvas id="myChart" width="400" height="150"><canvas>');
    }

    function buildChart(xCord, y1Cord) {
        clearChart();//Uncaught TypeError: Cannot read property !!!!!!!!!!!!!!!!!!
        var start = document.getElementById("startChart").value;
        var end = document.getElementById("endChart").value;
        var vTitle = 'Объект/Киевгума/1й Цех/Смеситель_1'+' с '+start.toString()+' по '+end.toString();
        var ctx = document.getElementById("myChart");
        var myChart = new Chart(ctx, {
            type: 'line',
            data: {
                labels: xCord,
                datasets: [
                    {
                        label: 'Ток',
                        backgroundColor: '#00CC00',
                        borderColor: '#00CC00',
                        borderWidth: 5,
                        borderDash: [],
                        borderDashOffset: 0.0,
                        borderCapStyle: 'butt',
                        borderJoinStyle: 'miter',
                        fill: false,
                        lineTension: 0.1,
                        pointBackgroundColor: '#000000',
                        pointBorderColor: '#FF0000',
                        pointBorderWidth: 0,//1
                        pointRadius: 0,//1
                        pointHitRadius: 10,
                        pointHoverBackgroundColor: '#000000',
                        pointHoverBorderColor: '#FF0000',
                        pointHoverBorderWidth: 2,
                        pointHoverRadius: 5,
                        showLine: true,
                        spanGaps: false,
                        steppedLine: false,
                        data: y1Cord,
                    }
//                    ,
//                    {
//                        label: 'Давление',
//                        backgroundColor: '#ffff00',
//                        borderColor: '#985f0d',
//                        borderWidth: 1,
//                        borderDash: [],
//                        borderDashOffset: 0.0,
//                        borderCapStyle: 'butt',
//                        borderJoinStyle: 'miter',
//                        fill: true,
//                        lineTension: 0.1,
//                        pointBackgroundColor: '#000000',
//                        pointBorderColor: '#FF0000',
//                        pointBorderWidth: 1,
//                        pointRadius: 1,
//                        pointHitRadius: 10,
//                        pointHoverBackgroundColor: '#000000',
//                        pointHoverBorderColor: '#FF0000',
//                        pointHoverBorderWidth: 2,
//                        pointHoverRadius: 5,
//                        showLine: true,
//                        spanGaps: false,
//                        steppedLine: false,
//                        data: y2Cord,
//                    }
                ]
            },
            options: {
                layout: {
                    padding: {
                        left: 50,
                        right: 0,
                        top: 0,
                        bottom: 0
                    }
                },
                legend: {
                    display: true,
                    position: 'right',
                    fullWidth: true,//Marks that this box should take the full width of the canvas (pushing down other boxes). This is unlikely to need to be changed in day-to-day use.
                    reverse: false,//Legend will show datasets in reverse order.
                    labels: {
                        boxWidth: 40,
                        fontSize: 22,
                        fontStyle: 'bold',
                        fontColor: '#985f0d',
                        fontFamily: 'sans-sherif',
                        padding: 10
                    }
                },
                title: {
                    display: true,
                    position: 'top',
                    fontSize: 22,
                    fontFamily: 'sans-sherif',
                    fontColor: '#985f0d',
                    fontStyle: 'bold',
                    padding: 10,
                    lineHeight: 1.2,
                    text: vTitle
                },
                tooltips: {
                    enabled: true,
                    mode: 'nearest',
                    intersect: true,//if true, the tooltip mode applies only when the mouse position intersects with an element. If false, the mode will be applied at all times.
                    position: 'average',
                    backgroundColor: '#100000',
                    titleFontFamily: 'Arial',
                    titleFontSize: 20,
                    titleFontStyle: 'italic',
                    titleFontColor: '#ffffff',
                    titleSpacing: 2,
                    titleMarginBottom: 6,
                    bodyFontFamily: 'Arial',
                    bodyFontSize: 22,
                    bodyFontStyle: 'normal',
                    bodyFontColor: '#ffffff',
                    bodySpacing: 2,
                    footerFontFamily: 'Helvetica',
//                    footerFontSize: 40,
//                    footerFontStyle: 'bold',
//                    footerFontColor: '#ffffff',
//                    footerSpacing: 2,
//                    footerMarginTop: 6,
                    xPadding: 6,
                    yPadding: 6,
                    caretPadding: 2,
                    caretSize: 5,
                    cornerRadius: 6,
                    multiKeyBackground: '#ffffff',
                    displayColors: 'true',
                    borderColor: '#000000',
                    borderWidth: 0
                },
                elements: {
                    point: {
                        radius: 3,
                        pointStyle: 'circle',
                        backgroundColor: '#000000',
                        borderWidth: 1,
                        borderColor: '#000000',
                        hitRadius: 1,
                        hoverRadius: 4,
                        hoverBorderWidth: 1
                    },
                    line: {
                        tension: 0,
                        backgroundColor: '#000000',
                        borderWidth: 3,
                        borderColor: '#000000',
                        borderCapStyle: 'butt',
                        borderDashOffset: 0,
                        borderJoinStyle: 'miter',
                        capBezierPoints: true,
                        fill: true,
                        stepped: false
                    },
                    rectangle: {
                        backgroundColor: '#000000',
                        borderWidth: 0,
                        borderColor: '#000000',
                        borderSkipped: 'bottom'
                    },
                    arc: {
                        backgroundColor: '#000000',
                        borderColor: '#ffffff',
                        borderWidth: 2
                    }
                },
                scales: {
                    yAxes: [{
                        ticks: {
                            beginAtZero:true, // start chart from zero point
                            fontColor: '#985f0d',
                            fontFamily: 'sans-sherif',
                            fontSize: 22,
                            fontStyle: 'bold',
//                            stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking
                        },
                        gridLines: {
                            color: '#985f0d',
                            lineWidth: 1
                        }
                    }],
                    xAxes: [{
                        ticks: {
                            beginAtZero:true, // start chart from zero point
                            fontColor: '#985f0d',
                            fontFamily: 'sans-sherif',
                            fontSize: 22,
                            fontStyle: 'bold',
//                            stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking
                        },
                        gridLines: {
                            color: '#985f0d',
                            lineWidth: 1
                        }
                    }]
                },
                animation: {
                    duration: 0,// general animation time
                    easing: 'easeOutQuart',
                },
                hover: {
                    intersect: true,//if true, the hover mode only applies when the mouse position intersects an item on the chart.
                    axis: 'x',//Can be set to 'x', 'y', or 'xy' to define which directions are used in calculating distances.
                    animationDuration: 0,// duration of animations when hovering an item
                },
                responsiveAnimationDuration: 0,// animation duration after a resize
                responsive: true,// Resizes the chart canvas when its container does
                maintainAspectRatio: true,// Maintain the original canvas aspect ratio (width / height) when resizing.
                showLines: true,//If false, the line is not drawn for this dataset.
                spanGaps: false,//If true, lines will be drawn between points with no or null data. If false, points with NaN data will create a break in the line
                // This chart will not respond to mousemove, etc
                events: ['click']
            }
        });
    }

    function saveChart() {
        $("#myChart").get(0).toBlob(function(blob) {
            var currentDateTime = moment().format("YYYY-MM-DD HH:mm:ss");
            saveAs(blob, currentDateTime+"_chart");
        });
    };
</script>

<script type="text/javascript">
    var stompClient = null;

    $(document).ready(function () {
        connect();
        $("#connect").prop("disabled", connected);
    });

    function setConnected(connected) {
        $("#connect").prop("disabled", connected);
        $("#disconnect").prop("disabled", !connected);
    }

    function connect() {
        var socket = new SockJS('/guide-websocket');
        stompClient = Stomp.over(socket);
        stompClient.connect({}, function(frame) {
            setConnected(true);
            console.log('Connected: ' + frame);
            stompClient.subscribe('/topic/firstCehSmesitel1KMSF1', function(resultTrm){
                showTrmBody(JSON.parse(resultTrm.body));
            });
        });
    }

    function disconnect() {
        if (stompClient != null){
            stompClient.disconnect();
        }
        setConnected(false);
        console.log("Disconnected");
    }

    function showTrmBody(trmBody){
        var tempFormat = trmBody.channel1;
        $("#firstCehSmesitel1Tok").text(tempFormat);
    }
</script>
</body>
</html>

