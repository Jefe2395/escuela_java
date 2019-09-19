package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;
import poo.Moto;
import poo.Vehiculo;

/**
 *
 * @author usuario
 */
public class TestAbstractInterfaces {

    public TestAbstractInterfaces() {
    }

    @Test
    public void absrtractos() {
        Vehiculo miVehiculo = new Vehiculo() {
            @Override
            public void abrirPuerta() {
                System.out.println("Abriendo puertas....");
            }

            @Override
            public void acelerar() {
                System.out.println("Acelerando...");
            }

            @Override
            public void echarGasolina(double cant) {
                System.out.println("Echando gasolina...");
            }
        };
        
        Vehiculo miMoto= new Moto();
        miVehiculo.abrirPuerta();
        miMoto.abrirPuerta();
        miMoto.acelerar();
    }
}
