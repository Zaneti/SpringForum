<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/stylesheet" rel="stylesheet" 
              href="/WEB-INF/resources/css/bootstrap.css"/>
        <script  type="text/javascript" 
        src="/WEB-INF/resources/js/bootstrap.js"></script>
        <!-- Inclusão do título pelo Tiles -->
        <title>
            <tiles:getAsString name="titulo"/>
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
