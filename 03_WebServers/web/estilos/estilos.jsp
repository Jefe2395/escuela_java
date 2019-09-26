<%-- 
    Document   : estilos
    Created on : 26-sep-2019, 9:29:51
    Author     : usuario
--%>

<%@page contentType="text/css" pageEncoding="UTF-8"%>
.menu-princip
{
    display: inline-block;
    border: 2px solid green;
    margin: 3px;
    padding: 5px;
    text-style:none;
}
<% for (int i = 0; i < 10; i++) {%>
.tipo-letra-<%="tam-" + i %> {
    font-size: <%=10 + i * 2%>px;
    background-color: #9c<%=i %>c9c;
    color: #FFFF<%=55 - i *5%>;
    font-variant:<% out.print("small-caps");%>;
    <% if(i%2==0) {%>
        color: #FF0000;
        text-align: right;
    <%} %>
}
<% } %>
