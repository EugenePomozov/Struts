<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-nested.tld" prefix="nested"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><bean:message key="jsp.fare.title" /></title>
</head>
<body>
	<%@ include file="tabs.jsp"%>
	<html:form action="/fareFamilyPage">
		<nested:nest property="fareFamily">
			<h2>
				<b><bean:message key="jsp.fare.code" /></b>
				<nested:write property="fareFamilyCode" />
			</h2>

			<h4>
				<bean:message key="jsp.fare.components" />
			</h4>
			
			<ul>
				<nested:iterate property="ancillaryAirComponentCode">
					<li><nested:write property="ancillaryAirComponentCode" /></li>
				</nested:iterate>
			</ul>
		</nested:nest>
	</html:form>
</body>
</html>