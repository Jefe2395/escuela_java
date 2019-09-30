<%-- 
    Document   : index.jsp
    Created on : 27-sep-2019, 15:47:52
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
!<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="estilos/style.css">
        <title>Ahorcado</title>

    </head>
    <body>
        <div class="container">
            <div class="row justify-content-center">		
                <h2>El maravilloso juego del Ahocardo</h2>
            </div>
            
            <% 
                for (int i = 0; i< ((String)session.getAttribute("palabra")).length(); i++) {
                    
                }


            %>


















            <div class="row justify-content-center">
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="A" value="A">A</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="B" value="B">B</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="C" value="C">C</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="D" value="D">D</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="E" value="E">E</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="F" value="F">F</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="G" value="G">G</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="H" value="H">H</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="I" value="I">I</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="J" value="J">J</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="K" value="K">K</button>

                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="L" value="L">L</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="M" value="M">M</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="Ñ" value="Ñ">Ñ</button>
                </div>
            <div class="row justify-content-center">
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="O" value="O">O</button>
            
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="P" value="P">P</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="Q" value="Q">Q</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="R" value="R">R</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="T" value="T">T</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="S" value="S">S</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="U" value="U">U</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="V" value="V">V</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="W" value="W">W</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="X" value="X">X</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="Y" value="Y">Y</button>
                <button type="button" class="btn btn-outline-primary m-1 tamFijo" name="Z" value="Z">Z</button>  
            </div>

        </div>


    </div>

</body>
</html>