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
    <link rel="icon" type="image/png" href="resources/img/favicons.png">
    <link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap-3.3.7/css/bootstrap.css"/>
    <script rel="script" type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script rel="script" type="text/javascript" src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
</head>
<body>
<div id="main">
    <jsp:include page="/WEB-INF/views/navbar.jsp"/>
    <a id="sensor1-style" class='btn btn-sm btn-success btn--shockwave is-active' href="/sensor1">
        Сенсор1
    </a>
    <img src="resources/img/kievguma_3d.jpg" alt="kievguma_3d">
    <svg height="1160" width="2000">
        <a id="firstDepartment" class="item" data-toggle="modal" data-target=".img-firstCeh-modal">
            <polygon points="969,406 1323,512 1064,756 806,654 860,613 776,577 874,507 834,491"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="kotelnya" class="item" data-toggle="modal" data-target=".img-kotelnya-modal">
            <polygon points="1038,898 1122,935 992,1078 818,991 904,911 990,947"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="vodopodgotovka" class="item" href="#">
            <polygon points="710,878 770,869 780,914 720,924"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="tp" class="item" href="#">
            <polygon points="688,471 735,488 635,550 589,533"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="skladmain" class="item" href="#">
            <polygon points="398,367 678,467 577,525 441,397 382,377"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="sklad" class="item" href="#">
            <polygon points="720,138 758,145 407,296 371,285"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="office2" class="item" data-toggle="modal" data-target=".img-secondOffice-modal">
            <polygon points="1077,265 1140,283 920,427 851,404"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="thirdceh" class="item" data-toggle="modal" data-target=".img-thirdceh-modal">
            <polygon points="1153,314 1474,401 1337,535 1338,507 1015,411"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="fourthceh" class="item" data-toggle="modal" data-target=".img-fourthceh-modal">
            <polygon points="1173,206 1513,285 1509,299 1539,307 1485,359 1087,259"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="secondceh" class="item" data-toggle="modal" data-target=".img-secondceh-modal">
            <polygon points="1250,162 1610,240 1567,279 1529,269 1522,275 1185,198"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="mainoffice" class="item" data-toggle="modal" data-target=".img-mainoffice-modal">
            <polygon points="1037,94 1204,130 1166,150 996,112"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="sevenceh" class="item" data-toggle="modal" data-target=".img-sevenCeh-modal">
            <polygon points="921,147 1086,185 878,297 742,259 700,281 650,265 757,214 770,217"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="motorservice" class="item" href="#">
            <polygon points="745,266 868,302 833,320 710,283"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="rmc" class="item" href="#">
            <polygon points="638,268 824,326 759,361 569,299"></polygon>
            Sorry, your browser does not support inline SVG.
        </a>
        <a id="pressform" class="item" href="#">
            <polygon points="561,302 752,364 696,394 505,329"></polygon>
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
    <div class="modal fade img-fourthceh-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kievguma_zone_termoplast_crop_1000.jpg">
            <div style="height: 1000px; width: 712px">
                <a id="silicon-camera" class='btn btn-sm btn-success btn--jump is-active' href="/silicon-camera-vulcan">
                    Камера вулкан.
                </a>
            </div>
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
                <a id="FirstCehSecondFloor" class="item" data-toggle="modal" data-target=".img-firstCehSecondFloor-modal">
                    <polygon points="825,630 970,630 970,700 825,700"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>
    <div class="modal fade img-firstCehSecondFloor-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kievguma_zone_1_second_floor_1000px.png">
            <svg height="1459" width="1000">
                <a id="FirstCehSmesitel1" class="item" href="/firstCehSmesitel1">
                    <polygon points="250,200 350,200 350,340 250,340"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="FirstCehSmesitel2" class="item" href="/firstCehSmesitel2">
                    <polygon points="250,350 350,350 350,490 250,490"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="FirstCehSmesitel3" class="item" href="/firstCehSmesitel3">
                    <polygon points="730,160 830,160 830,300 730,300"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="FirstCehSmesitel4" class="item" href="/firstCehSmesitel4">
                    <polygon points="730,310 830,310 830,450 730,450"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="FirstCehSmesitel5" class="item" href="/firstCehSmesitel5">
                    <polygon points="730,590 830,590 830,730 730,730"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>
    <div class="modal fade img-sevenCeh-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kievguma_zone_v7_crop_1000px.jpg">
            <svg height="624" width="1000">
                <a id="SevenCehAutoclav" class="item" href="/sevenCehAutoclav">
                    <polygon points="748,535 785,535 785,590 748,590"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>
    <div class="modal fade img-mainoffice-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kievguma_laboratory_crop_1000px.jpg">
            <svg height="1441" width="1000">
                <a id="LaboratoryAutoclav" class="item" href="/laboratoryAutoclav">
                    <polygon points="150,355 235,355 235,485 150,485"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="LaboratoryTVS1" class="item" href="/laboratoryTvs1">
                    <polygon points="195,1340 245,1340 245,1405 195,1405"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="LaboratoryTVS2" class="item" href="/laboratoryTvs2">
                    <polygon points="70,1340 123,1340 123,1405 70,1405"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>
    <div class="modal fade img-kotelnya-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kotelnya_crop_1000px.jpg">
            <svg height="669" width="1000">
                <a id="KotelnyaParMikrolITM4" class="item" href="/kotelnyaParMikrolITM4">
                    <polygon points="20,363 75,363 75,457 20,457"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>
    <div class="modal fade img-secondceh-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLable">
        <div class="modal-dialog modal-lg" role="document">
            <img src="resources/img/kievguma_zone_2_crop_700px.jpg">
            <svg height="1724" width="700">
                <a id="secondcehDielKamVulcan1" class="item" href="/secondcehDielKamVulcan1">
                    <polygon points="423,480 525,480 525,535 423,535"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamVulcan2" class="item" href="/secondcehDielKamVulcan2">
                    <polygon points="423,540 525,540 525,595 423,595"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamVulcan3" class="item" href="/secondcehDielKamVulcan3">
                    <polygon points="423,605 525,605 525,660 423,660"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamVody1" class="item" href="/secondcehDielKamVody1">
                    <polygon points="423,667 525,667 525,722 423,722"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamVody2" class="item" href="/secondcehDielKamVody2">
                    <polygon points="423,735 525,735 525,790 423,790"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamVody3" class="item" href="/secondcehDielKamVody3">
                    <polygon points="423,795 525,795 525,850 423,850"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamLateks" class="item" href="/secondcehDielKamLateks">
                    <polygon points="423,857 525,857 525,912 423,912"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamKoagulant" class="item" href="/secondcehDielKamKoagulant">
                    <polygon points="423,920 525,920 525,975 423,975"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamSushka" class="item" href="/secondcehDielKamSushka">
                    <polygon points="423,982 525,982 525,1037 423,1037"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehDielKamDushirovanie" class="item" href="/secondcehDielKamDushirovanie">
                    <polygon points="423,1045 525,1045 525,1100 423,1100"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehLineBalon" class="item" href="/secondcehLineBalon">
                    <polygon points="223,480 310,480 310,715 223,715"/>
                    Sorry, your browser does not support inline SVG.
                </a>
                <a id="secondcehLineNapal" class="item" href="/secondcehLineNapal">
                    <polygon points="545,485 627,485 627,1100 545,1100"/>
                    Sorry, your browser does not support inline SVG.
                </a>
            </svg>
        </div>
    </div>
</div>
</body>
</html>
