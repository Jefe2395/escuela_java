package patronObserver;

/**
 * @author Jaime Palomo
 */
import java.util.Observable;
import java.util.Observer;
public class MiApp {
    public static void main(String[] args) {
        System.out.println("Introducir Texto: ");
        FuenteEvento fuenteEvento = new FuenteEvento();

        fuenteEvento.addObserver(new Observer(){
                @Override
                public void update(Observable obj, Object arg){
                    System.out.println("\nRespuesta recibida: " + arg);
                }
        });

        new Thread(fuenteEvento).start();
    }
}