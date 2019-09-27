/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Singleton porque sólo queremos un servicio por aplicación/servidor
 *
 * @author alumno
 */
public class ServicioPersona {

// <editor-fold defaultstate="collapsed" desc="Código patrón de diseño Singleton.">
    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;
    }// </editor-fold>
    private static Pattern expresionCorreo = Pattern.compile(
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern expresionContra = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
    private ArrayList<Persona> personas;

    public Persona addPersonas(String nombre, String edad, String email, String password)
            throws NumberFormatException, IOException, IllegalArgumentException {
        Matcher match = expresionCorreo.matcher(email);
        if (nombre.equals("")) {
            throw new IllegalArgumentException("El nombre es vacío");
        } else if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre es demasiado corto");
        } else if (edad.equals("")) {
            throw new NumberFormatException("La edad está vacía");
        } else if (Integer.parseInt(edad) <= 12) {
            throw new IllegalArgumentException("La edad debe ser mayor que 12");
        } else if (email.equals("")) {
            throw new IllegalArgumentException("El email esta vacio");
        } else if (!expresionCorreo.matcher(email).find()) {
            throw new IllegalArgumentException("El email no tiene el formato correcto");
        } else if (password.equals("")) {
            throw new IllegalArgumentException("La contraseña esta vacia");
        } else if (!expresionContra.matcher(password).find()) {
            throw new IllegalArgumentException("La contraseña debe ser mayor de 8 caracteres, tener al menos una minuscula, una mayuscula");
        }else{
            Persona p = new Persona(nombre, Integer.parseInt(edad), email, password);
            personas.add(p);
            return p;
        }

        
    }

    public Persona getPersona(String nombre) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    public Persona getPersonaByEmail(String email)
    {
        for(Persona p: personas)
        {
            if(p.getEmail().equalsIgnoreCase(email))
            {
                return p;
            }
        }
        return null;
    }
    public boolean eliminarPersonaByEmail(String correo)
    {
        Persona p = getPersonaByEmail(correo);
        if(p!=null)
        {
            return personas.remove(p);
        }
        return false;
        
    }
    public boolean modificarPersona(String nombre, String edad, String email)
    {
//        Persona p= getPersona(nombre);
//        Persona aux;
//        if(p!=null)
//        {
//            aux=p;
//            aux.setNombre(nombre);
//            aux.setEdad(Integer.parseInt(edad));
//            aux.setEmail(email);
//            p=aux;
//            return true;
//        }
//        return false;
        for (Persona persona : personas) {
            if(persona.getEmail().equals(email))
            {
                persona.setNombre(nombre);
                persona.setEdad(Integer.parseInt(edad));
                return true;
            }
        }
        
        return false;
    }
    
    public ArrayList<Persona> getAllPersonasByNombre(String nombre)
    {
        ArrayList<Persona> aux = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona.getNombre().equalsIgnoreCase(nombre))
                aux.add(persona);
        }
        return aux;
    }
    public ArrayList<Persona> getAllPersonasByEmail(String email)
    {
        ArrayList<Persona> aux = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona.getEmail().equalsIgnoreCase(email))
                aux.add(persona);
        }
        return aux;
    }
}
