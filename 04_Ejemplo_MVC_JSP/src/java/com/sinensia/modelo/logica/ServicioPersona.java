package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.util.ArrayList;

/**
 * Singleton porque solo queremos un servicio por aplicación/servidor.
 *
 * @author Jaime Palomo
 */
public class ServicioPersona {

    //Codigo patrón de diseño Singleton
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<Persona>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;
    }

    private ArrayList<Persona> personas;

    public Persona addPersonas(String nombre, String edad) {
        try {
            int intEdad = Integer.parseInt(edad);
            if (intEdad > 12 && !nombre.equals("")) {
                Persona p = new Persona(nombre, intEdad);
                personas.add(p);
                return p;
            }
        } catch (NumberFormatException e) {

        }
        return null;
    }

    public Persona getPersona(String nombre) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

}
