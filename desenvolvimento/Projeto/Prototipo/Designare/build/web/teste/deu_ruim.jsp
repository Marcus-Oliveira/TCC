<%-- 
    Document   : index
    Created on : 24/10/2015, 16:41:59
    Author     : marcus
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERRO</title>
    </head>
    <body>
        <h1>Ocorreu um erro, por favor tente mais tarde.</h1>
        <s:property value="error_message"/>
    </body>
</html>
