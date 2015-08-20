<%-- 
    Document   : hello
    Created on : Aug 20, 2015, 10:28:47 AM
    Author     : davidchang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello :: Spring Application</title>
    </head>
    <body>
        <h1>Hello - Spring Application</h1>
        <p>Greetings, it is now <c:out value="${now}"/></p>
    </body>
</html>
