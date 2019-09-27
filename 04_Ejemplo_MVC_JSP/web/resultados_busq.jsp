<%-- 
    Document   : resultados_busq
    Created on : 26-sep-2019, 15:55:55
    Author     : alumno
--%>

<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo MVC con JSP y Servlet</title>
    </head>
    <body>
        <h1>Ejemplo MVC con JSP y Servlet</h1>
        <h2>Usuario</h2>
        <% Persona pers = (Persona) session.getAttribute("resultadoBusq"); %>
        <% if (pers != null) { %>
            <form name='formmod' method='post' action='./personas.do'>
                <label for="nombre">Nombre: </label>
                <input id="nombre" name="nombre" readonly 
                       value="<%= pers.getNombre() %>"/>
                <label for="edad">Edad </label>
                <input id="edad" name="edad" value="<%= pers.getEdad() %>"/>
                <label for="email">Email </label>
                <input id="email" name="email" value="<%= pers.getEmail()%>"/>
                <input type='submit' name='btn' value='ModificarPersona'/>
                <input type='submit' name='btn' value='EliminarPersona'/>
            </form>
        <% } else { %>            
                <span style="color: red">
                    No se han encontrado personas
                </span>
        <% } %>
    </body>
</html>
