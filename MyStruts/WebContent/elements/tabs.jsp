<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel='stylesheet' href='../styles/bootstrap.min.css'
	type='text/css' media='all'>
		<link rel='stylesheet' href='../styles/bootstrap.css' type='text/css'
	>
	<link rel='stylesheet' href='../styles/main.css' type='text/css'
	>
</head>
<body>
		<%-- <%@ include file="locale.jsp"%> --%>
		<div>
		<ul class="nav nav-tabs">
		<li> <html:link action="/elements/Locale.do?method=english"><bean:message key="jsp.locale.en" /></html:link></li>
		<li> <html:link action="/elements/Locale.do?method=russian"><bean:message key="jsp.locale.ru" /></html:link></li>
		</ul>
		</div>
		
		<ul class="nav nav-tabs">
		<li><a data-toggle="tab" href="reservationPage.jsp"><bean:message
					key="jsp.tabs.reservation" /></a></li>
		<li><a data-toggle="tab" href="customerPage.jsp"><bean:message
					key="jsp.tabs.customer" /></a></li>
		<li><a data-toggle="tab" href="fareFamilyPage.jsp"><bean:message
					key="jsp.tabs.fare" /></a></li>
		<li><html:link action="/Exit"><bean:message key="jsp.tabs.exit" /></html:link></li>
		<li></li>
		
		
	</ul>	
</body>
</html>