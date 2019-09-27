package com.sinensia.modelo;
/**Esta clase es un POJO (Plain Old Java Object)
 * Clases sin lógica, sin herencia (o poco de...)
 * Suelen corresponder a una ENTIDAD
 * @author Jaime Palomo
 */
public class Persona {

    private String nombre;
    private int edad;
    private String email;
    private String password;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
