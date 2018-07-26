
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="compress" uri="http://htmlcompressor.googlecode.com/taglib/compressor" %>

<compress:html removeIntertagSpaces="true">
    <!DOCTYPE HTML>
    <html lang="ru">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="robots" content="noindex,nofollow">
        <title>Напоминание пароля</title>
        <meta name="title" content="Напоминание пароля">
        <link rel="shortcut icon" href="<c:url value="/resources/img/static/login.ico"/>" type="image/x-icon">
        <link rel="icon" href="<c:url value="/resources/img/static/login.ico"/>" type="image/x-icon">
            <%-- CSS styles --%>
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
              rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic"
              rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="<c:url value="/resources/css/style.min.css"/>" rel="stylesheet">
    </head>
    <body>
        <%-- Navigation bar --%>
    <jsp:include page="/WEB-INF/views/home/navigation.jsp"/>
    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
        <div class="container">
            <div class="row">
                <div class="box">
                        <%-- Site page path --%>
                    <p class="path">
                        <a href="<c:url value="/"/>" title="Перейти на главную страницу">Главная</a>
                        → <a href="<c:url value="/login"/>">Авторизация</a>
                        → <a href="<c:url value="/forgot_password"/>">Напоминание пароля</a>
                    </p>
                    <div class="col-xs-12 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4">
                        <div class="text-center">
                            <hr>
                            <h1 class="intro-text text-center">Напомнить пароль</h1>
                                <%-- Captcha response --%>
                            <c:choose>
                                <c:when test="${is_captcha eq false}">
                                    <div class="alert red" role="alert">
                                        <b>Вы не прошли верификацию капчи</b><br>
                                    </div>
                                </c:when>
                                <c:when test="${is_forgot eq false}">
                                    <div class="alert red" role="alert">
                                        <b>Пользователь не найден</b><br>
                                    </div>
                                </c:when>
                                <c:when test="${(is_forgot eq true) and (is_captcha eq true)}">
                                    <div class="alert green" role="alert">
                                        <b>Сообщение отправлено на почту</b>
                                    </div>
                                </c:when>
                            </c:choose>
                            <hr>
                                <%-- Form to resume access --%>
                            <form action="<c:url value="/forgot"/>" method="post">
                                <div class="row">
                                    <div class="form-group col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                        <label>
                                            <b>
                                                <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                                &nbsp;Логин или E-mail:
                                            </b>
                                        </label>
                                        <input class="form-control" type="text" name="username" required
                                               minlength="3" maxlength="100" autofocus value="${username}"
                                               placeholder="Введите логин или E-mail">
                                    </div>
                                        <%-- Google reCaptcha --%>
                                    <jsp:include page="/WEB-INF/views/google/recaptcha.jsp"/>
                                    <div class="text-center form-group col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                        <button type="submit" class="btn btn-default"
                                                title="Отправить пароль на E-mail">
                                            <span class="glyphicon glyphicon-send" aria-hidden="true"></span>
                                            &nbsp;Отправить
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
    </div>
    <c:if test="${main_company ne null}">
        <%-- Footer --%>
        <jsp:include page="/WEB-INF/views/home/footer.jsp"/>
    </c:if>
        <%-- Scripts --%>
    <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/js/mask.min.js"/>" async></script>
    </body>
    </html>
</compress:html>
