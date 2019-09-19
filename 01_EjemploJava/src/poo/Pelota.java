package poo;
/**
 * @author Jaime Palomo
 */
public class Pelota implements Rodable {

    @Override
    public byte getNumRuedas() {
        return 1;
    }

    @Override
    public void moverse() {
        System.out.println("Bota y rebota");
    }

    @Override
    public String toString() {
        return "Pelota de playa";
    }

}
