package pruebas;

import org.junit.Test;
import pruebas.TestEjemplosHilos.ProcesoA;
import threads.HiloFichero;
import threads.StrAuxV1;
import threads.StrAuxV2;

/**
 * @author Jaime Palomo
 */
public class TestFicheros {
    
    public TestFicheros()
    {        
    }
    
    @Test
    public void generacionFicheroAleatorio()
    {
        HiloFichero hilo= new HiloFichero();
        hilo.crearFicheroEjem("C:\\Users\\usuario\\Desktop\\Escuela_Java\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
    }
    //@Test
    public void leerFichero()
    {
        HiloFichero hilo= new HiloFichero(new StrAuxV1());
        hilo.leerFicheroEjem("C:\\Users\\usuario\\Desktop\\Escuela_Java\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
        
        //ProcesoA nuevoObj= new ProcesoA();
        
    }
}
