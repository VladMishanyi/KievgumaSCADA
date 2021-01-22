/**
 * Created by KIP-PC99 on 22.11.2018.
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

        stompClient.subscribe('/topic/secondCehKameraVulcan2MPR51_table', function(resultTrm){
            let parsed = JSON.parse(resultTrm.body);
            showBody(parsed);
            if (onDraw){
                drawInRealTime(parsed);
            }
        });

        stompClient.subscribe('/topic/generateChartSecondCehKameraVulcan2MPR51', function(result){
            genChart(JSON.parse(result.body));
        });

        stompClient.subscribe('/topic/secondCehKameraVulcan2MPR51_device1', function(result){
            let parsed = JSON.parse(result.body);
            let register0 = parsed.inputRegister0;
            let register1 = parsed.inputRegister1;
            let register2 = parsed.inputRegister2;
            let register3 = parsed.inputRegister3;
            let register4 = parsed.inputRegister4;
            let register5 = parsed.inputRegister5;
            let register6 = parsed.inputRegister6;
            let register7 = parsed.inputRegister7;
            let register8 = parsed.inputRegister8;
            let register9 = parsed.inputRegister9;
            let register10 = parsed.inputRegister10;
            let register11 = parsed.inputRegister11;
            let register12 = parsed.inputRegister12;
            let register13 = parsed.inputRegister13;
            let register14 = parsed.inputRegister14;
            let register15 = parsed.inputRegister15;
            let register16 = parsed.inputRegister16;
            let register17 = parsed.inputRegister17;
            let register18 = parsed.inputRegister18;
            let register19 = parsed.inputRegister19;
            let register20 = parsed.inputRegister20;
            let register21 = parsed.inputRegister21;
            let register22 = parsed.inputRegister22;
            let register23 = parsed.inputRegister23;
            let register24 = parsed.inputRegister24;
            let register25 = parsed.inputRegister25;
            let register26 = parsed.inputRegister26;
            let register27 = parsed.inputRegister27;
            let register28 = parsed.inputRegister28;
            let register29 = parsed.inputRegister29;
            let register30 = parsed.inputRegister30;
            let register31 = parsed.inputRegister31;
            let register32 = parsed.inputRegister32;
            let register33 = parsed.inputRegister33;
            let register34 = parsed.inputRegister34;
            let register35 = parsed.inputRegister35;
            let register36 = parsed.inputRegister36;
            let register37 = parsed.inputRegister37;
            let register38 = parsed.inputRegister38;
            let register39 = parsed.inputRegister39;
            let register40 = parsed.inputRegister40;
            let register41 = parsed.inputRegister41;
            let register42 = parsed.inputRegister42;
            let register43 = parsed.inputRegister43;
            let register44 = parsed.inputRegister44;
            let register45 = parsed.inputRegister45;
            let register46 = parsed.inputRegister46;
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
            document.getElementById("secondCehKameraVulcan2MPR51Kanal2").value = register45;
            document.getElementById("read_program").selectedIndex = register46;
        });
    });
}

document.getElementById("write_steam_pwm").addEventListener("change", function send() {
    let some = document.getElementById("write_steam_pwm").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_steam_pwm", {}, data);
});

document.getElementById("write_steam_ki").addEventListener("change", function send() {
    let some = document.getElementById("write_steam_ki").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_steam_ki", {}, data);
});

document.getElementById("write_steam_kp").addEventListener("change", function send() {
    let some = document.getElementById("write_steam_kp").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_steam_kp", {}, data);
});

document.getElementById("write_steam_kd").addEventListener("change", function send() {
    let some = document.getElementById("write_steam_kd").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_steam_kd", {}, data);
});

document.getElementById("write_electric_pwm").addEventListener("change", function send() {
    let some = document.getElementById("write_electric_pwm").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_electric_pwm", {}, data);
});

document.getElementById("write_electric_ki").addEventListener("change", function send() {
    let some = document.getElementById("write_electric_ki").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_electric_ki", {}, data);
});

document.getElementById("write_electric_kp").addEventListener("change", function send() {
    let some = document.getElementById("write_electric_kp").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_electric_kp", {}, data);
});

document.getElementById("write_electric_kd").addEventListener("change", function send() {
    let some = document.getElementById("write_electric_kd").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_electric_kd", {}, data);
});

document.getElementById("write_alarm").addEventListener("change", function send() {
    let some = document.getElementById("write_alarm").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_alarm", {}, data);
});

//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim1").addEventListener("change", function send() {
    let some = document.getElementById("write_regim1").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim1", {}, data);
});
document.getElementById("write_temp1").addEventListener("change", function send() {
    let some = document.getElementById("write_temp1").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp1", {}, data);
});
document.getElementById("write_press1").addEventListener("change", function send() {
    let some = document.getElementById("write_press1").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press1", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim2").addEventListener("change", function send() {
    let some = document.getElementById("write_regim2").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim2", {}, data);
});
document.getElementById("write_temp2").addEventListener("change", function send() {
    let some = document.getElementById("write_temp2").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp2", {}, data);
});
document.getElementById("write_press2").addEventListener("change", function send() {
    let some = document.getElementById("write_press2").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press2", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim3").addEventListener("change", function send() {
    let some = document.getElementById("write_regim3").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim3", {}, data);
});
document.getElementById("write_temp3").addEventListener("change", function send() {
    let some = document.getElementById("write_temp3").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp3", {}, data);
});
document.getElementById("write_press3").addEventListener("change", function send() {
    let some = document.getElementById("write_press3").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press3", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim4").addEventListener("change", function send() {
    let some = document.getElementById("write_regim4").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim4", {}, data);
});
document.getElementById("write_temp4").addEventListener("change", function send() {
    let some = document.getElementById("write_temp4").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp4", {}, data);
});
document.getElementById("write_press4").addEventListener("change", function send() {
    let some = document.getElementById("write_press4").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press4", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim5").addEventListener("change", function send() {
    let some = document.getElementById("write_regim5").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim5", {}, data);
});
document.getElementById("write_temp5").addEventListener("change", function send() {
    let some = document.getElementById("write_temp5").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp5", {}, data);
});
document.getElementById("write_press5").addEventListener("change", function send() {
    let some = document.getElementById("write_press5").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press5", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim6").addEventListener("change", function send() {
    let some = document.getElementById("write_regim6").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim6", {}, data);
});
document.getElementById("write_temp6").addEventListener("change", function send() {
    let some = document.getElementById("write_temp6").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp6", {}, data);
});
document.getElementById("write_press6").addEventListener("change", function send() {
    let some = document.getElementById("write_press6").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press6", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim7").addEventListener("change", function send() {
    let some = document.getElementById("write_regim7").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim7", {}, data);
});
document.getElementById("write_temp7").addEventListener("change", function send() {
    let some = document.getElementById("write_temp7").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp7", {}, data);
});
document.getElementById("write_press7").addEventListener("change", function send() {
    let some = document.getElementById("write_press7").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press7", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim8").addEventListener("change", function send() {
    let some = document.getElementById("write_regim8").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim8", {}, data);
});
document.getElementById("write_temp8").addEventListener("change", function send() {
    let some = document.getElementById("write_temp8").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp8", {}, data);
});
document.getElementById("write_press8").addEventListener("change", function send() {
    let some = document.getElementById("write_press8").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press8", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim9").addEventListener("change", function send() {
    let some = document.getElementById("write_regim9").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim9", {}, data);
});
document.getElementById("write_temp9").addEventListener("change", function send() {
    let some = document.getElementById("write_temp9").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp9", {}, data);
});
document.getElementById("write_press9").addEventListener("change", function send() {
    let some = document.getElementById("write_press9").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press9", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim10").addEventListener("change", function send() {
    let some = document.getElementById("write_regim10").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim10", {}, data);
});
document.getElementById("write_temp10").addEventListener("change", function send() {
    let some = document.getElementById("write_temp10").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp10", {}, data);
});
document.getElementById("write_press10").addEventListener("change", function send() {
    let some = document.getElementById("write_press10").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press10", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim11").addEventListener("change", function send() {
    let some = document.getElementById("write_regim11").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim11", {}, data);
});
document.getElementById("write_temp11").addEventListener("change", function send() {
    let some = document.getElementById("write_temp11").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp11", {}, data);
});
document.getElementById("write_press11").addEventListener("change", function send() {
    let some = document.getElementById("write_press11").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press11", {}, data);
});
//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
document.getElementById("write_regim12").addEventListener("change", function send() {
    let some = document.getElementById("write_regim12").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_regim12", {}, data);
});
document.getElementById("write_temp12").addEventListener("change", function send() {
    let some = document.getElementById("write_temp12").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_temp12", {}, data);
});
document.getElementById("write_press12").addEventListener("change", function send() {
    let some = document.getElementById("write_press12").value;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_press12", {}, data);
});
//--------------------------------------------------------------------------------------------------

document.getElementById("write_program").addEventListener("change", function send() {
    let some = document.getElementById("write_program").selectedIndex;
    let data = JSON.stringify({'value' : some});
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_program", {}, data);
});

document.getElementById("write_program_read").addEventListener("click", function send() {
    // let some = document.getElementById("write_program_read").selectedIndex;
    let data = JSON.stringify({'value' : 2});//command 2 is a read
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_program_read", {}, data);
});

document.getElementById("write_program_write").addEventListener("click", function send() {
    // let some = document.getElementById("write_program_write").selectedIndex;
    let data = JSON.stringify({'value' : 1});//command 1 is a write
    stompClient.send("/app/second_ceh_kamera_vulcan2_MPR51/write_program_write", {}, data);
});









let vStart = document.getElementById("startChart").value;
let vEnd = document.getElementById("endChart").value;
let vTitle = 'Объект/Киевгума/2й Цех/Камера вулканизации2'+' с '+vStart.toString()+' по '+vEnd.toString();

function generateDataForBordersChart() {
    vStart = document.getElementById("startChart").value;
    vEnd = document.getElementById("endChart").value;
}

function generateNewChartTitle(start, end) {
    config.options.title.text = 'Объект/Киевгума/2й Цех/Камера вулканизации2'+' с '+start.toString()+' по '+end.toString();
}

function sendChartBody() {
    this.generateDataForBordersChart();
    this.generateNewChartTitle(vStart, vEnd);
    let dataChart = JSON.stringify({'start' : vStart, 'end' : vEnd});
    stompClient.send("/app/generateChartSecondCehKameraVulcan2MPR51", {}, dataChart);
}

function disconnect() {
    if (stompClient != null){
        stompClient.disconnect();
    }
    console.log("Disconnected");
}

function showBody(body){
    // let channel1 = body.channel1;
    let channel2 = body.channel2;
    // let channel3 = body.channel3;
    // $("#secondCehKameraVulcan2MPR51Kanal1").text(channel1);
    $("#secondCehKameraVulcan2MPR51Kanal2").text(channel2);
    // $("#secondCehKameraVulcan2MPR51Kanal3").text(channel3);
}

let config = {
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
// let globalY1 = []];
let globalY2 = [];
// let globalY3 = []];
function genChart(data) {
    let x = [];
    // let y1 = []];
    let y2 = [];
    // let y3 = []];
    let utcLocalDateTimeOffset = getUtcOffset(data[0]["date"]);


    for (let i in data){
        if (data.hasOwnProperty(i)){
            try {
                x[i] = moment(data[i]["date"], "YYYY,MM,DD,HH,mm,ss").utcOffset(utcLocalDateTimeOffset);
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
    globalX = [];
    // globalY1 = []];
    globalY2 = [];
    // globalY3 = []];
    config.data.labels = [];
    config.data.datasets.forEach(function(dataset) {
        dataset.data = [];
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
    let buffer = document.getElementById("bufferChart").value;
    let x = moment(new Date(), "YYYY-MM-DD HH:mm:ss");
    // let y1 = parsed.channel1;
    let y2 = parsed.channel2;
    // let y3 = parsed.channel3;
    if (config.data.labels.length < buffer){
        addLastElementToChart(x, /*y1,*/ y2/*, y3*/);
    }
    if (config.data.labels.length >= buffer){
        removeFirstElementFromChart();
    }
}

function increaseChart() {
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    // let increaseArrayY1 = []];
    let increaseArrayY2 = [];
    // let increaseArrayY3 = []];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom + Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
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
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    // let increaseArrayY1 = []];
    let increaseArrayY2 = [];
    // let increaseArrayY3 = []];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        increaseDecriaseZoom = increaseDecriaseZoom - Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
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
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    // let increaseArrayY1 = []];
    let increaseArrayY2 = [];
    // let increaseArrayY3 = []];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition = leftRightPosition + Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
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
    let increaseZoom = document.getElementById("zoom-chart").value;
    let increaseArrayX = [];
    // let increaseArrayY1 = []];
    let increaseArrayY2 = [];
    // let increaseArrayY3 = []];
    if ((0 < increaseDecriaseZoom - leftRightPosition) || (globalX.length > increaseDecriaseZoom - leftRightPosition)){
        leftRightPosition  = leftRightPosition  - Number(increaseZoom);
        let from = increaseDecriaseZoom - leftRightPosition;
        let to = globalX.length - increaseDecriaseZoom - leftRightPosition;
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