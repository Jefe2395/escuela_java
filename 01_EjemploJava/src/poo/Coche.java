package poo;

/**
 *
 * @author usuario
 */
public class Coche extends Vehiculo implements Rodable {

    private final byte NUMRUEDAS = 4;

    public Coche(String marca, String matricula, int capacidadDeposito, double nivelDeposito, boolean arrancado, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, capacidadDeposito, nivelDeposito, arrancado, color, carburante);

    }

    public Coche(String marca, String matricula, int capacidadDeposito, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, capacidadDeposito, color, carburante);

    }

    public Coche(String marca, String matricula, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, color, carburante);

    }

    public Coche(String marca) {
        super(marca);
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
    public void acelerar() {
        if (isArrancado()) {
            explosionCilindro();
            setNivelDeposito(getNivelDeposito() - 0.1);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre del coche: " + this.toString());
    }

    @Override
    public String toString() {
        return getMarca() + "\nColor del coche: " + getColor() + "\nCapacidad deposito: " + getCapacidadDeposito()
                + "\nNivel deposito: " + getNivelDeposito() + "\nTipo de carburante: " + getCarburante() + "\nNumero de ruedas " + NUMRUEDAS + "\n";
    }

    public void compruebaColor(String color) {
        try {
            setColor(TipoColor.valueOf(color.toUpperCase()));
        } catch (IllegalArgumentException e) {
            setColor(TipoColor.valueOf("BLANCO"));
        }
    }

    public void explosionCilindro() {
        System.out.println("Motor en funcionamiento");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Abriendo las 4 puertas...");
    }

    public byte getNumRuedas() {
        return NUMRUEDAS;
    }

    @Override
    public void moverse() {
        System.out.println("AVANTI TUTO!");
    }

}
