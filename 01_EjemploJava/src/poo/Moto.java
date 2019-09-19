package poo;

/**
 * @author Jaime Palomo
 */
public class Moto extends Vehiculo implements Rodable{
    public static final byte NUMRUEDAS=2;
    @Override
    public void abrirPuerta() {
        System.out.println("No hay puertas, puedes saltar");
    }

    @Override
    public void acelerar() {
        System.out.println("Gira el manillar a tope!");

    }

    public Moto(String marca, String matricula, int capacidadDeposito, double nivelDeposito, boolean arrancado, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, capacidadDeposito, nivelDeposito, arrancado, color, carburante);
    }
    
    @Override
    public void echarGasolina(double cant) {
        if (cant > 0) {
            setNivelDeposito(getNivelDeposito() + cant);
        }
        if (getNivelDeposito() > getCapacidadDeposito()) {
            setNivelDeposito(getCapacidadDeposito());
        }
    }

    @Override
    public byte getNumRuedas() {
        return NUMRUEDAS;
    }

    @Override
    public void moverse() {
        System.out.println("A TODA PASTILLA!!!");
    }
    @Override
    public String toString() {
        return getMarca() + "\nColor del coche: " + getColor() + "\nCapacidad deposito: " + getCapacidadDeposito()
                + "\nNivel deposito: " + getNivelDeposito() + "\nTipo de carburante: " + getCarburante() + "\n";
    }
    

}
