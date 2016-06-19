<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="/tags/c" %>

<html>
<head>
    <title>Header</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/style/css/font-awesome.min.css"/>"
          rel="stylesheet" type="text/css">
    <link href="<c:url value="/style/css/bootstrap.css"/>"
          rel="stylesheet" type="text/css">    <link href="<c:url value="/style/style.css"/>"
          rel="stylesheet" type="text/css">
</head>
<body>

<div class="container">
    <div class="navbar-header">
        <div class="navbar-brand">
            <span>
                    <c:if test="${not empty user}">
                        <span class="user"><bean:message key="header.jsp.msg.user"/></span> ${user.login}
                        <a class="logout" href="<c:url value="/auth/Logout.do"/>">
                            <span class="header-link"><bean:message key="header.jsp.msg.logout"/></span>
                        </a>
                    </c:if>
            </span>
        </div>
    </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active">
                <a href="<c:url value="/elements/Locale.do?method=english"/>"><span class="header-link">Russian</span></a>
            </li>
            <li class="active">
                <a href="<c:url value="/elements/Locale.do?method=russian"/>"><span class="header-link">English</span></a>
            </li>
        </ul>
</div>

</body>
</html>