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
    
    public CocheRally(float rozamiento, String marca, String color, TipoCarburante carbu) {
        super(marca, color, carbu);
        this.rozamiento = rozamiento;
    }

    public CocheRally(float rozamiento, String marca, TipoColor color, TipoCarburante carbu) {
        super(marca, color, carbu);
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
