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
    public void ejemplo1(){
        
        double millis = (new Date()).getTime();
        
        HiloFichero hiloFichero= new HiloFichero(new StrAuxV1());
        hiloFichero.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\jaime.git\\01_EjemploJava\\texto_esp.txt");
        
        HiloFichero hiloFichero2= new HiloFichero(new StrAuxV2());
        hiloFichero2.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\jaime.git\\01_EjemploJava\\texto_esp.txt");
        
        HiloFichero hiloFichero3= new HiloFichero(new StrAuxV3());
        hiloFichero3.leerFicheroEjem("C:\\Users\\student\\Desktop\\ESCUELA_JAVA\\jaime.git\\01_EjemploJava\\texto_esp.txt");
        
        double millisFinal = (new Date()).getTime();
        System.out.println("Ha tardado: " + (millisFinal - millis) + " milisegundos");
        
    }
    
}
