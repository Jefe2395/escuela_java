package pruebas;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;
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
        
        Observer ob = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                Date fecha2 = new Date();
                double tiempoFin = fecha2.getTime();
                System.out.println("Tiempo entre el inicio y el fin: " + (tiempoFin - tiempoIni) + " milisegundos");
            }
        };
        
        Thread hilo1 = new Thread(){
            @Override
            public void run() {
                HiloFichero h1 = new HiloFichero(new StrAuxV1());
                h1.addObserver(ob);
                h1.leerFicheroEjem("texto_esp.txt");
                ob.update(h1, h1);
            }

        };
        Thread hilo2 = new Thread() {
            @Override
            public void run() {
                HiloFichero h2 = new HiloFichero(new StrAuxV2());
                h2.addObserver(ob);
                h2.leerFicheroEjem("texto_esp.txt");
                ob.update(h2, h2);
            }

        };
        Thread hilo3 = new Thread() {
            @Override
            public void run() {
                HiloFichero h3 = new HiloFichero(new StrAuxV3());
                h3.addObserver(ob);
                h3.leerFicheroEjem("texto_esp.txt");
                ob.update(h3, h3);
            }

        };

        hilo1.start();
        hilo2.start();
        hilo3.start();
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            System.out.println("Error! " + e.getMessage());
        }
        Date fecha2 = new Date();
        double tiempoFin = fecha2.getTime();

        
    }
    @Test
    public void ejemplo1(){
        
        double millis = (new Date()).getTime();
        HiloFichero hiloFichero= new HiloFichero(new StrAuxV1());
        hiloFichero.leerFicheroEjem("texto_esp.txt");
        double millis2 = (new Date()).getTime();
        HiloFichero hiloFichero2= new HiloFichero(new StrAuxV2());
        hiloFichero2.leerFicheroEjem("texto_esp.txt");
        double millis3 = (new Date()).getTime();
        HiloFichero hiloFichero3= new HiloFichero(new StrAuxV3());
        hiloFichero3.leerFicheroEjem("texto_esp.txt");
        double millisFinal = (new Date()).getTime();
        
        System.out.println("\nHa tardado: " + (millis2 - millis) + " milisegundos primera ejecucion");
        System.out.println("Ha tardado: " + (millis3 - millis2) + " milisegundos segunda");
        System.out.println("Ha tardado: " + (millisFinal - millis3) + " milisegundos tercera");
        System.out.println("Ha tardado: " + (millisFinal - millis) + " milisegundos en total");
        
    }
    
}
