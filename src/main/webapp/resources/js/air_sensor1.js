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
        stompClient.subscribe('/topic/table-model-air-sensor1', function(resultTrm){
            let parsed = JSON.parse(resultTrm.body);
            showBody(parsed);
            if (onDraw){
                drawInRealTime(parsed);
            }
        });

        stompClient.subscribe('/topic/generate-chart-air-sensor1', function(result){
            genChart(JSON.parse(result.body));
        });
    });
}

let vStart = document.getElementById("startChart").value;
let vEnd = document.getElementById("endChart").value;
let vTitle = 'Обєкт/Київгума/Сенсор повітря1'+' з '+vStart.toString()+' по '+vEnd.toString();

function generateDataForBordersChart() {
    vStart = document.getElementById("startChart").value;
    vEnd = document.getElementById("endChart").value;
}

function generateNewChartTitle(start, end) {
    config.options.title.text = 'Обєкт/Київгума/Сенсор повітря1'+' з '+start.toString()+' по '+end.toString();
}

function sendChartBody() {
    this.generateDataForBordersChart();
    this.generateNewChartTitle(vStart, vEnd);
    let dataChart = JSON.stringify({'start' : vStart, 'end' : vEnd});
    stompClient.send("/app/generate-chart-air-sensor1", {}, dataChart);
}

function disconnect() {
    if (stompClient != null){
        stompClient.disconnect();
    }
    console.log("Disconnected");
}

function showBody(body){
    let channel1 = body.sds_P1;
    let channel2 = body.sds_P2;
    let channel3 = body.bme280_temperature;
    let channel4 = body.bme280_humidity;
    let channel5 = body.bme280_pressure;
    let channel6 = body.nh3;
    let channel7 = body.co;
    let channel8 = body.no2;
    $("#air-sensor1-SDS_P1").text(channel1);
    $("#air-sensor1-SDS_P2").text(channel2);
    $("#air-sensor1-BME280_temperature").text(channel3);
    $("#air-sensor1-BME280_humidity").text(channel4);
    $("#air-sensor1-BME280_pressure").text(channel5);
    $("#air-sensor1-NH3").text(channel6);
    $("#air-sensor1-CO").text(channel7);
    $("#air-sensor1-NO2").text(channel8);
}

let config = {
    type: 'line',
    data: {
        labels: [0],
        datasets: [
            {
                label: 'SDS_P1',
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
                label: 'SDS_P2',
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
                label: 'BME280_temperature',
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
                label: 'BME280_humidity',
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
                label: 'BME280_pressure',
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
                label: 'NH3',
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
                label: 'CO',
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
                label: 'NO2',
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
                    // min: 0,
                    // max: 300,
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
let globalY4 = [];
let globalY5 = [];
let globalY6 = [];
let globalY7 = [];
let globalY8 = [];
function genChart(data) {
    let x = [];
    let y1 = [];
    let y2 = [];
    let y3 = Array();
    let y4 = Array();
    let y5 = Array();
    let y6 = Array();
    let y7 = Array();
    let y8 = Array();
    let utcLocalDateTimeOffset = getUtcOffset(data[0]["date"]);

    for (let i in data){
        if (data.hasOwnProperty(i)){
            try {
                x[i] = moment(data[i]["date"], "YYYY,MM,DD,HH,mm,ss").utcOffset(utcLocalDateTimeOffset);
                y1[i] = data[i]["sds_P1"];
                y2[i] = data[i]["sds_P2"];
                y3[i] = data[i]["bme280_temperature"];
                y4[i] = data[i]["bme280_humidity"];
                y5[i] = data[i]["bme280_pressure"];
                y6[i] = data[i]["nh3"];
                y7[i] = data[i]["co"];
                y8[i] = data[i]["no2"];

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
    globalX = [];
    globalY1 = [];
    globalY2 = [];
    globalY3 = [];
    globalY4 = [];
    globalY5 = [];
    globalY6 = [];
    globalY7 = [];
    globalY8 = [];
    config.data.labels = [];
    config.data.datasets.forEach(function(dataset) {
        dataset.data = [];
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
    let buffer = document.getElementById("bufferChart").value;
    let x = moment(new Date(), "YYYY-MM-DD HH:mm:ss");
    let y1 = parsed.sds_P1;
    let y2 = parsed.sds_P2;
    let y3 = parsed.bme280_temperature;
    let y4 = parsed.bme280_humidity;
    let y5 = parsed.bme280_pressure;
    let y6 = parsed.nh3;
    let y7 = parsed.co;
    let y8 = parsed.no2;

    if (config.data.labels.length < buffer){
        addLastElementToChart(x, y1, y2, y3, y4, y5, y6, y7, y8);
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
    let increaseArrayY4 = [];
    let increaseArrayY5 = [];
    let increaseArrayY6 = [];
    let increaseArrayY7 = [];
    let increaseArrayY8 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom + Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
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
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    let increaseArrayY4 = [];
    let increaseArrayY5 = [];
    let increaseArrayY6 = [];
    let increaseArrayY7 = [];
    let increaseArrayY8 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom - Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
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
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    let increaseArrayY4 = [];
    let increaseArrayY5 = [];
    let increaseArrayY6 = [];
    let increaseArrayY7 = [];
    let increaseArrayY8 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition = leftRightPosition + Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
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
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    let increaseArrayY1 = [];
    let increaseArrayY2 = [];
    let increaseArrayY3 = [];
    let increaseArrayY4 = [];
    let increaseArrayY5 = [];
    let increaseArrayY6 = [];
    let increaseArrayY7 = [];
    let increaseArrayY8 = [];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition  = leftRightPosition  - Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        increaseArrayY3 = globalY3.slice(from,to);
        increaseArrayY4 = globalY4.slice(from,to);
        increaseArrayY5 = globalY5.slice(from,to);
        increaseArrayY6 = globalY6.slice(from,to);
        increaseArrayY7 = globalY7.slice(from,to);
        increaseArrayY8 = globalY8.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
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
