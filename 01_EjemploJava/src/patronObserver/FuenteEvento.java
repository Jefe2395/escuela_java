package patronObserver;

/**
 * @author Jaime Palomo
 */
import java.util.Scanner;
import java.util.Observable;

public class FuenteEvento extends Observable implements Runnable {

    public void run() {
        while (true) {
            String respuesta = new Scanner(System.in).next();
            setChanged();
            notifyObservers(respuesta);
        }

    }
}
