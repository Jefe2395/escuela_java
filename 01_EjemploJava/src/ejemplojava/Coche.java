package ejemplojava;

/**
 *
 * @author usuario
 */
public class Coche {

    private final byte numRuedas;
    private String marca;
    private int capacidadDeposito;
    private boolean esGasolina;
    private double nivelDeposito;
    private boolean arrancado;

    public Coche(String marca) {
        this.numRuedas = 4;
        this.marca = marca;
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
        return numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public void setEsGasolina(boolean esGasolina) {
        this.esGasolina = esGasolina;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

}
