<%--
  Created by IntelliJ IDEA.
  User: KIP-PC99
  Date: 21.11.2018
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Kamera Vulkan3 Second Department</title>
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
            <%--<tr>--%>
                <%--<th><span style="color: black; font-family: sans-serif; font-size: 24px;">Реальное значение температуры на канал1</span></th>--%>
                <%--<th><span id="secondCehKameraVulcan3MPR51Kanal1" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> град.</th>--%>
            <%--</tr>--%>
            <tr>
                <th><span style="color: black; font-family: sans-serif; font-size: 24px;">Реальное значение температуры</span></th>
                <th><span id="secondCehKameraVulcan3MPR51Kanal2" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> град.</th>
            </tr>
            <%--<tr>--%>
                <%--<th><span style="color: black; font-family: sans-serif; font-size: 24px;">Реальное значение температуры на канал3</span></th>--%>
                <%--<th><span id="secondCehKameraVulcan3MPR51Kanal3" style="color: red; font-family: sans-serif; font-size: 24px;"> </span> град.</th>--%>
            <%--</tr>--%>
        </table>

        <table class="table">
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th>Режим</th>
                <th>Температура</th>
                <th>Время</th>
            </tr>

            <tr>
                <td><button type="button" disabled id="read_program_read" name="read_program_read" class="btn btn-success" style="width: 100%;">Прочитать</button></td>
                <td>
                    <select class="form-control" disabled id="read_program" name="read_program">
                        <option value="0">----</option>
                        <option value="1">Program_1</option>
                        <option value="2">Program_2</option>
                        <option value="3">Program_1</option>
                        <option value="4">Program_2</option>
                        <option value="5">Program_2</option>
                    </select>
                </td>
                <td><button type="button" disabled id="read_program_write" name="read_program_write" class="btn btn-danger" style="width: 100%;">Сохранить</button></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">1</td>
                <td><select class="form-control" disabled id="read_regim1" name="read_regim1">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp1" name="read_temp1" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press1" name="read_press1" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">2</td>
                <td><select class="form-control" disabled id="read_regim2" name="read_regim2">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp2" name="read_temp2" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press2" name="read_press2" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td style="padding: 25px 15px 0px 15px; font-size: 18px; color: black; font-variant: small-caps">Пар</td>
                <td style="padding: 25px 15px 0px 15px; font-size: 18px; color: black; font-variant: small-caps">Электро</td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">3</td>
                <td><select class="form-control" disabled id="read_regim3" name="read_regim3">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp3" name="read_temp3" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press3" name="read_press3" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">PWM</td>
                <td><input type="number" disabled id="read_steam_pwm" name="read_steam_pwm" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_electric_pwm" name="read_electric_pwm" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">4</td>
                <td><select class="form-control" disabled id="read_regim4" name="read_regim4">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp4" name="read_temp4" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press4" name="read_press4" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">Ki</td>
                <td><input type="number" disabled id="read_steam_ki" name="read_steam_ki" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_electric_ki" name="read_electric_ki" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">5</td>
                <td><select class="form-control" disabled id="read_regim5" name="read_regim5">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp5" name="read_temp5" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press5" name="read_press5" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">Kp</td>
                <td><input type="number" disabled id="read_steam_kp" name="read_steam_kp" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_electric_kp" name="read_electric_kp" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">6</td>
                <td><select class="form-control" disabled id="read_regim6" name="read_regim6">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp6" name="read_temp6" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press6" name="read_press6" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">Kd</td>
                <td><input type="number" disabled id="read_steam_kd" name="read_steam_kd" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_electric_kd" name="read_electric_kd" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">7</td>
                <td><select class="form-control" disabled id="read_regim7" name="read_regim7">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp7" name="read_temp7" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press7" name="read_press7" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 10px; font-size: 18px; color: black; font-variant: small-caps">Общее время авария</td>
                <td><input type="number" disabled id="read_alarm" name="read_alarm" class="form-control" value="0" style="width: 120px;"></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">8</td>
                <td><select class="form-control" disabled id="read_regim8" name="read_regim8">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp8" name="read_temp8" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press8" name="read_press8" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">9</td>
                <td><select class="form-control" disabled id="read_regim9" name="read_regim9">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp9" name="read_temp9" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press9" name="read_press9" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">10</td>
                <td><select class="form-control" disabled id="read_regim10" name="read_regim10">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp10" name="read_temp10" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press10" name="read_press10" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">11</td>
                <td><select class="form-control" disabled id="read_regim11" name="read_regim11">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp11" name="read_temp11" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press11" name="read_press11" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">12</td>
                <td><select class="form-control" disabled id="read_regim12" name="read_regim12">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" disabled id="read_temp12" name="read_temp12" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" disabled id="read_press12" name="read_press12" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

        </table>






        <table class="table">
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th>Режим</th>
                <th>Температура</th>
                <th>Время</th>
            </tr>

            <tr>
                <td><button type="button" id="write_program_read" name="write_program_read" class="btn btn-success" style="width: 100%;">Прочитать</button></td>
                <td>
                    <select class="form-control" id="write_program" name="write_program">
                        <option value="0">----</option>
                        <option value="1">Program_1</option>
                        <option value="2">Program_2</option>
                        <option value="3">Program_1</option>
                        <option value="4">Program_2</option>
                        <option value="5">Program_2</option>
                    </select>
                </td>
                <td><button type="button" id="write_program_write" name="write_program_write" class="btn btn-danger" style="width: 100%;">Сохранить</button></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">1</td>
                <td><select class="form-control" id="write_regim1" name="write_regim1">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp1" name="write_temp1" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press1" name="write_press1" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">2</td>
                <td><select class="form-control" id="write_regim2" name="write_regim2">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp2" name="write_temp2" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press2" name="write_press2" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td style="padding: 25px 15px 0px 15px; font-size: 18px; color: black; font-variant: small-caps">Пар</td>
                <td style="padding: 25px 15px 0px 15px; font-size: 18px; color: black; font-variant: small-caps">Электро</td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">3</td>
                <td><select class="form-control" id="write_regim3" name="write_regim3">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp3" name="write_temp3" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press3" name="write_press3" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">PWM</td>
                <td><input type="number" id="write_steam_pwm" name="write_steam_pwm" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_electric_pwm" name="write_electric_pwm" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">4</td>
                <td><select class="form-control" id="write_regim4" name="write_regim4">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp4" name="write_temp4" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press4" name="write_press4" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">Ki</td>
                <td><input type="number" id="write_steam_ki" name="write_steam_ki" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_electric_ki" name="write_electric_ki" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">5</td>
                <td><select class="form-control" id="write_regim5" name="write_regim5">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp5" name="write_temp5" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press5" name="write_press5" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">Kp</td>
                <td><input type="number" id="write_steam_kp" name="write_steam_kp" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_electric_kp" name="write_electric_kp" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">6</td>
                <td><select class="form-control" id="write_regim6" name="write_regim6">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp6" name="write_temp6" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press6" name="write_press6" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 80px; font-size: 18px; color: black; font-variant: small-caps">Kd</td>
                <td><input type="number" id="write_steam_kd" name="write_steam_kd" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_electric_kd" name="write_electric_kd" class="form-control" value="0" style="width: 120px;"></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">7</td>
                <td><select class="form-control" id="write_regim7" name="write_regim7">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp7" name="write_temp7" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press7" name="write_press7" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td style="padding: 15px 0px 15px 10px; font-size: 18px; color: black; font-variant: small-caps">Общее время авария</td>
                <td><input type="number" id="write_alarm" name="write_alarm" class="form-control" value="0" style="width: 120px;"></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">8</td>
                <td><select class="form-control" id="write_regim8" name="write_regim8">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp8" name="write_temp8" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press8" name="write_press8" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">9</td>
                <td><select class="form-control" id="write_regim9" name="write_regim9">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp9" name="write_temp9" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press9" name="write_press9" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">10</td>
                <td><select class="form-control" id="write_regim10" name="write_regim10">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp10" name="write_temp10" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press10" name="write_press10" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">11</td>
                <td><select class="form-control" id="write_regim11" name="write_regim11">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp11" name="write_temp11" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press11" name="write_press11" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="padding: 15px 0px 15px 20px; font-size: 18px; color: red;">12</td>
                <td><select class="form-control" id="write_regim12" name="write_regim12">
                    <option value="0">----</option>
                    <option value="1">Набор Темп.</option>
                    <option value="2">Удержание Темп</option>
                </select></td>
                <td><input type="number" id="write_temp12" name="write_temp12" class="form-control" value="0" style="width: 120px;"></td>
                <td><input type="number" id="write_press12" name="write_press12" class="form-control" value="0" style="width: 120px;"></td>
            </tr>

        </table>








        <jsp:include page="/WEB-INF/views/info/info.jsp"/>
        <div class="row">
            <div class="col-md-3 col-lg-3">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="startMark">Начало</span>
                    <input type="datetime-local" class="form-control" aria-describedby="startMark" id="startChart" name="startChart" value="2017-12-19T07:30">
                </div>
            </div>
            <div class="col-md-3 col-lg-3">
                <div class="input-group input-group-sm">
                    <span class="input-group-addon" id="endMark">Конец</span>
                    <input type="datetime-local" class="form-control" aria-describedby="endMark" id="endChart" name="endChart" value="2017-12-19T18:00">
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

<script rel="script" type="text/javascript" src="<c:url value="/resources/js/secondCehKameraVulcan3MPR51.js"/>"></script>
</body>
</html>
