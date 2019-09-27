/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.sinensia.modelo.Persona;
import com.sinensia.modelo.logica.ServicioPersona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
public class ControladorPersonasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String button= request.getParameter("btn");
        if(button.equals("BuscarNombre"))
        {
            String nombre = request.getParameter("nombre"); // name del INPUT
            ArrayList<Persona> p = ServicioPersona.getInstancia().getAllPersonasByNombre(nombre);
            request.getSession().setAttribute("resultadoBusq", p);
            request.getRequestDispatcher("resultados_busq.jsp").forward(request, response);
        }
        
        if(button.equals("BuscarEmail"))
        {
            String email = request.getParameter("email");
            Persona p = ServicioPersona.getInstancia().getPersonaByEmail(email);
            request.getSession().setAttribute("resultadoBusq", p);
            request.getRequestDispatcher("resultados_busq.jsp").forward(request, response);
        }
        
        // String edad = request.getParameter("edad");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String button= request.getParameter("btn");
        
        if(button.equals("Enviar")){
            // request.getSession().setMaxInactiveInterval(60);
            String nombre = request.getParameter("nombre"); // name del INPUT
            String edad = request.getParameter("edad"); 
            String email = request.getParameter("email");
            String password = request.getParameter("psw");

            try {
                Persona p = ServicioPersona.getInstancia().addPersonas(nombre, edad, email, password);
                if (p == null) {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                } else {
                     request.getRequestDispatcher("exito.jsp").forward(request, response);          
                }
            } catch (NumberFormatException ex) {
                request.getSession().setAttribute("mensajeError", "Error numérico: " + ex.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } catch (IllegalArgumentException ex) {
                request.getSession().setAttribute("mensajeError", "Error en campos: " + ex.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);            
            } catch (Exception ex) {
                request.getSession().setAttribute("mensajeError", "Error genérico: " + ex.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);            
            }
            
        }
        
        if(button.equals("EliminarPersona"))
        {
            String nombre = request.getParameter("nombre");
            if (ServicioPersona.getInstancia().eliminarPersonaByNombre(nombre)) {
                    request.getRequestDispatcher("exitoBorrado.jsp").forward(request, response);
            } else {
                 request.getRequestDispatcher("errorBorrado.jsp").forward(request, response);          
            }
        }
        if(button.equals("ModificarPersona"))
        {
            String nombre = request.getParameter("nombre");
            String edad = request.getParameter("edad");
            String email = request.getParameter("email");
            if (ServicioPersona.getInstancia().modificarPersona(nombre, edad, email)) {
                    request.getRequestDispatcher("exitoModificar.jsp").forward(request, response);
            } else {
                 request.getRequestDispatcher("errorModificado.jsp").forward(request, response);          
            }
        }
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
