package poo;

/**
 * @author Jaime Palomo
 */
public abstract class Vehiculo {

    public enum TipoCarburante {
        GASOLINA, DIESEL, ELECTRICO
    };
    private String matricula;
    private int capacidadDeposito;
    private double nivelDeposito;
    private boolean arrancado;
    private TipoColor color;
    private TipoCarburante carburante;

    public Vehiculo() {

    }

    public Vehiculo(String matricula, int capacidadDeposito, double nivelDeposito, boolean arrancado, TipoColor color, TipoCarburante carburante) {
        this.matricula = matricula;
        this.capacidadDeposito = capacidadDeposito;
        this.nivelDeposito = nivelDeposito;
        this.arrancado = arrancado;
        this.color = color;
        this.carburante = carburante;
    }

    public Vehiculo(String matricula, int capacidadDeposito, TipoColor color, TipoCarburante carburante) {
        this.matricula = matricula;
        this.capacidadDeposito = capacidadDeposito;
        this.color = color;
        this.carburante = carburante;
    }

    public Vehiculo(String matricula, TipoColor color, TipoCarburante carburante) {
        this.matricula = matricula;
        this.color = color;
        this.carburante = carburante;
    }
    
    

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public abstract void echarGasolina(double cant);

    public abstract void abrirPuerta();

    public abstract void acelerar();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public double getNivelDeposito() {
        return nivelDeposito;
    }

    public void setNivelDeposito(double nivelDeposito) {
        this.nivelDeposito = nivelDeposito;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public TipoCarburante getCarburante() {
        return carburante;
    }

    public void setCarburante(TipoCarburante carburante) {
        this.carburante = carburante;
    }

}
//VEHICULO DECLARA (NO IMPLEMENTA) ALGUNOS METODOS
