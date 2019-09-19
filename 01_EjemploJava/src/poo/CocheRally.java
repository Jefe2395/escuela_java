package poo;

/**
 * @author Jaime Palomo
 */
public class CocheRally extends Coche {

    private float rozamiento;

    public CocheRally(String marca) {
        super(marca);
        this.rozamiento = 3.14f;
    }

    public CocheRally(float rozamiento, String marca, String matricula, int capacidadDeposito, double nivelDeposito, boolean arrancado, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, capacidadDeposito, nivelDeposito, arrancado, color, carburante);
        this.rozamiento = rozamiento;
    }

    public CocheRally(float rozamiento, String marca, String matricula, int capacidadDeposito, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, capacidadDeposito, color, carburante);
        this.rozamiento = rozamiento;
    }

    public CocheRally(float rozamiento, String marca, String matricula, TipoColor color, TipoCarburante carburante) {
        super(marca, matricula, color, carburante);
        this.rozamiento = rozamiento;
    }

    public float getRozamiento() {
        return rozamiento;
    }

    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    public void derrapar() {
        System.out.println("Derrapa!!!!!!");
        super.explosionCilindro();
    }

    //Sobrecarga de metodos
    public void derrapar(float cuanto) {
        System.out.println("Derrapa!!!!!! de " + cuanto + " newtons");
        super.explosionCilindro();
    }

    //Sobreescritura de metodos
    @Override
    public void acelerar() {
        if (isArrancado()) {
            System.out.println("MOTOR AL MAXIMO!!!!!");
            explosionCilindro();
            setNivelDeposito(getNivelDeposito() - 0.4);

        }
    }

}
