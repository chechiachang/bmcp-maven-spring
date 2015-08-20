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
        <title><fmt:message key="title"/></title>
    </head>
    <body>
        <h1><fmt:message key="heading"/></h1>
        <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
        <h3>Products</h3>
        <c:forEach items="${model.products}" var="product">
            <c:out value="${product.description}"/> <i><c:out value="${product.price}"/></i><br><br>
        </c:forEach>
        <br>
        <a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
    </body>
</html>
