<%--
  Created by IntelliJ IDEA.
  User: KIP-PC99
  Date: 24.10.2018
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" type="text/css" href="resources/css/navbar.css"/>
<script rel="script" type="text/javascript" src="resources/js/navbar.js"></script>

<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="/info"><span class="glyphicon glyphicon-info-sign"></span>Info</a>
    <a href="/logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a>
    <a href="/admin/panel"><span class="glyphicon glyphicon-user"></span>Admin</a>
    <a href="/service-desk"><span class="glyphicon glyphicon-paperclip"></span>Service Desk</a>
    <a href="/contact-desk"><span class="glyphicon glyphicon-book"></span>Contact Desk</a>
<%--    <a href="/sensor1"><span class="glyphicon glyphicon-book"></span>Sensor1</a>--%>
</div>

<!-- Use any element to open the sidenav -->
<button id="MainMenuButton" onclick="openNav();"><span>MENU</span></button>

