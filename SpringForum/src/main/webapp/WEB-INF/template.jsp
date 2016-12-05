<%-- 
    Document   : template
    Created on : 04/12/2016, 10:23:48
    Author     : rafaelz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="<c:url value='/WEB-INF/resources/css/bootstrap.css'/>"  rel="stylesheet"/>
        <link href="<c:url value='/WEB-INF/resources/css/style.css'/>" rel="stylesheet"/>
        <!-- Inclusão do título pelo Tiles -->
        <title>
            <tiles:getAsString name="titulo" />
        </title>
    </head>
    <body>
        <!-- Inclusão do cabeçalho -->
    <tiles:insertAttribute name="header"/>
    <!-- Inclusão do conteúdo -->
    <tiles:insertAttribute name="content"/>
    <!-- Inclusão do rodapé -->
    <tiles:insertAttribute name="footer"/>
</body>
</html>
