<%-- 
    Document   : param
    Created on : 25-sep-2019, 17:36:59
    Author     : usuario
--%>
<%@include file="head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%= head("Registro")%>
    <body>
        <%@include file="cabecera.jsp" %>
        <h1>Datos</h1>
        <p>Te llamas <% out.println(request.getParameter("nombre"));%></p>
        <p>Y tienes: <% out.println(request.getParameter("edad"));%></p>
        <p>Tu email es: <% out.println(request.getParameter("email"));%></p>
        <p>Con la contraseña: <% out.println(request.getParameter("password"));%></p>
        <ul>
            <%for (int i = 0; i < 10; i++) { %>
            <li class="tipo-letra-tam-<%=i%> ">Numero : <%= i %></li>
            <!--<li>NumeroForma : <% out.println("" + i); %></li>-->
            <%}%>
        <ul>
    </body>
</html>
