package pruebas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Coche;
import poo.CocheRally;
import poo.Moto;
import poo.Pelota;
import poo.Rodable;
import poo.TipoColor;
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

        Moto miMoto= new Moto("Yamaha", "999999", 100, 50, true, TipoColor.ROJO, Vehiculo.TipoCarburante.GASOLINA);
        miVehiculo.abrirPuerta();
        miMoto.abrirPuerta();
        miMoto.acelerar();
        CocheRally cocheRa = new CocheRally(2.3f, "Set", "Rally", 100, TipoColor.ROJO, Vehiculo.TipoCarburante.GASOLINA);
        cocheRa.echarGasolina(100);
        cocheRa.mostrarEstado();
        cocheRa.setArrancado(true);
        cocheRa.acelerar();
        cocheRa.derrapar();
        cocheRa.acelerar();
        cocheRa.acelerar();
        cocheRa.mostrarEstado();
        assertEquals(cocheRa.getNivelDeposito(),99,1);
    }
    
    @Test
    public void interfaces()
    {
        Coche coche = new Coche("PEL", "111111", 100, TipoColor.ROJO, Vehiculo.TipoCarburante.GASOLINA);
        coche.echarGasolina(100);
        coche.moverse();
        //coche.mostrarEstado();
        
        Moto mot= new Moto("Yamaha", "999999", 100, 50, true, TipoColor.ROJO, Vehiculo.TipoCarburante.GASOLINA);
        mot.echarGasolina(70);
        mot.acelerar();
        mot.moverse();
        //mot.toString();
        
        Pelota bola= new Pelota();
        bola.moverse();
        
        ArrayList<Rodable> cosasQueRuedan= new ArrayList<Rodable>();
        cosasQueRuedan.add(mot);
        cosasQueRuedan.add(coche);
        cosasQueRuedan.add(bola);
        
        for(Rodable rod : cosasQueRuedan)
        {
            System.out.println("\nRodando "+ rod.toString());
            System.out.println("Ruedas: "+ rod.getNumRuedas());
            rod.moverse();
        }
    }
}
