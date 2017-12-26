<%--
  Created by IntelliJ IDEA.
  User: notebook
  Date: 9/4/17
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>PLC</title>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/stomp.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/angular.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/Chart.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/moment.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/html2canvas.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/canvas-toBlob.js"></script>
    <script rel="script" type="text/javascript" src="resources/js/FileSaver.js"></script>
</head>
<body>
<div id="main">
    <canvas id="myChart" width="400" height="400"></canvas>
    <input type="button" id="generateChart" name="generateChart" class="btn btn-sm btn-success" value="Сгенерировать">
    <input type="button" id="print" onclick="printCanvas()" name="print" class="btn btn-sm btn-success" value="Печать">
</div>
<script rel="script" type="text/javascript">

    var ctx = document.getElementById("myChart");
    var myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels:
//                xCord
                ["2017-07-19 08:10:00", "2017-07-20 08:10:00", "2017-07-21 08:10:00", "2017-07-21 08:10:00", "2017-07-22 08:10:00",
                    "2017-07-23 08:10:00", "2017-07-24 08:10:00", "2017-07-25 08:10:00", "2017-07-26 08:10:00", "2017-07-27 08:10:00",
                    "2017-07-27 08:10:00", "2017-07-28 08:10:00", "2017-07-29 08:10:00", "2017-07-30 08:10:00", "2017-07-31 08:10:00",
                    "2017-08-01 08:10:00", "2017-08-02 08:10:00", "2017-08-03 08:10:00", "2017-08-04 08:10:00", "2017-08-05 08:10:00",
                    "2017-08-06 08:10:00", "2017-08-07 08:10:00", "2017-08-08 08:10:00", "2017-08-09 08:10:00", "2017-08-10 08:10:00",
                    "2017-08-11 08:10:00", "2017-08-12 08:10:00", "2017-08-13 08:10:00", "2017-08-14 08:10:00", "2017-08-15 08:10:00",
                    "2017-08-16 08:10:00", "2017-08-17 08:10:00", "2017-08-18 08:10:00", "2017-08-19 08:10:00", "2017-08-20 08:10:00",
                    "2017-08-21 08:10:00", "2017-08-22 08:10:00", "2017-08-23 08:10:00", "2017-08-24 08:10:00", "2017-08-25 08:10:00",
                    "2017-08-26 08:10:00", "2017-08-27 08:10:00", "2017-08-28 08:10:00", "2017-08-29 08:10:00", "2017-08-30 08:10:00"]

            ,
            datasets: [
                {
                    label: 'Температура',
                    backgroundColor: 'rgba(200, 200, 200, 1)',
                    borderColor: 'rgba(253, 224, 181, 1)',
                    borderWidth: 5,
                    borderDash: [],
                    borderDashOffset: 0.0,
                    borderCapStyle: 'butt',
                    borderJoinStyle: 'miter',
                    fill: false,
                    lineTension: 0.1,
                    pointBackgroundColor: "#ffff",
                    pointBorderColor: 'rgba(75, 192, 64, 1)',
                    pointBorderWidth: 0,
                    pointRadius: 0,
                    pointHitRadius: 10,
                    pointHoverBackgroundColor: 'rgba(75, 192, 192, 1)',
                    pointHoverBorderColor: 'rgba(220, 220, 220, 1)',
                    pointHoverBorderWidth: 2,
                    pointHoverRadius: 5,
                    data:
//                        yCord
                        [12, 19, 3, 5, 2,
                            3, 54, 23, 25, 45,
                            76, 32, 35, 12, 5,
                            6, 2, 3, 2, 5,
                            76, 62, 75, 52, 85,
                            56, 52, 55, 52, 55,
                            86, 82, 85, 82, 85,
                            96, 92, 95, 92, 95,
                            50.2, 32.4, 18.4, 61.3, 55.3]

                }
//                    ,
//                    {
//                        label: 'My Second',
//                        backgroundColor: 'rgba(99, 99, 99, 1)',
//                        fill: true,
//                        lineTension: 0.1,
//                        borderColor: 'rgba(75, 75, 64, 1)',
//                        borderCapStyle: 'butt',
//                        borderDash: [],
//                        borderDashOffset: 0.0,
//                        borderJoinStyle: 'miter',
//                        pointBorderColor: 'rgba(75, 72, 192, 1)',
//                        pointBackgroundColor: "#ffff",
//                        pointBorderWidth: 1,
//                        pointHoverRadius: 5,
//                        pointHoverBackgroundColor: 'rgba(75, 72, 192, 1)',
//                        pointHoverBorderColor: 'rgba(220, 220, 220, 1)',
//                        pointHoverBorderWidth: 2,
//                        pointRadius: 1,
//                        pointHitRadius: 10,
//                        data: [100, 20, 60, 20, 80, 55, 90]
//                    }
            ]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero:true, // start chart from zero point
                        fontColor: '#FFFF',
                        fontFamily: 'sans-sherif',
                        fontSize: 22,
                        fontStyle: 'bold',
                        stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking
                    }
//                    ,
//                    scale: {
//                        fontColor: '#FFFF',
//                        fontFamily: 'sans-sherif',
//                        fontSize: 22,
//                        fontStyle: 'bold'
//                    }
                    ,
                    gridLines: {
                        color: '#FFFF',
                        lineWidth: 5
                    }
                }],
                xAxes: [{
                    ticks: {
                        beginAtZero:true, // start chart from zero point
                        fontColor: '#FFFF',
                        fontFamily: 'sans-sherif',
                        fontSize: 22,
                        fontStyle: 'bold',
                        stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking
                    }
//                    ,
//                    scaleLabel: {
//                        fontColor: '#FFFF',
//                        fontFamily: 'sans-sherif',
//                        fontSize: 22,
//                        fontStyle: 'bold'
//                    }
                    ,
                    gridLines: {
                        color: '#FFFF',
                        lineWidth: 5
                    }
                }]
            },
            animation: {
                duration: 0, // general animation time
            },
            hover: {
                animationDuration: 0, // duration of animations when hovering an item
            },
            responsiveAnimationDuration: 0, // animation duration after a resize
            responsive: true, // Resizes the chart canvas when its container does
            maintainAspectRatio: true, // Maintain the original canvas aspect ratio (width / height) when resizing.
        }
    });

    function printChart() {
        var mywindow = window.open('', 'PRINT', 'height=400,width=600');

        mywindow.document.write('<html><head><title>' + document.title  + '</title>');
        mywindow.document.write('</head><body >');
        mywindow.document.write('<h1>' + document.title  + '</h1>');
        mywindow.document.write(document.getElementById('mainPrint').innerHTML);
        mywindow.document.write('</body></html>');

        mywindow.document.close(); // necessary for IE >= 10
        mywindow.focus(); // necessary for IE >= 10*/

        mywindow.print();
        mywindow.close();

        return true;
    }

    function printCanvas() {
        var dataUrl = document.getElementById('myChart').toDataURL("image/png"); //attempt to save base64 string to server using this var
        var windowContent = '<!DOCTYPE html>';
        windowContent += '<html>';
        windowContent += '<head><title>Print canvas</title></head>';
        windowContent += '<body>';
        windowContent += '<img src="' + dataUrl + '">';
        windowContent += '</body>';
        windowContent += '</html>';
        var printWin = window.open('','','width=400,height=600');
        printWin.document.open();
        printWin.document.write(windowContent);
        printWin.document.close();
        printWin.focus();
        printWin.print();
        printWin.close();
    }

    function imTry() {
        html2canvas($('#myChart'), {
            onrendered: function(canvas) {
                var imgData = canvas.toDataURL('image/jpeg');
                var windowContent = '<!DOCTYPE html>';
                windowContent += '<html>';
                windowContent += '<head><title>Print canvas</title></head>';
                windowContent += '<body>';
                windowContent += '<img src="' + imgData + '">';
                windowContent += '</body>';
                windowContent += '</html>';
                var printWin = window.open('', '', 'width=400,height=600');
                printWin.document.open();
                printWin.document.write(windowContent);
                printWin.document.close();
                printWin.focus();
                printWin.print();
                printWin.close();
                return false;
            }
        });
    }

    $("#generateChart").click(function() {
        $("#myChart").get(0).toBlob(function(blob) {
            saveAs(blob, "chart_1");
        });
    });
</script>
</body>
</html>

