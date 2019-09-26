package com.sinensia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "ParamServlet", urlPatterns = {"/param"})
public class ParamServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String metodo = request.getMethod(); //Metodo HTTP Get,Post...
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");
            out.println("</head>");
            out.println("<body>");
            /*if (metodo.equalsIgnoreCase("get")) {
                out.println("<h1>Introduzca sus datos</h1>");

                out.println("<form name='form1' method='post' action='./param'>");
                out.println("<table border ='1'>");
                out.println("<tr><td>Nombre:</td>"); //TR = fila, TD= columna
                out.println("<td><input type='text' name='nombre' id='nombre'/></td></tr>");
                out.println("<tr><td>Edad:</td>"); //TR = fila, TD= columna
                out.println("<td><input type='number' name='edad' id='edad'/></td></tr>");
                out.println("</table>");

                out.println("<input type='submit' value='Enviar'/>");
                out.println("</form>");
            } else if (metodo.equalsIgnoreCase("post")) {*/
//                out.println("<h1>Datos introducidos</h1>");
//                out.println("<p>Te llamas: " + request.getParameter("nombre") + "</p>");
//                out.println("<p>Y tienes: " + request.getParameter("edad") + " años</p>");
            //}
            out.println("</body>");
            out.println("</html>");
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
