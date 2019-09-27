package com.sinensia.modelo;
/**
 * @author student
 */
public class Juego {

    String[] palabras = {"ABEJA", "AEROPUERTO", "COMPUTADOR", "OSO",
        "JAVA", "NEVERA", "PROGRAMA", "INFORMATICA", "COMPUTACION", "COMPUTADOR","CORAZON","BANANO","PLATANO",
        "AUTOMOVIL", "PERRO", "COLOMBIA", "LONDRES", "CEPILLO", "BRAZO", "CABEZA", "CUERPO","DEPORTE","SALUD",
        "ANONYMOUS", "CUADERNO", "PANTALLA", "UBUNTU", "SEMAFORO", "LINUX", "LOBO","AMOR","MOSCA","ZANAHORIA",
        "PINGUINO", "HACKER", "SISTEMA", "ELEFANTE", "CASCADA", "JUEGOS","LARGO","BONITO","IMPOSIBLE","UNIDOS","ZOMBIE",
        "MATEMATICAS", "CALCULO", "ALGEBRA", "DICCIONARIO", "BIBLIOTECA", "COCINA","PELICULA","COMERCIAL","GRANDE","PEQUEÑO",
        "GATO", "SAPO", "JIRAFA", "FERROCARRIL", "FACEBOOK", "PERSONA","BICICLETA","CONTROL","PANTALON","AEROSOL",
        "ERROR", "COPA", "COPA", "PROGRAMADOR", "LICENCIA", "NUEVE", "PROCESADOR","GARAJE","MODERNO","TABLA","DISCOTECA",
        "LENGUAJE", "PROGRAMACION", "HERRAMIENTAS", "INTERNET", "EJECUTAR", "PROYECTO","PERIODICO","COCODRILO","TORTUGA","CABALLO",
        "APLICACION", "PERA", "SOFTWARE", "ADMINISTRACION", "VENTANA", "MANTENIMIENTO","INFORMACION","PRESIDENTE","PERSONA","GENTE",
        "NARANJA", "PRUEBA", "MANZANA", "JARRA", "CELULAR", "TELEFONO","CONTAMINACION","COLOR","ROMANO","ADIVINAR","MARCADOR",
        "INSTRUCCION", "CUADERNO", "CASA", "PALA", "ARBOL", "PUENTE", "PAPEL", "HOJA","HELICOPTERO","BARCO","GOLF","CARRERA",
        "TUBERIA", "PLOMERO", "FUTBOL", "BALONCESTO", "ESTADIO", "JEAN", "FUENTE", "LEOPARDO","REGLA","PRIMERO","SEGUNDO",
        "BLUSA", "CAMISA", "AGUA", "FUEGO", "INDUSTRIA", "AIRE","TIERRA","NATURALEZA","MIERCOLES","FOTOGRAFIA","LEON",
        "TIGRE"};
    
    private int intentos;
    private String palabra;
    int[] posiciones;

    public Juego() {
        this.intentos = 6;
        this.palabra = palabras[(int)(Math.random()*(palabras.length))];
    }
    
    public int[] descubrirLetra(char letra) {
        int cont=0;
        posiciones = new int[palabra.length()];
        for(int i=0; i<palabra.length(); i++)
        {
            if(palabra.charAt(i)==letra)
            {
                posiciones[cont] = i;
                cont++;
            }
        }
        return posiciones;
    }
    
    public void restarIntento(){
        intentos--;
    }

    public int getIntentos() {
        return intentos;
    }

    public String getPalabra() {
        return palabra;
    }

}
