<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2017-05-22
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Kievguma</title>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <%--<link rel="stylesheet" type="text/css" href="resources/css/ModalPopup.css">--%>

    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
    <%--<script rel="script" type="text/javascript" src="resources/js/ModalPopup.js"></script>--%>
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
<div id="main">
    <img src="resources/img/kievguma_3d.jpg" alt="kievguma_3d">
    <svg height="1160" width="2000">
        <a id="firstDepartment" class="item" data-toggle="modal" data-target=".img-firstCeh-modal">
            <polygon points="969,406 1323,512 1064,756 806,654 860,613 776,577 874,507 834,491"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="kotelnya" class="item" href="#">
            <polygon points="1038,898 1122,935 992,1078 818,991 904,911 990,947"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="vodopodgotovka" class="item" href="#">
            <polygon points="710,878 770,869 780,914 720,924"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="tp" class="item" href="#">
            <polygon points="688,471 735,488 635,550 589,533"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="skladmain" class="item" href="#">
            <polygon points="398,367 678,467 577,525 441,397 382,377"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="sklad" class="item" href="#">
            <polygon points="720,138 758,145 407,296 371,285"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="office2" class="item" data-toggle="modal" data-target=".img-secondOffice-modal">
            <polygon points="1077,265 1140,283 920,427 851,404"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="thirdceh" class="item" data-toggle="modal" data-target=".img-thirdceh-modal">
            <polygon points="1153,314 1474,401 1337,535 1338,507 1015,411"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="fourthceh" class="item" href="#">
            <polygon points="1173,206 1513,285 1509,299 1539,307 1485,359 1087,259"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="secondceh" class="item" href="#">
            <polygon points="1250,162 1610,240 1567,279 1529,269 1522,275 1185,198"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="mainoffice" class="item" href="#">
            <polygon points="1037,94 1204,130 1166,150 996,112"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="sevenceh" class="item" href="#">
            <polygon points="921,147 1086,185 878,297 742,259 700,281 650,265 757,214 770,217"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="motorservice" class="item" href="#">
            <polygon points="745,266 868,302 833,320 710,283"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="rmc" class="item" href="#">
            <polygon points="638,268 824,326 759,361 569,299"/>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="pressform" class="item" href="#">
            <polygon points="561,302 752,364 696,394 505,329"/>
            Sorry, your browser does not support inline SVG.
        </a>
    </svg>
    <div class="modal fade img-secondOffice-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <%--<div class="modal-content">--%>
                <%--<div class="modal-header">--%>
                    <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>--%>
                    <%--<h4 class="modal-title" id="myModalLabel" >Второй корпус (second office)</h4>--%>
                <%--</div>--%>
                <%--<div class="modal-body">--%>
                    <img src="resources/img/secondOffice.jpg">
                <%--</div>--%>
                <%--<div class="modal-footer">--%>
                    <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                <%--</div>--%>
                <svg height="360" width="1085">
                    <%--<a id="energeticsRoom" class="item" data-toggle="modal" data-target=".energeticInfo">--%>
                        <%--<polygon points="230,10 490,10 490,135 230,135"/>--%>
                        <%--Sorry, your browser does not support inline SVG.--%>
                    <%--</a>--%>
                    <a id="energeticsRoom" class="item" href="/energetics">
                        <polygon points="230,10 490,10 490,135 230,135"/>
                        Sorry, your browser does not support inline SVG.
                    </a>
                </svg>
            <%--</div>--%>
        </div>
    </div>
    <div class="modal fade img-thirdceh-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
                <img src="resources/img/kievguma_zone_3_crop_1000.jpg">
                <svg height="1000" width="580">
                    <a id="autoclavThidCeh" class="item" href="/autoclavThirdCeh">
                        <polygon points="450,55 485,55 485,128 450,128"/>
                        Sorry, your browser does not support inline SVG.
                    </a>
                    <a id="autoclavFirstCeh" class="item" href="/firstCehAutoclav">
                        <polygon points="505,55 540,55 540,128 505,128"/>
                        Sorry, your browser does not support inline SVG.
                    </a>
                </svg>
        </div>
    </div>
    <div class="modal fade img-firstCeh-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kievguma_zone_1_crop_1000.jpg">
            <svg height="1109" width="1001">
                <a id="FirstCehKameraDozrevanya" class="item" href="/firstCehKameraDozrevanya">
                    <polygon points="325,480 370,480 370,580 325,580"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="FirstCehBuzuluk" class="item" href="/firstCehBuzuluk">
                    <polygon points="410,480 455,480 455,580 410,580"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>


    <%--<div id="mainPrint" class="modal fade energeticInfo" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">--%>
        <%--<div class="modal-dialog modal-lg" role="document">--%>
            <%--<div class="modal-content">--%>
                <%--<div class="modal-header">--%>
                    <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>--%>
                <%--</div>--%>
                <%--<div class="modal-body">--%>
                    <%--<h4 class="modal-title" id="myModalLabel">--%>
                        <%--Отчет сформирован:  <i id="datePart"></i>--%>
                        <%--<script rel="script" type="text/javascript">--%>
                            <%--var currentDateTime = moment().format("YYYY-MM-DD HH:mm:ss");--%>
                            <%--$("#datePart").text(currentDateTime);--%>
                        <%--</script>--%>
                    <%--</h4>--%>
                    <%--<h1>Реальное значение температуры <p id="realTrmValue"></p></h1>--%>
                    <%--<h2>Объект/Киевгума/Отдел ГЭ/Температура помещения</h2>--%>
                    <%--<canvas id="myChart" width="400" height="400"></canvas>--%>
                    <%--<div class="container">--%>
                        <%--<div class="row">--%>
                            <%--<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">--%>
                                <%--<p>Начало</p><input type="datetime-local" id="startChart" name="startChart" value="2017-07-24T15:35">--%>
                            <%--</div>--%>
                            <%--<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">--%>
                                <%--<input type="button" id="generateChart" name="generateChart" onclick="genChart();" class="btn btn-sm btn-success" value="Сгенерировать">--%>
                                <%--<input type="button" id="saveChart" name="saveChart" onclick="saveChart();" class="btn btn-sm btn-success" value="Сохранить график">--%>
                            <%--</div>--%>
                            <%--<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">--%>
                                <%--<p>Конец</p><input type="datetime-local" id="endChart" name="endChart" value="2017-07-24T15:40">--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="modal-footer">--%>
                    <%--<button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button>--%>
                <%--</div>--%>
            <%--</div>>--%>
        <%--</div>>--%>
    <%--</div>--%>
</div>


<%--<script rel="script" type="text/javascript" >--%>
    <%--$("generateChart").click(function () {--%>

    <%--});--%>
<%--</script>--%>
<%--<script rel="script" type="text/javascript">--%>

    <%--function genChart() {--%>
        <%--var server = Array();--%>
        <%--var x = Array();--%>
        <%--var y = Array();--%>
        <%--var vStart = document.getElementById("startChart").value;--%>
        <%--var vEnd = document.getElementById("endChart").value;--%>
        <%--console.log("start: "+vStart);--%>
        <%--console.log("end: "+vEnd);--%>
        <%--console.log("button work");--%>
        <%--$.ajax({--%>
            <%--type: "POST",--%>
            <%--contentType: "application/json",--%>
            <%--url: "/generateChart",--%>
            <%--data: JSON.stringify({'start' : vStart, 'end' : vEnd}),--%>
            <%--dataType: "json",--%>
<%--//            data: "start="+vStart+"&end="+vEnd,--%>
<%--//            dataType: "html",--%>
            <%--cache: false,--%>
            <%--success: function(data){--%>
                <%--console.log(data);--%>
<%--//                server = JSON.parse(data);--%>
                <%--server = data;--%>
                <%--for (var i in server){--%>
                    <%--if (server.hasOwnProperty(i)){--%>
                        <%--try {--%>
                            <%--x[i] = moment(server[i]["date"]).format("YYYY-MM-DD HH:mm:ss");--%>
                            <%--y[i] = server[i]["value3"];--%>
                            <%--console.log("x"+i+" :"+x[i]);--%>
                            <%--console.log("y"+i+" :"+y[i]);--%>
                            <%--buildChart(x, y);--%>
                        <%--}catch (err){--%>
                            <%--console.log('Ошибка ' + err.name + ":" + err.message + "\n" + err.stack);--%>
                        <%--}--%>
                    <%--}--%>
                <%--}--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>
    <%--function buildChart(xCord, yCord) {--%>
        <%--var ctx = document.getElementById("myChart");--%>
        <%--var myChart = new Chart(ctx, {--%>
            <%--type: 'line',--%>
            <%--data: {--%>
                <%--labels:--%>
                <%--xCord--%>
<%--//                ["2017-07-19 08:10:00", "2017-07-20 08:10:00", "2017-07-21 08:10:00", "2017-07-21 08:10:00", "2017-07-22 08:10:00",--%>
<%--//                "2017-07-23 08:10:00", "2017-07-24 08:10:00", "2017-07-25 08:10:00", "2017-07-26 08:10:00", "2017-07-27 08:10:00",--%>
<%--//                "2017-07-27 08:10:00", "2017-07-28 08:10:00", "2017-07-29 08:10:00", "2017-07-30 08:10:00", "2017-07-31 08:10:00",--%>
<%--//                "2017-08-01 08:10:00", "2017-08-02 08:10:00", "2017-08-03 08:10:00", "2017-08-04 08:10:00", "2017-08-05 08:10:00",--%>
<%--//                "2017-08-06 08:10:00", "2017-08-07 08:10:00", "2017-08-08 08:10:00", "2017-08-09 08:10:00", "2017-08-10 08:10:00",--%>
<%--//                "2017-08-11 08:10:00", "2017-08-12 08:10:00", "2017-08-13 08:10:00", "2017-08-14 08:10:00", "2017-08-15 08:10:00",--%>
<%--//                "2017-08-16 08:10:00", "2017-08-17 08:10:00", "2017-08-18 08:10:00", "2017-08-19 08:10:00", "2017-08-20 08:10:00",--%>
<%--//                "2017-08-21 08:10:00", "2017-08-22 08:10:00", "2017-08-23 08:10:00", "2017-08-24 08:10:00", "2017-08-25 08:10:00",--%>
<%--//                "2017-08-26 08:10:00", "2017-08-27 08:10:00", "2017-08-28 08:10:00", "2017-08-29 08:10:00", "2017-08-30 08:10:00"]--%>

                <%--,--%>
                <%--datasets: [--%>
                    <%--{--%>
                        <%--label: 'Температура',--%>
                        <%--backgroundColor: 'rgba(200, 200, 200, 1)',--%>
                        <%--borderColor: 'rgba(253, 224, 181, 1)',--%>
                        <%--borderWidth: 3,--%>
                        <%--borderDash: [],--%>
                        <%--borderDashOffset: 0.0,--%>
                        <%--borderCapStyle: 'butt',--%>
                        <%--borderJoinStyle: 'miter',--%>
                        <%--fill: true,--%>
                        <%--lineTension: 0.1,--%>
                        <%--pointBackgroundColor: "#ffff",--%>
                        <%--pointBorderColor: 'rgba(75, 192, 64, 1)',--%>
                        <%--pointBorderWidth: 1,--%>
                        <%--pointRadius: 1,--%>
                        <%--pointHitRadius: 10,--%>
                        <%--pointHoverBackgroundColor: 'rgba(75, 192, 192, 1)',--%>
                        <%--pointHoverBorderColor: 'rgba(220, 220, 220, 1)',--%>
                        <%--pointHoverBorderWidth: 2,--%>
                        <%--pointHoverRadius: 5,--%>
                        <%--data:--%>
                        <%--yCord--%>
<%--//                        [12, 19, 3, 5, 2,--%>
<%--//                        3, 54, 23, 25, 45,--%>
<%--//                        76, 32, 35, 12, 5,--%>
<%--//                        6, 2, 3, 2, 5,--%>
<%--//                        76, 62, 75, 52, 85,--%>
<%--//                        56, 52, 55, 52, 55,--%>
<%--//                        86, 82, 85, 82, 85,--%>
<%--//                        96, 92, 95, 92, 95,--%>
<%--//                        50.2, 32.4, 18.4, 61.3, 55.3]--%>

                    <%--}--%>
<%--//                    ,--%>
<%--//                    {--%>
<%--//                        label: 'My Second',--%>
<%--//                        backgroundColor: 'rgba(99, 99, 99, 1)',--%>
<%--//                        fill: true,--%>
<%--//                        lineTension: 0.1,--%>
<%--//                        borderColor: 'rgba(75, 75, 64, 1)',--%>
<%--//                        borderCapStyle: 'butt',--%>
<%--//                        borderDash: [],--%>
<%--//                        borderDashOffset: 0.0,--%>
<%--//                        borderJoinStyle: 'miter',--%>
<%--//                        pointBorderColor: 'rgba(75, 72, 192, 1)',--%>
<%--//                        pointBackgroundColor: "#ffff",--%>
<%--//                        pointBorderWidth: 1,--%>
<%--//                        pointHoverRadius: 5,--%>
<%--//                        pointHoverBackgroundColor: 'rgba(75, 72, 192, 1)',--%>
<%--//                        pointHoverBorderColor: 'rgba(220, 220, 220, 1)',--%>
<%--//                        pointHoverBorderWidth: 2,--%>
<%--//                        pointRadius: 1,--%>
<%--//                        pointHitRadius: 10,--%>
<%--//                        data: [100, 20, 60, 20, 80, 55, 90]--%>
<%--//                    }--%>
                <%--]--%>
            <%--},--%>
            <%--options: {--%>
                <%--scales: {--%>
                    <%--yAxes: [{--%>
                        <%--ticks: {--%>
                            <%--beginAtZero:true, // start chart from zero point--%>
                            <%--fontColor: '#FFFF',--%>
                            <%--fontFamily: 'sans-sherif',--%>
                            <%--fontSize: 22,--%>
                            <%--fontStyle: 'bold',--%>
                            <%--stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking--%>
                        <%--}--%>
<%--//                    ,--%>
<%--//                    scale: {--%>
<%--//                        fontColor: '#FFFF',--%>
<%--//                        fontFamily: 'sans-sherif',--%>
<%--//                        fontSize: 22,--%>
<%--//                        fontStyle: 'bold'--%>
<%--//                    }--%>
                        <%--,--%>
                        <%--gridLines: {--%>
                            <%--color: '#FFFF',--%>
                            <%--lineWidth: 5--%>
                        <%--}--%>
                    <%--}],--%>
                    <%--xAxes: [{--%>
                        <%--ticks: {--%>
                            <%--beginAtZero:true, // start chart from zero point--%>
                            <%--fontColor: '#FFFF',--%>
                            <%--fontFamily: 'sans-sherif',--%>
                            <%--fontSize: 22,--%>
                            <%--fontStyle: 'bold',--%>
                            <%--stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking--%>
                        <%--}--%>
<%--//                    ,--%>
<%--//                    scaleLabel: {--%>
<%--//                        fontColor: '#FFFF',--%>
<%--//                        fontFamily: 'sans-sherif',--%>
<%--//                        fontSize: 22,--%>
<%--//                        fontStyle: 'bold'--%>
<%--//                    }--%>
                        <%--,--%>
                        <%--gridLines: {--%>
                            <%--color: '#FFFF',--%>
                            <%--lineWidth: 5--%>
                        <%--}--%>
                    <%--}]--%>
                <%--},--%>
                <%--animation: {--%>
                    <%--duration: 0, // general animation time--%>
                <%--},--%>
                <%--hover: {--%>
                    <%--animationDuration: 0, // duration of animations when hovering an item--%>
                <%--},--%>
                <%--responsiveAnimationDuration: 0, // animation duration after a resize--%>
                <%--responsive: true, // Resizes the chart canvas when its container does--%>
                <%--maintainAspectRatio: true, // Maintain the original canvas aspect ratio (width / height) when resizing.--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>

    <%--function printChart() {--%>
        <%--var mywindow = window.open('', 'PRINT', 'height=400,width=600');--%>

        <%--mywindow.document.write('<html><head><title>' + document.title  + '</title>');--%>
        <%--mywindow.document.write('</head><body >');--%>
        <%--mywindow.document.write('<h1>' + document.title  + '</h1>');--%>
        <%--mywindow.document.write(document.getElementById('mainPrint').innerHTML);--%>
        <%--mywindow.document.write('</body></html>');--%>

        <%--mywindow.document.close(); // necessary for IE >= 10--%>
        <%--mywindow.focus(); // necessary for IE >= 10*/--%>

        <%--mywindow.print();--%>
        <%--mywindow.close();--%>

        <%--return true;--%>
    <%--}--%>

    <%--function printCanvas() {--%>
        <%--var dataUrl = document.getElementById('myChart').toDataURL(); //attempt to save base64 string to server using this var--%>
        <%--var windowContent = '<!DOCTYPE html>';--%>
        <%--windowContent += '<html>';--%>
        <%--windowContent += '<head><title>Print canvas</title></head>';--%>
        <%--windowContent += '<body>';--%>
        <%--windowContent += '<img src="' + dataUrl + '">';--%>
        <%--windowContent += '</body>';--%>
        <%--windowContent += '</html>';--%>
        <%--var printWin = window.open('','','width=400,height=600');--%>
        <%--printWin.document.open();--%>
        <%--printWin.document.write(windowContent);--%>
        <%--printWin.document.close();--%>
        <%--printWin.focus();--%>
        <%--printWin.print();--%>
        <%--printWin.close();--%>
    <%--}--%>

    <%--function imTry() {--%>
        <%--html2canvas($('#myChart'), {--%>
            <%--onrendered: function(canvas) {--%>
                <%--var imgData = canvas.toDataURL('image/jpeg');--%>
                <%--var windowContent = '<!DOCTYPE html>';--%>
                <%--windowContent += '<html>';--%>
                <%--windowContent += '<head><title>Print canvas</title></head>';--%>
                <%--windowContent += '<body>';--%>
                <%--windowContent += '<img src="' + imgData + '">';--%>
                <%--windowContent += '</body>';--%>
                <%--windowContent += '</html>';--%>
                <%--var printWin = window.open('', '', 'width=400,height=600');--%>
                <%--printWin.document.open();--%>
                <%--printWin.document.write(windowContent);--%>
                <%--printWin.document.close();--%>
                <%--printWin.focus();--%>
                <%--printWin.print();--%>
                <%--printWin.close();--%>
                <%--return false;--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>

    <%--function saveChart() {--%>
        <%--$("#myChart").get(0).toBlob(function(blob) {--%>
            <%--var currentDateTime = moment().format("YYYY-MM-DD HH:mm:ss");--%>
            <%--saveAs(blob, currentDateTime+"_chart");--%>
        <%--});--%>
    <%--};--%>
<%--</script>--%>

    <%--<div class="container">--%>
        <%--<div class="row">--%>
            <%--<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">--%>
            <%--</div>--%>
            <%----%>
        <%--</div>--%>
    <%--</div>--%>

    <%--<div class="bodyOutput">--%>
        <%--<p class="status" id="status1"></p>--%>
        <%--<input type="button" id="outPut1" onclick="sendReg0Bit0();" class="btn btn-sm btn-success" name="outPut1" value="ВЫХОД_1">--%>
    <%--</div>--%>

    <%--<div class="bodyOutput">--%>
        <%--<p class="status" id="status2"></p>--%>
        <%--<input type="button" id="outPut2" onclick="sendReg0Bit1();" class="btn btn-sm btn-success" name="outPut2" value="ВЫХОД_2">--%>
    <%--</div>--%>

    <%--<div class="bodyOutput">--%>
        <%--<p class="status" id="status3"></p>--%>
        <%--<input type="button" id="outPut3" onclick="sendReg0Bit2();" class="btn btn-sm btn-success" name="outPut3" value="ВЫХОД_3">--%>
    <%--</div>--%>

    <%--<div class="bodyOutput">--%>
        <%--<p class="status" id="status4"></p>--%>
        <%--<input type="button" id="outPut4" onclick="sendReg0Bit3();" class="btn btn-sm btn-success" name="outPut4" value="ВЫХОД_4">--%>
    <%--</div>--%>

    <%--<div class="bodyOutput" ng-controller="controller5">--%>
        <%--<input type="number" id="text5" onblur="sendReg1();" name="text5" class="form-control form-group-sm" value="">--%>
    <%--</div>--%>

    <%--<div id="mainSocket">--%>
        <%--<noscript><h2>Enable Java script and reload this page to run Websocket Demo</h2></noscript>--%>
        <%--<h1>Calculator App Using Spring 4 WebSocket</h1>--%>
        <%--<div>--%>
            <%--<button id="connect" class="btn btn-default" onclick="connect();">Connect</button>--%>
            <%--<button id="disconnect" class="btn btn-default" disabled="disabled" onclick="disconnect();">Disconnect</button><br/><br/>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<script type="text/javascript">--%>
        <%--var stompClient = null;--%>

        <%--function setConnected(connected) {--%>
            <%--$("#connect").prop("disabled", connected);--%>
            <%--$("#disconnect").prop("disabled", !connected);--%>
        <%--}--%>

        <%--function connect() {--%>
            <%--var socket = new SockJS('/guide-websocket');--%>
            <%--stompClient = Stomp.over(socket);--%>
            <%--stompClient.connect({}, function(frame) {--%>
                <%--setConnected(true);--%>
                <%--console.log('Connected: ' + frame);--%>
<%--//                stompClient.subscribe('/topic/greetings', function(calResult){--%>
<%--//                    showGreeting(JSON.parse(calResult.body));--%>
<%--//                });--%>
                <%--stompClient.subscribe('/topic/trm201', function(resultTrm){--%>
                    <%--showTrmBody(JSON.parse(resultTrm.body));--%>
                <%--});--%>
            <%--});--%>
        <%--}--%>

        <%--function disconnect() {--%>
            <%--if (stompClient != null){--%>
                <%--stompClient.disconnect();--%>
            <%--}--%>
<%--//            stompClient.disconnect();--%>
            <%--setConnected(false);--%>
            <%--console.log("Disconnected");--%>
        <%--}--%>

        <%--function sendReg0Bit0() {--%>
            <%--stompClient.send("/app/reg0bit0", {}, {});--%>
        <%--}--%>

        <%--function sendReg0Bit1() {--%>
            <%--stompClient.send("/app/reg0bit1", {}, {});--%>
        <%--}--%>

        <%--function sendReg0Bit2() {--%>
            <%--stompClient.send("/app/reg0bit2", {}, {});--%>
        <%--}--%>

        <%--function sendReg0Bit3() {--%>
            <%--stompClient.send("/app/reg0bit3", {}, {});--%>
        <%--}--%>

        <%--function sendReg1() {--%>
            <%--stompClient.send("/app/reg1", {}, JSON.stringify({ 'var': $("#text5").val()}));--%>
        <%--}--%>

        <%--function showGreeting(message) {--%>
            <%--$("#status1").text(message.reg0Bit0);--%>
            <%--$("#status2").text(message.reg0Bit1);--%>
            <%--$("#status3").text(message.reg0Bit2);--%>
            <%--$("#status4").text(message.reg0Bit3);--%>
            <%--$("#num2").val(message.reg1TwoByte);--%>
            <%--$("#text5").val(message.reg1TwoByte);--%>
        <%--}--%>

        <%--function showTrmBody(trmBody){--%>
            <%--$("#realTrmValue").text(trmBody.getValue3);--%>
        <%--}--%>
    <%--</script>--%>
</body>
</html>
