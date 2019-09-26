<%-- 
    Document   : registro
    Created on : 26-sep-2019, 10:24:51
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./estilos/estilos.jsp"/>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <form name='form1' method='post' action='./param.jsp'>
            <table border ='1'>
                <tr><td>Nombre:</td> 
                    <td><input type='text' name='nombre' id='nombre'/></td></tr>
                <tr><td>Edad:</td> 
                    <td><input type='number' name='edad' id='edad'/></td></tr>
                <tr><td>Email:</td> 
                    <td><input type='email' name='email' id='email'/></td></tr>
                <tr><td>Contraseña:</td> 
                    <td><input type='password' name='password' id='password'/></td></tr>
            </table>

            <input type='submit' value='Enviar'/>
        </form>
    </body>
</html>
