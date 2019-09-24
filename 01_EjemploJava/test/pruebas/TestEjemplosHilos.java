package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

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
                System.out.println("Proceso A: " + i);
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
                    System.out.println("Proceso B: " + j);
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
