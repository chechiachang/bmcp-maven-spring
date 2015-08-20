<%-- 
    Document   : priceincrease
    Created on : Aug 20, 2015, 3:03:12 PM
    Author     : davidchang
--%>
<%@include file="/WEB-INF/jsp/include.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title"/></title>
        <style>
            .error{color:red;}
            table{
                width:95%;
                background-color:rgb(245,245,255);
                border-width: 0px;
            }
        </style>
    </head>
    <body>
        <h1><fmt:message key="priceincrease.heading"/></h1>
        <form:form method="post" commandName="priceIncrease">
            <table cellspacing="0" cellpadding="5">
                <tr>
                    <td align="right" width="20%">Increase (%):</td>
                    <td width="20%"><form:input path="percentage"/></td>
                    <td width="60%"><form:errors path="percentage" cssClass="error"/></td>
                </tr>
            </table>
            <br>
            <input type="submit" align="center" value="Execute">
        </form:form>
            <a href="<c:url value="hello.htm"/>">Home</a>
    </body>
</html>
