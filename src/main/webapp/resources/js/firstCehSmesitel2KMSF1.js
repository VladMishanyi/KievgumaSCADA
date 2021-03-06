/**
 * Created by KIP-PC99 on 23.10.2018.
 */
let cdt = moment().format("YYYY-MM-DDTHH:mm");
$("#startChart").val(cdt);
$("#endChart").val(cdt);
let increaseDecriaseZoom = 0;
let leftRightPosition = 0;

let onDraw = false;
document.getElementById("id_switch_tred").addEventListener("change", function send() {
    let checkedValue = document.getElementById("id_switch_tred").checked;
    if (checkedValue){
        onDraw = true;
    }else {
        onDraw = false;
    }
    console.log("------status tred: "+onDraw);
});

$(document).ready(function () {
    connect();
    clearChart();
});

let stompClient = null;
function connect() {
    let socket = new SockJS('/guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/firstCehSmesitel2KMSF1', function(resultTrm){
            let parsed = JSON.parse(resultTrm.body);
            showBody(parsed);
            if (onDraw){
                drawInRealTime(parsed);
            }
        });

        stompClient.subscribe('/topic/generateChartFirstCehSmesitel2KMSF1', function(result){
            genChart(JSON.parse(result.body));
        });
    });
}

let vStart = document.getElementById("startChart").value;
let vEnd = document.getElementById("endChart").value;
let vTitle = 'Объект/Киевгума/1й Цех/Смеситель_2'+' с '+vStart.toString()+' по '+vEnd.toString();

function generateDataForBordersChart() {
    vStart = document.getElementById("startChart").value;
    vEnd = document.getElementById("endChart").value;
}

function generateNewChartTitle(start, end) {
    config.options.title.text = 'Объект/Киевгума/1й Цех/Смеситель_2'+' с '+start.toString()+' по '+end.toString();
}

function sendChartBody() {
    this.generateDataForBordersChart();
    this.generateNewChartTitle(vStart, vEnd);
    let dataChart = JSON.stringify({'start' : vStart, 'end' : vEnd});
    stompClient.send("/app/generateChartFirstCehSmesitel2KMSF1", {}, dataChart);
}

function disconnect() {
    if (stompClient != null){
        stompClient.disconnect();
    }
    console.log("Disconnected");
}

function showBody(body){
    let channel1 = body.channel1;
    let channel2 = body.channel2;
    let channel3 = body.channel3;
    $("#firstCehSmesitel2Tok").text(channel1);
    $("#firstCehSmesitel2Temp").text(channel2);
    $("#firstCehSmesitel2Pressure").text(channel3);
}

let config = {
    type: 'line',
    data: {
        labels: [0],
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
                data: [0]
            }
            ,
            {
                label: 'Температура',
                backgroundColor: '#985f0d',
                borderColor: '#985f0d',
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
            ,
            {
                label: 'Давление',
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
//                    min: 0,
//                    max: 300,
                    stepSize: 5
//                            stacked: true //Line charts can be configured into stacked area charts by changing the settings on the y axis to enable stacking
                },
                gridLines: {
                    color: '#985f0d',
                    lineWidth: 1
                }
            }],
            xAxes: [{
                type: 'time',
                distribution: 'series',
                time: {
                    unit: 'hour',
                    stepSize: 1,
                    displayFormats: {
                        millisecond: 'YYYY-MM-DD HH:mm:ss',
                        second: 'YYYY-MM-DD HH:mm:ss',
                        minute: 'YYYY-MM-DD HH:mm:ss',
                        hour: 'YYYY-MM-DD HH:mm:ss',
                        day: 'YYYY-MM-DD HH:mm:ss',
                        week: 'YYYY-MM-DD HH:mm:ss',
                        month: 'YYYY-MM-DD HH:mm:ss',
                        quarter: 'YYYY-MM-DD HH:mm:ss',
                        year: 'YYYY-MM-DD HH:mm:ss'
                    }
                },
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

let globalX = [];
let globalY1 = [];
let globalY2 = [];
let globalY3 = [];
function genChart(data) {
    let x = [];
    let y1 = [];
    let y2 = [];
    let y3 = [];
    let utcLocalDateTimeOffset = getUtcOffset(data[0]["date"]);

    for (let i in data){
        if (data.hasOwnProperty(i)){
            try {
                x[i] = moment(data[i]["date"], "YYYY,MM,DD,HH,mm,ss").utcOffset(utcLocalDateTimeOffset);
                y1[i] = data[i]["channel1"];
                y2[i] = data[i]["channel2"];
                y3[i] = data[i]["channel3"];

            }catch (err){
                console.log('Ошибка ' + err.name + ":" + err.message + "\n" + err.stack);
            }
        }
    }
    globalX = x;
    globalY1 = y1;
    globalY2 = y2;
    globalY3 = y3;

    increaseDecriaseZoom = 0;
    leftRightPosition = 0;
    buildChart(x, y1, y2, y3);
}

function buildChart(x, y1, y2, y3) {
    config.data.labels = x;
    config.data.datasets[0].data = y1;
    config.data.datasets[1].data = y2;
    config.data.datasets[2].data = y3;
    window.myLine.update();
}

function clearChart(){
    // $('#myChart').remove(); // this is my <canvas> element
    // $('#graph-container').append('<canvas id="myChart" width="400" height="150"><canvas>');
    globalX = [];
    globalY1 = [];
    globalY2 = [];
    globalY3 = [];
    config.data.labels = [];
    config.data.datasets.forEach(function(dataset) {
        dataset.data = [];
    });
    window.myLine.update();
}

function addLastElementToChart(X1, Y1, Y2, Y3) {
    globalX.push(X1);
    globalY1.push(Y1);
    globalY2.push(Y2);
    globalY3.push(Y3);
    config.data.labels.push(X1);
    config.data.datasets[0].data.push(Y1);
    config.data.datasets[1].data.push(Y2);
    config.data.datasets[2].data.push(Y3);
    window.myLine.update();
}

function removeFirstElementFromChart() {
    globalX.shift();
    globalY1.shift();
    globalY2.shift();
    globalY3.shift();
    config.data.labels.shift();
    config.data.datasets.forEach(function(dataset) {
        dataset.data.shift();
    });
    window.myLine.update();
}

function drawInRealTime(parsed) {
    let buffer = document.getElementById("bufferChart").value;
    let x = moment(new Date(), "YYYY-MM-DD HH:mm:ss");
    let y1 = parsed.channel1;
    let y2 = parsed.channel2;
    let y3 = parsed.channel3;
    if (config.data.labels.length < buffer){
        addLastElementToChart(x, y1, y2, y3);
    }
    if (config.data.labels.length >= buffer){
        removeFirstElementFromChart();
    }
}

function increaseChart() {
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom + Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX, increaseArrayY1, increaseArrayY2, increaseArrayY3);
    }
}

function decreaseChart() {
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom - Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX, increaseArrayY1, increaseArrayY2, increaseArrayY3);
    }
}

function leftChart() {
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition = leftRightPosition + Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX, increaseArrayY1, increaseArrayY2, increaseArrayY3);
    }
}

function rightChart() {
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition  = leftRightPosition  - Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX, increaseArrayY1, increaseArrayY2, increaseArrayY3);
    }
}

function saveChart() {
    $("#myChart").get(0).toBlob(function(blob) {
        let dt = moment().format("YYYY-MM-DD HH:mm:ss");
        saveAs(blob, dt+"_chart");
    });
}

window.onload = function() {
    let ctx = document.getElementById("myChart").getContext("2d");
    window.myLine = getNewChart(ctx, config);
}

function getNewChart(ctx, config) {
    return new Chart(ctx, config);
}

function getUtcOffset(date) {
    let minutesOffset = moment(date, "YYYY-MM-DD HH:mm:ss").parseZone().utcOffset();
    let hoursOffset = minutesOffset/60;
    return minutesOffset;
}
