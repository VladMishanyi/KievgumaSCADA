/**
 * Created by KIP-PC99 on 22.11.2018.
 */
var currentDateTime = moment().format("YYYY-MM-DDTHH:mm");
$("#startChart").val(currentDateTime);
$("#endChart").val(currentDateTime);
var increaseDecriaseZoom = 0;
var leftRightPosition = 0;

var onDraw = false;
document.getElementById("id_switch_tred").addEventListener("change", function send() {
    var checkedValue = document.getElementById("id_switch_tred").checked;
    if (checkedValue){
        onDraw = true;
    }else {
        onDraw = false;
    }
    console.log("------status tred: "+onDraw);
});

$(document).ready(function () {
    connect();
});

var stompClient = null;
function connect() {
    var socket = new SockJS('/guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame);

        stompClient.subscribe('/topic/secondCehKameraVulcan3MPR51_table', function(resultTrm){
            var parsed = JSON.parse(resultTrm.body);
            showBody(parsed);
            if (onDraw){
                drawInRealTime(parsed);
            }
        });

        stompClient.subscribe('/topic/generateChartSecondCehKameraVulcan3MPR51', function(result){
            genChart(JSON.parse(result.body));
        });

        stompClient.subscribe('/topic/secondCehKameraVulcan3MPR51_device1', function(result){
            var parsed = JSON.parse(result.body);
            var register0 = parsed.inputRegister0;
            var register1 = parsed.inputRegister1;
            var register2 = parsed.inputRegister2;
            var register3 = parsed.inputRegister3;
            var register4 = parsed.inputRegister4;
            var register5 = parsed.inputRegister5;
            var register6 = parsed.inputRegister6;
            var register7 = parsed.inputRegister7;
            var register8 = parsed.inputRegister8;
            var register9 = parsed.inputRegister9;
            var register10 = parsed.inputRegister10;
            var register11 = parsed.inputRegister11;
            var register12 = parsed.inputRegister12;
            var register13 = parsed.inputRegister13;
            var register14 = parsed.inputRegister14;
            var register15 = parsed.inputRegister15;
            var register16 = parsed.inputRegister16;
            var register17 = parsed.inputRegister17;
            var register18 = parsed.inputRegister18;
            var register19 = parsed.inputRegister19;
            var register20 = parsed.inputRegister20;
            var register21 = parsed.inputRegister21;
            var register22 = parsed.inputRegister22;
            var register23 = parsed.inputRegister23;
            var register24 = parsed.inputRegister24;
            var register25 = parsed.inputRegister25;
            var register26 = parsed.inputRegister26;
            var register27 = parsed.inputRegister27;
            var register28 = parsed.inputRegister28;
            var register29 = parsed.inputRegister29;
            var register30 = parsed.inputRegister30;
            var register31 = parsed.inputRegister31;
            var register32 = parsed.inputRegister32;
            var register33 = parsed.inputRegister33;
            var register34 = parsed.inputRegister34;
            var register35 = parsed.inputRegister35;
            var register36 = parsed.inputRegister36;
            var register37 = parsed.inputRegister37;
            var register38 = parsed.inputRegister38;
            var register39 = parsed.inputRegister39;
            var register40 = parsed.inputRegister40;
            var register41 = parsed.inputRegister41;
            var register42 = parsed.inputRegister42;
            var register43 = parsed.inputRegister43;
            var register44 = parsed.inputRegister44;
            var register45 = parsed.inputRegister45;
            var register46 = parsed.inputRegister46;
            document.getElementById("read_steam_pwm").value = register0;
            document.getElementById("read_steam_ki").value = register1;
            document.getElementById("read_steam_kp").value = register2;
            document.getElementById("read_steam_kd").value = register3;
            document.getElementById("read_electric_pwm").value = register4;
            document.getElementById("read_electric_ki").value = register5;
            document.getElementById("read_electric_kp").value = register6;
            document.getElementById("read_electric_kd").value = register7;
            document.getElementById("read_alarm").value = register8;
            document.getElementById("read_regim1").selectedIndex = register9;
            document.getElementById("read_temp1").value = register10;
            document.getElementById("read_press1").value = register11;
            document.getElementById("read_regim2").selectedIndex = register12;
            document.getElementById("read_temp2").value = register13;
            document.getElementById("read_press2").value = register14;
            document.getElementById("read_regim3").selectedIndex = register15;
            document.getElementById("read_temp3").value = register16;
            document.getElementById("read_press3").value = register17;
            document.getElementById("read_regim4").selectedIndex = register18;
            document.getElementById("read_temp4").value = register19;
            document.getElementById("read_press4").value = register20;
            document.getElementById("read_regim5").selectedIndex = register21;
            document.getElementById("read_temp5").value = register22;
            document.getElementById("read_press5").value = register23;
            document.getElementById("read_regim6").selectedIndex = register24;
            document.getElementById("read_temp6").value = register25;
            document.getElementById("read_press6").value = register26;
            document.getElementById("read_regim7").value = register27;
            document.getElementById("read_temp7").value = register28;
            document.getElementById("read_press7").value = register29;
            document.getElementById("read_regim8").selectedIndex = register30;
            document.getElementById("read_temp8").value = register31;
            document.getElementById("read_press8").value = register32;
            document.getElementById("read_regim9").selectedIndex = register33;
            document.getElementById("read_temp9").value = register34;
            document.getElementById("read_press9").value = register35;
            document.getElementById("read_regim10").selectedIndex = register36;
            document.getElementById("read_temp10").value = register37;
            document.getElementById("read_press10").value = register38;
            document.getElementById("read_regim11").selectedIndex = register39;
            document.getElementById("read_temp11").value = register40;
            document.getElementById("read_press11").value = register41;
            document.getElementById("read_regim12").selectedIndex = register42;
            document.getElementById("read_temp12").value = register43;
            document.getElementById("read_press12").value = register44;
            document.getElementById("secondCehKameraVulcan3MPR51Kanal2").value = register45;
            document.getElementById("read_program").selectedIndex = register46;
        });
    });
}

document.getElementById("write_steam_pwm").addEventListener("change", function send() {
    var some = document.getElementById("write_steam_pwm").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_steam_pwm", {}, data);
});

document.getElementById("write_steam_ki").addEventListener("change", function send() {
    var some = document.getElementById("write_steam_ki").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_steam_ki", {}, data);
});

document.getElementById("write_steam_kp").addEventListener("change", function send() {
    var some = document.getElementById("write_steam_kp").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_steam_kp", {}, data);
});

document.getElementById("write_steam_kd").addEventListener("change", function send() {
    var some = document.getElementById("write_steam_kd").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_steam_kd", {}, data);
});

document.getElementById("write_electric_pwm").addEventListener("change", function send() {
    var some = document.getElementById("write_electric_pwm").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_electric_pwm", {}, data);
});

document.getElementById("write_electric_ki").addEventListener("change", function send() {
    var some = document.getElementById("write_electric_ki").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_electric_ki", {}, data);
});

document.getElementById("write_electric_kp").addEventListener("change", function send() {
    var some = document.getElementById("write_electric_kp").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_electric_kp", {}, data);
});

document.getElementById("write_electric_kd").addEventListener("change", function send() {
    var some = document.getElementById("write_electric_kd").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_electric_kd", {}, data);
});

document.getElementById("write_alarm").addEventListener("change", function send() {
    var some = document.getElementById("write_alarm").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_alarm", {}, data);
});

//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim1").addEventListener("change", function send() {
    var some = document.getElementById("write_regim1").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim1", {}, data);
});
document.getElementById("write_temp1").addEventListener("change", function send() {
    var some = document.getElementById("write_temp1").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp1", {}, data);
});
document.getElementById("write_press1").addEventListener("change", function send() {
    var some = document.getElementById("write_press1").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press1", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim2").addEventListener("change", function send() {
    var some = document.getElementById("write_regim2").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim2", {}, data);
});
document.getElementById("write_temp2").addEventListener("change", function send() {
    var some = document.getElementById("write_temp2").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp2", {}, data);
});
document.getElementById("write_press2").addEventListener("change", function send() {
    var some = document.getElementById("write_press2").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press2", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim3").addEventListener("change", function send() {
    var some = document.getElementById("write_regim3").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim3", {}, data);
});
document.getElementById("write_temp3").addEventListener("change", function send() {
    var some = document.getElementById("write_temp3").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp3", {}, data);
});
document.getElementById("write_press3").addEventListener("change", function send() {
    var some = document.getElementById("write_press3").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press3", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim4").addEventListener("change", function send() {
    var some = document.getElementById("write_regim4").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim4", {}, data);
});
document.getElementById("write_temp4").addEventListener("change", function send() {
    var some = document.getElementById("write_temp4").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp4", {}, data);
});
document.getElementById("write_press4").addEventListener("change", function send() {
    var some = document.getElementById("write_press4").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press4", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim5").addEventListener("change", function send() {
    var some = document.getElementById("write_regim5").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim5", {}, data);
});
document.getElementById("write_temp5").addEventListener("change", function send() {
    var some = document.getElementById("write_temp5").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp5", {}, data);
});
document.getElementById("write_press5").addEventListener("change", function send() {
    var some = document.getElementById("write_press5").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press5", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim6").addEventListener("change", function send() {
    var some = document.getElementById("write_regim6").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim6", {}, data);
});
document.getElementById("write_temp6").addEventListener("change", function send() {
    var some = document.getElementById("write_temp6").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp6", {}, data);
});
document.getElementById("write_press6").addEventListener("change", function send() {
    var some = document.getElementById("write_press6").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press6", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim7").addEventListener("change", function send() {
    var some = document.getElementById("write_regim7").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim7", {}, data);
});
document.getElementById("write_temp7").addEventListener("change", function send() {
    var some = document.getElementById("write_temp7").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp7", {}, data);
});
document.getElementById("write_press7").addEventListener("change", function send() {
    var some = document.getElementById("write_press7").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press7", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim8").addEventListener("change", function send() {
    var some = document.getElementById("write_regim8").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim8", {}, data);
});
document.getElementById("write_temp8").addEventListener("change", function send() {
    var some = document.getElementById("write_temp8").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp8", {}, data);
});
document.getElementById("write_press8").addEventListener("change", function send() {
    var some = document.getElementById("write_press8").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press8", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim9").addEventListener("change", function send() {
    var some = document.getElementById("write_regim9").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim9", {}, data);
});
document.getElementById("write_temp9").addEventListener("change", function send() {
    var some = document.getElementById("write_temp9").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp9", {}, data);
});
document.getElementById("write_press9").addEventListener("change", function send() {
    var some = document.getElementById("write_press9").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press9", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim10").addEventListener("change", function send() {
    var some = document.getElementById("write_regim10").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim10", {}, data);
});
document.getElementById("write_temp10").addEventListener("change", function send() {
    var some = document.getElementById("write_temp10").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp10", {}, data);
});
document.getElementById("write_press10").addEventListener("change", function send() {
    var some = document.getElementById("write_press10").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press10", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim11").addEventListener("change", function send() {
    var some = document.getElementById("write_regim11").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim11", {}, data);
});
document.getElementById("write_temp11").addEventListener("change", function send() {
    var some = document.getElementById("write_temp11").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp11", {}, data);
});
document.getElementById("write_press11").addEventListener("change", function send() {
    var some = document.getElementById("write_press11").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press11", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim12").addEventListener("change", function send() {
    var some = document.getElementById("write_regim12").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_regim12", {}, data);
});
document.getElementById("write_temp12").addEventListener("change", function send() {
    var some = document.getElementById("write_temp12").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_temp12", {}, data);
});
document.getElementById("write_press12").addEventListener("change", function send() {
    var some = document.getElementById("write_press12").value;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_press12", {}, data);
});
//--------------------------------------------------------------------------------------------------

document.getElementById("write_program").addEventListener("change", function send() {
    var some = document.getElementById("write_program").selectedIndex;
    var data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_program", {}, data);
});

document.getElementById("write_program_read").addEventListener("click", function send() {
    // var some = document.getElementById("write_program_read").selectedIndex;
    var data = JSON.stringify({'value' : 2});//command 2 is a read
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_program_read", {}, data);
});

document.getElementById("write_program_write").addEventListener("click", function send() {
    // var some = document.getElementById("write_program_write").selectedIndex;
    var data = JSON.stringify({'value' : 1});//command 1 is a write
    stompClient.send("/app/second_ceh_kamera_vulcan3_MPR51/write_program_write", {}, data);
});








var vStart = document.getElementById("startChart").value;
var vEnd = document.getElementById("endChart").value;
var vTitle = 'Объект/Киевгума/2й Цех/Камера вулканизации3'+' с '+vStart.toString()+' по '+vEnd.toString();

function generateDataForBordersChart() {
    vStart = document.getElementById("startChart").value;
    vEnd = document.getElementById("endChart").value;
}

function generateNewChartTitle(start, end) {
    config.options.title.text = 'Объект/Киевгума/2й Цех/Камера вулканизации3'+' с '+start.toString()+' по '+end.toString();
}

function sendChartBody() {
    this.generateDataForBordersChart();
    this.generateNewChartTitle(vStart, vEnd);
    var dataChart = JSON.stringify({'start' : vStart, 'end' : vEnd});
    stompClient.send("/app/generateChartSecondCehKameraVulcan3MPR51", {}, dataChart);
}

function disconnect() {
    if (stompClient != null){
        stompClient.disconnect();
    }
    console.log("Disconnected");
}

function showBody(body){
    // var channel1 = body.channel1;
    var channel2 = body.channel2;
    // var channel3 = body.channel3;
    // $("#secondCehKameraVulcan3MPR51Kanal1").text(channel1);
    $("#secondCehKameraVulcan3MPR51Kanal2").text(channel2);
    // $("#secondCehKameraVulcan3MPR51Kanal3").text(channel3);
}

var config = {
    type: 'line',
    data: {
        labels: [0],
        datasets: [
            // {
            //     label: 'Температура на канал1',
            //     backgroundColor: '#00b3ee',
            //     borderColor: '#00b3ee',
            //     borderWidth: 5,
            //     borderDash: [],
            //     borderDashOffset: 0.0,
            //     borderCapStyle: 'butt',
            //     borderJoinStyle: 'miter',
            //     fill: false,
            //     lineTension: 0.1,
            //     pointBackgroundColor: '#000000',
            //     pointBorderColor: '#FF0000',
            //     pointBorderWidth: 0,
            //     pointRadius: 0,
            //     pointHitRadius: 10,
            //     pointHoverBackgroundColor: '#000000',
            //     pointHoverBorderColor: '#FF0000',
            //     pointHoverBorderWidth: 2,
            //     pointHoverRadius: 5,
            //     showLine: true,
            //     spanGaps: false,
            //     steppedLine: false,
            //     data: [0]
            // },
            {
                label: 'Температура',
                backgroundColor: '#000000',
                borderColor: '#000000',
                borderWidth: 2,
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
            // ,
            // {
            //     label: 'Температура на канал3',
            //     backgroundColor: '#3C510C',
            //     borderColor: '#3C510C',
            //     borderWidth: 5,
            //     borderDash: [],
            //     borderDashOffset: 0.0,
            //     borderCapStyle: 'butt',
            //     borderJoinStyle: 'miter',
            //     fill: false,
            //     lineTension: 0.1,
            //     pointBackgroundColor: '#000000',
            //     pointBorderColor: '#FF0000',
            //     pointBorderWidth: 0,
            //     pointRadius: 0,
            //     pointHitRadius: 10,
            //     pointHoverBackgroundColor: '#000000',
            //     pointHoverBorderColor: '#FF0000',
            //     pointHoverBorderWidth: 2,
            //     pointHoverRadius: 5,
            //     showLine: true,
            //     spanGaps: false,
            //     steppedLine: false,
            //     data: [0]
            // }
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
 //                   min: 0,
 //                   max: 300,
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

var globalX = new Array();
// var globalY1 = new Array();
var globalY2 = new Array();
// var globalY3 = new Array();
function genChart(data) {
    var x = new Array();
    // var y1 = new Array();
    var y2 = new Array();
    // var y3 = new Array();


    for (var i in data){
        if (data.hasOwnProperty(i)){
            try {
                // x[i] = moment(data[i]["date"]).zone("+02:00").format("YYYY-MM-DD HH:mm:ss");
                x[i] = moment(data[i]["date"]).zone("+03:00").format("YYYY-MM-DD HH:mm:ss");
                // y1[i] = data[i]["channel1"];
                y2[i] = data[i]["channel2"];
                // y3[i] = data[i]["channel3"];

            }catch (err){
                console.log('Ошибка ' + err.name + ":" + err.message + "\n" + err.stack);
            }
        }
    }
    globalX = x;
    // globalY1 = y1;
    globalY2 = y2;
    // globalY3 = y3;

    increaseDecriaseZoom = 0;
    leftRightPosition = 0;
    buildChart(x, /*y1,*/ y2/*, y3*/);
}

function buildChart(x, /*y1,*/ y2/*, y3*/) {
    config.data.labels = x;
    // config.data.datasets[0].data = y1;
    config.data.datasets[0].data = y2;
    // config.data.datasets[2].data = y3;
    window.myLine.update();
}

function clearChart(){
    // $('#myChart').remove(); // this is my <canvas> element
    // $('#graph-container').append('<canvas id="myChart" width="400" height="150"><canvas>');
    globalX = new Array();
    // globalY1 = new Array();
    globalY2 = new Array();
    // globalY3 = new Array();
    config.data.labels = new Array();
    config.data.datasets.forEach(function(dataset) {
        dataset.data = new Array;
    });
    window.myLine.update();
}

function addLastElementToChart(X1, /*Y1,*/ Y2/*, Y3*/) {
    globalX.push(X1);
    // globalY1.push(Y1);
    globalY2.push(Y2);
    // globalY3.push(Y3);
    config.data.labels.push(X1);
    // config.data.datasets[0].data.push(Y1);
    config.data.datasets[0].data.push(Y2);
    // config.data.datasets[2].data.push(Y3);
    window.myLine.update();
}

function removeFirstElementFromChart() {
    globalX.shift();
    // globalY1.shift();
    globalY2.shift();
    // globalY3.shift();
    config.data.labels.shift();
    config.data.datasets.forEach(function(dataset) {
        dataset.data.shift();
    });
    window.myLine.update();
}

function drawInRealTime(parsed) {
    var buffer = document.getElementById("bufferChart").value;
    // var x = moment(parsed.date).zone("+02:00").format("YYYY-MM-DD HH:mm:ss");
    var x = moment(parsed.date).zone("+03:00").format("YYYY-MM-DD HH:mm:ss");
    // var y1 = parsed.channel1;
    var y2 = parsed.channel2;
    // var y3 = parsed.channel3;
    if (config.data.labels.length < buffer){
        addLastElementToChart(x, /*y1,*/ y2/*, y3*/);
    }
    if (config.data.labels.length >= buffer){
        removeFirstElementFromChart();
    }
}

function increaseChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    // var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    // var increaseArrayY3 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom + Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        // increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        // increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX,
            // increaseArrayY1,
            increaseArrayY2/*,
            increaseArrayY3*/);
    }
}

function decreaseChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    // var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    // var increaseArrayY3 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom - Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        // increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        // increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX,
            // increaseArrayY1,
            increaseArrayY2/*,
            increaseArrayY3*/);
    }
}

function leftChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    // var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    // var increaseArrayY3 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition = leftRightPosition + Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        // increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        // increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX,
            // increaseArrayY1,
            increaseArrayY2/*,
            increaseArrayY3*/);
    }
}

function rightChart() {
    var increaseZoom = document.getElementById("zoom-chart").value;
    var increaseArrayX = new Array();
    // var increaseArrayY1 = new Array();
    var increaseArrayY2 = new Array();
    // var increaseArrayY3 = new Array();
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition  = leftRightPosition  - Number(increaseZoom);
        var from = increaseDecriaseZoom - leftRightPosition;
        var to = globalX.length - increaseDecriaseZoom - leftRightPosition;
        increaseArrayX = globalX.slice(from,to);
        // increaseArrayY1 = globalY1.slice(from,to);
        increaseArrayY2 = globalY2.slice(from,to);
        // increaseArrayY3 = globalY3.slice(from,to);
        this.generateNewChartTitle(increaseArrayX[0], increaseArrayX[increaseArrayX.length - 1]);
        buildChart(increaseArrayX,
            // increaseArrayY1,
            increaseArrayY2/*,
            increaseArrayY3*/);
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
