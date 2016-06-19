<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean-el"%>
<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html-el"%>
<%@ taglib uri="/tags/reservation" prefix="reservation"%>

<%@ taglib uri="/tags/c" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel='stylesheet' href='styles/main.css' type='text/css'>
</head>
<body>

       <%-- <bean:write name="user"/>    --%>    
       <div class="container-fluid">
        <div class="navbar-header">
        <reservation:user/>
           <a class="navbar-brand" href="http://localhost:8080/MyStruts/elements/Tab.do?method=customerPage"><bean:write name="username" /></a>
           </div>  
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">  
          <li> <html:link action="/locale/Locale.do?method=english"><bean:message key="jsp.locale.en" /></html:link></li>
		<li> <html:link action="/locale/Locale.do?method=russian"><bean:message key="jsp.locale.ru" /></html:link></li>
		</ul>
		</div>
		</div> <%--
<div>
<div class="username">
	<ul class="nav navbar-nav navbar-left">
	
	<li><h3><bean:write name="user" property="name"/></h3></li>
	</ul>
	</div>
		<ul class="nav navbar-nav navbar-right">
		
		<li> <html:link action="/locale/Locale.do?method=english"><bean:message key="jsp.locale.en" /></html:link></li>
		<li> <html:link action="/locale/Locale.do?method=russian"><bean:message key="jsp.locale.ru" /></html:link></li>
		</ul>
		</div>--%> 
		<%-- 
<div class="localeform">
<html:link action="/elements/Locale.do?method=english"><bean:message key="jsp.locale.en" /></html:link>

<html:link action="/elements/Locale.do?method=russian"><bean:message key="jsp.locale.ru" /></html:link>
</div>--%>
</body>
</html>