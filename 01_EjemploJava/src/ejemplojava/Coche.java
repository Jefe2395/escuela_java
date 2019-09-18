package ejemplojava;

/**
 *
 * @author usuario
 */
public class Coche {

    private final byte NUMRUEDAS;
    private String marca;
    private int capacidadDeposito;
    private boolean esGasolina;
    private double nivelDeposito;
    private boolean arrancado;

    public Coche(String marca) {
        this.NUMRUEDAS = 4;
        this.marca = marca;
    }

    public Coche(String marca, int capacidadDeposito, boolean esGasolina) {
        this.NUMRUEDAS = 4;
        this.marca = marca;
        this.capacidadDeposito = capacidadDeposito;
        this.esGasolina = esGasolina;
    }

    public void echarGasolina(double cant) {
        if (cant > 0) {
            this.nivelDeposito += cant;
        }
        if (nivelDeposito > capacidadDeposito) {
            nivelDeposito = capacidadDeposito;
        }
    }

    public void acelerar() {
        if (arrancado) {
            nivelDeposito -= 0.1;
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre del coche: " + this.toString());
    }

    @Override
    public String toString() {
        return "Coche " + marca + " nivel de deposito " + getNivelDeposito();
    }

    public double getNivelDeposito() {
        return nivelDeposito;
    }

    public byte getNumRuedas() {
        return NUMRUEDAS;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

}
