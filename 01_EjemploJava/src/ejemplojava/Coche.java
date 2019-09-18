package ejemplojava;

/**
 *
 * @author usuario
 */
public class Coche {

    enum TipoCarburante {
        GASOLINA, DIESEL, ELECTRICO
    };
    private final byte NUMRUEDAS;
    private final String marca;

    private int capacidadDeposito;
    private double nivelDeposito;
    private boolean arrancado;
    private TipoColor color;
    private TipoCarburante carburante;

    public Coche(String marca, TipoColor color, TipoCarburante carbu) {
        this.NUMRUEDAS = 4;
        this.marca = marca;
        this.color = color;
        this.carburante = carbu;
        this.capacidadDeposito = 100;
    }

    public Coche(String marca, String color, TipoCarburante carbu) {
        this.NUMRUEDAS = 4;
        this.marca = marca;
        compruebaColor(color);
        this.carburante = carbu;
        this.capacidadDeposito = 100;
    }

    public Coche(String marca, int capacidadDeposito, TipoColor color, TipoCarburante carbu) {
        this.NUMRUEDAS = 4;
        this.marca = marca;
        this.capacidadDeposito = capacidadDeposito;
        this.color = color;
        this.carburante = carbu;
    }

    public Coche() {
        this.NUMRUEDAS = 4;
        this.marca = "";
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
            explosionCilindro();
            nivelDeposito -= 0.1;
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre del coche: " + this.toString());
    }

    @Override
    public String toString() {
        return marca + "\nColor del coche: " + color + "\nCapacidad deposito: " + capacidadDeposito
                + "\nNivel deposito: " + nivelDeposito + "\nTipo de carburante: " + carburante + "\nNumero de ruedas " + NUMRUEDAS + "\n";
    }

    public double getNivelDeposito() {
        return nivelDeposito;
    }

    public byte getNumRuedas() {
        return NUMRUEDAS;
    }

    public TipoCarburante getCarburante() {
        return carburante;
    }

    public TipoColor getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    protected void setNivelDeposito(double nivelDeposito) {
        this.nivelDeposito = nivelDeposito;
    }
    

    public void compruebaColor(String color) {
        try {
            this.color = TipoColor.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            this.color = TipoColor.valueOf("BLANCO");
        }
    }

    protected void explosionCilindro() {
           System.out.println("Motor en funcionamiento");
    }

}
