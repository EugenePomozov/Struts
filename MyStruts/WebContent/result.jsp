<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Struts Example Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Profession : </td>
                <td><bean:write name="lookupForm" property="professionName"/></td>
            </tr>
        </table>
    </body>
</html>