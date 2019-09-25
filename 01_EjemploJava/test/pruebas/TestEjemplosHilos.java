package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TestEjemplosHilos {

    public class ProcesoA extends Thread {

        @Override
        public void run() {
            mostrarLista();
        }

        public void mostrarLista() {
            for (int i = 0; i < 200; i++) {
                try {
                    System.out.println("Proceso A: " + i);
                    Thread.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestEjemplosHilos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public TestEjemplosHilos() {
    }

    @Test
    public void probandoClasesConNombre() {

        ProcesoA procA = new ProcesoA();
        Thread procB = new Thread() {
            @Override
            public void run() {
                for (int j = 0; j < 200; j++) {
                    try {
                        System.out.println("Proceso B: " + j);
                        Thread.sleep(3);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestEjemplosHilos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        };
       
        procA.start();
        procB.start();
        try {
            procA.join();
            procB.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestEjemplosHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
