<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles"%>
<%@ taglib uri="/tags/c" prefix="c"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
 <c:set var="user" value="Guest"/>
<tiles:insert definition="start">
	<tiles:put name="title">
		<bean:message key="jsp.login.title" />
	</tiles:put>
</tiles:insert>