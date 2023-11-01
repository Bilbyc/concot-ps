<%--
  Created by IntelliJ IDEA.
  User: bilby
  Date: 01/11/2023
  Time: 14:41
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Título da Página</title>
</head>
<body>
<h1>ConCot</h1>
<g:form action="autenticar" controller="autenticacao">
    Login:<br/>
    <input type="text" name="login"/><br/>
    Senha:<br/>
    <input type="password" name="senha"/><br/>
    <input type="submit" value="Entrar"/>
</g:form>
</body>
</html>