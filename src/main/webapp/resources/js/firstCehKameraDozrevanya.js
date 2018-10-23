/**
 * Created by KIP-PC99 on 23.10.2018.
 */
var currentDateTime = moment().format("YYYY-MM-DDTHH:mm");
$("#startChart").val(currentDateTime);
$("#endChart").val(currentDateTime);
var increaseDecriaseZoom = 0;
var leftRightPosition = 0;

var onDraw = false;
function onDrawChange() {
    onDraw = !onDraw;
}

$(document).ready(function () {
    connect();
});

var stompClient = null;
function connect() {
    var socket = new SockJS('/guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/firstCehKameraDozrevanya', function(resultTrm){
            var parsed = JSON.parse(resultTrm.body);
            showBody(parsed);
            if (onDraw){
                drawInRealTime(parsed);
            }
        });

        stompClient.subscribe('/topic/generateChartFirstCehKameraDozrevanya', function(result){
            genChart(JSON.parse(result.body));
        });
    });
}

var vStart = document.getElementById("startChart").value;
var vEnd = document.getElementById("endChart").value;
function sendChartBody() {
    vStart = document.getElementById("startChart").value;
    vEnd = document.getElementById("endChart").value;
    var dataChart = JSON.stringify({'start' : vStart, 'end' : vEnd});
    stompClient.send("/app/generateChartFirstCehKameraDozrevanya", {}, dataChart);
}

function disconnect() {
    if (stompClient != null){
        stompClient.disconnect();
    }
    console.log("Disconnected");
}

function showBody(body){
    var channel1 = body.channel1;
    var channel2 = body.channel2;
    var channel3 = body.channel3;
    var channel4 = body.channel4;
    var channel5 = body.channel5;
    var channel6 = body.channel6;
    var channel7 = body.channel7;
    var channel8 = body.channel8;
    $("#firstCehKameraDozrevanyaTempProdukta").text(channel1);
    $("#firstCehKameraDozrevanyaTempSuhogo").text(channel2);
    $("#firstCehKameraDozrevanyaTempVlagnogo").text(channel3);
    $("#firstCehKameraDozrevanyaTempKanal1").text(channel4);
    $("#firstCehKameraDozrevanyaTempKanal2").text(channel5);
    $("#firstCehKameraDozrevanyaTempKanal3").text(channel6);
    $("#firstCehKameraDozrevanyaTempKanal4").text(channel7);
    $("#firstCehKameraDozrevanyaTempKanal5").text(channel8);
}

var vTitle = 'Объект/Киевгума/1й Цех/Камера дозревания'+' с '+vStart.toString()+' по '+vEnd.toString();
var config = {
    type: 'line',
    data: {
        labels: [0],
        datasets: [
            {
                label: 'Температура на загрузке',
                backgroundColor: '#00b3ee',
                borderColor: '#00b3ee',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Температура в середине',
                backgroundColor: '#ffff00',
                borderColor: '#ffff00',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Температура на выгрузке',
                backgroundColor: '#3C510C',
                borderColor: '#3C510C',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Канал1',
                backgroundColor: '#9C510C',
                borderColor: '#9C510C',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Канал2',
                backgroundColor: '#8C510C',
                borderColor: '#8C510C',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Канал3',
                backgroundColor: '#7C510C',
                borderColor: '#7C510C',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Канал4',
                backgroundColor: '#6C510C',
                borderColor: '#6C510C',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            },
            {
                label: 'Канал5',
                backgroundColor: '#5C510C',
                borderColor: '#5C510C',
                borderWidth: 5,
                borderDash: [],
                borderDashOffset: 0.0,
                borderCapStyle: 'butt',
                borderJoinStyle: 'miter',
                fill: false,
                lineTension: 0.1,
                pointBackgroundColor: '#000000',
                pointBorderColor: '#FF0000',
                pointBorderWidth: 0,
                pointRadius: 0,
                pointHitRadius: 10,
                pointHoverBackgroundColor: '#000000',
                pointHoverBorderColor: '#FF0000',
                pointHoverBorderWidth: 2,
                pointHoverRadius: 5,
                showLine: true,
                spanGaps: false,
                steppedLine: false,
                data: [0]
            }
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
                    min: 0,
                    max: 150,
                    stepSize: 5
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
                    fontStyle: 'bold'
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
}

var globalX = new Array();
var globalY1 = new Array();
var globalY2 = new Array();
var globalY3 = new Array();
var globalY4 = new Array();
var globalY5 = new Array();
var globalY6 = new Array();
var globalY7 = new Array();
var globalY8 = new Array();
function genChart(data) {
    var x = new Array();
    var y1 = new Array();
    var y2 = new Array();
    var y3 = Array();
    var y4 = Array();
    var y5 = Array();
    var y6 = Array();
    var y7 = Array();
    var y8 = Array();

    for (var i in data){
        if (data.hasOwnProperty(i)){
            try {
                x[i] = moment(data[i]["date"]).utc().format("YYYY-MM-DD HH:mm:ss");
                y1[i] = data[i]["channel1"];
                y2[i] = data[i]["channel2"];
                y3[i] = data[i]["channel3"];
                y4[i] = data[i]["channel4"];
                y5[i] = data[i]["channel5"];
                y6[i] = data[i]["channel6"];
                y7[i] = data[i]["channel7"];
                y8[i] = data[i]["channel8"];

            }catch (err){
                console.log('Ошибка ' + err.name + ":" + err.message + "\n" + err.stack);
            }
        }
    }
    globalX = x;
    globalY1 = y1;
    globalY2 = y2;
    globalY3 = y3;
    globalY4 = y4;
    globalY5 = y5;
    globalY6 = y6;
    globalY7 = y7;
    globalY8 = y8;

    increaseDecriaseZoom = 0;
    leftRightPosition = 0;
    buildChart(x, y1, y2, y3, y4, y5, y6, y7, y8);
}

function buildChart(x, y1, y2, y3, y4, y5, y6, y7, y8) {
    config.data.labels = x;
    config.data.datasets[0].data = y1;
    config.data.datasets[1].data = y2;
    config.data.datasets[2].data = y3;
    config.data.datasets[3].data = y4;
    config.data.datasets[4].data = y5;
    config.data.datasets[5].data = y6;
    config.data.datasets[6].data = y7;
    config.data.datasets[7].data = y8;
    window.myLine.update();
}

function clearChart(){
    // $('#myChart').remove(); // this is my <canvas> element
    // $('#graph-container').append('<canvas id="myChart" width="400" height="150"><canvas>');
    globalX = new Array();
    globalY1 = new Array();
    globalY2 = new Array();
    globalY3 = new Array();
    globalY4 = new Array();
    globalY5 = new Array();
    globalY6 = new Array();
    globalY7 = new Array();
    globalY8 = new Array();
    config.data.labels = new Array();
    config.data.datasets.forEach(function(dataset) {
        dataset.data = new Array;
    });
    window.myLine.update();
}

function addLastElementToChart(X1, Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8) {
    globalX.push(X1);
    globalY1.push(Y1);
    globalY2.push(Y2);
    globalY3.push(Y3);
    globalY4.push(Y4);
    globalY5.push(Y5);
    globalY6.push(Y6);
    globalY7.push(Y7);
    globalY8.push(Y8);
    config.data.labels.push(X1);
    config.data.datasets[0].data.push(Y1);
    config.data.datasets[1].data.push(Y2);
    config.data.datasets[2].data.push(Y3);
    config.data.datasets[3].data.push(Y4);
    config.data.datasets[4].data.push(Y5);
    config.data.datasets[5].data.push(Y6);
    config.data.datasets[6].data.push(Y7);
    config.data.datasets[7].data.push(Y8);
    window.myLine.update();
}

function removeFirstElementFromChart() {
    globalX.shift();
    globalY1.shift();
    globalY2.shift();
    globalY3.shift();
    globalY4.shift();
    globalY5.shift();
    globalY6.shift();
    globalY7.shift();
    globalY8.shift();
    config.data.labels.shift();
    config.data.datasets.forEach(function(dataset) {
        dataset.data.shift();
    });
    window.myLine.update();
}

function drawInRealTime(parsed) {
    var buffer = document.getElementById("bufferChart").value;
    var x = moment(parsed.date).utc().format("YYYY-MM-DD HH:mm:ss");
    var y1 = parsed.channel1;
    var y2 = parsed.channel2;
    var y3 = parsed.channel3;
    var y4 = parsed.channel4;
    var y5 = parsed.channel5;
    var y6 = parsed.channel6;
    var y7 = parsed.channel7;
    var y8 = parsed.channel8;
    if (config.data.labels.length < buffer){
        addLastElementToChart(x, y1, y2, y3, y4, y5, y6, y7, y8);
    }
    if (config.data.labels.length >= buffer){
        removeFirstElementFromChart();
    }
}

function increaseChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    var increaseArrayY3 = new Array();
    var increaseArrayY4 = new Array();
    var increaseArrayY5 = new Array();
    var increaseArrayY6 = new Array();
    var increaseArrayY7 = new Array();
    var increaseArrayY8 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom + Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        buildChart(increaseArrayX,
            increaseArrayY1,
            increaseArrayY2,
            increaseArrayY3,
            increaseArrayY4,
            increaseArrayY5,
            increaseArrayY6,
            increaseArrayY7,
            increaseArrayY8);
    }
}

function decreaseChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    var increaseArrayY3 = new Array();
    var increaseArrayY4 = new Array();
    var increaseArrayY5 = new Array();
    var increaseArrayY6 = new Array();
    var increaseArrayY7 = new Array();
    var increaseArrayY8 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom - Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        buildChart(increaseArrayX,
            increaseArrayY1,
            increaseArrayY2,
            increaseArrayY3,
            increaseArrayY4,
            increaseArrayY5,
            increaseArrayY6,
            increaseArrayY7,
            increaseArrayY8);
    }
}

function leftChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    var increaseArrayY3 = new Array();
    var increaseArrayY4 = new Array();
    var increaseArrayY5 = new Array();
    var increaseArrayY6 = new Array();
    var increaseArrayY7 = new Array();
    var increaseArrayY8 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition = leftRightPosition + Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        buildChart(increaseArrayX,
            increaseArrayY1,
            increaseArrayY2,
            increaseArrayY3,
            increaseArrayY4,
            increaseArrayY5,
            increaseArrayY6,
            increaseArrayY7,
            increaseArrayY8);
    }
}

function rightChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    var increaseArrayY3 = new Array();
    var increaseArrayY4 = new Array();
    var increaseArrayY5 = new Array();
    var increaseArrayY6 = new Array();
    var increaseArrayY7 = new Array();
    var increaseArrayY8 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition  = leftRightPosition  - Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        buildChart(increaseArrayX,
            increaseArrayY1,
            increaseArrayY2,
            increaseArrayY3,
            increaseArrayY4,
            increaseArrayY5,
            increaseArrayY6,
            increaseArrayY7,
            increaseArrayY8);
    }
}

function saveChart() {
    $("#myChart").get(0).toBlob(function(blob) {
        var currentDateTime = moment().format("YYYY-MM-DD HH:mm:ss");
        saveAs(blob, currentDateTime+"_chart");
    });
}

window.onload = function() {
    var ctx = document.getElementById("myChart").getContext("2d");
    window.myLine = getNewChart(ctx, config);
}

function getNewChart(ctx, config) {
    return new Chart(ctx, config);
}