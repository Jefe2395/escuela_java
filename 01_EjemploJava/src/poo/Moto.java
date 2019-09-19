package poo;
/**
 * @author Jaime Palomo
 */
public class Moto extends Vehiculo {

    @Override
    public void abrirPuerta() {
        System.out.println("No hay puertas, puedes saltar");
    }

    @Override
    public void acelerar() {
        System.out.println("Gira el manillar a tope!");
                
    }

    @Override
    public void echarGasolina(double cant) {
        if (cant > 0) {
            setNivelDeposito(getNivelDeposito()+ cant);
        }
        if (getNivelDeposito() > getCapacidadDeposito()) {
            setNivelDeposito(getCapacidadDeposito());
        }
    }

}
