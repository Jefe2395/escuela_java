package pruebas;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import threads.HiloFichero;
import threads.StrAuxV1;
import threads.StrAuxV2;
import threads.StrAuxV3;

/**
 *
 * @author usuario
 */
public class TestColab {

    public TestColab() {
    }

    @Test
    public void hilosColaboracion() {
        Date fecha1 = new Date();
        double tiempoIni = fecha1.getTime();
        Thread hilo1 = new Thread() {
            @Override
            public void run() {
                HiloFichero h1 = new HiloFichero(new StrAuxV1());
                h1.leerFicheroEjem("C:\\Users\\usuario\\Desktop\\Escuela_Java\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");                      
            }

        };
        Thread hilo2 = new Thread() {
            @Override
            public void run() {
                HiloFichero h2 = new HiloFichero(new StrAuxV2());
                h2.leerFicheroEjem("C:\\Users\\usuario\\Desktop\\Escuela_Java\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
            }

        };
        Thread hilo3 = new Thread() {
            @Override
            public void run() {
                HiloFichero h3 = new HiloFichero(new StrAuxV3());
                h3.leerFicheroEjem("C:\\Users\\usuario\\Desktop\\Escuela_Java\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
            }

        };
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        try
        {
        hilo1.join();
        hilo2.join();
        hilo3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Error! "+ e.getMessage());
        }
        
        System.out.println("Finalizo");
        
        Date fecha2=new Date();
        double tiempoFin= fecha2.getTime();
        
        System.out.println("Tiempo entre el inicio y el fin: "+ (tiempoFin-tiempoIni)+ " milisegundos");
    }
}
