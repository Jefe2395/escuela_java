package pruebas;

import poo.Coche;
import poo.CocheRally;
import poo.TipoColor;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Vehiculo;

/**
 *
 * @author usuario
 */
public class TestColecciones {

    public TestColecciones() {
    }

    @Test
    public void arrays() {
        Coche[] coches = new Coche[3];
        coches[0] = new Coche("Ford", "912339103", TipoColor.NEGRO, Coche.TipoCarburante.DIESEL);
        coches[1] = new Coche("Seat", "PG2323FE", TipoColor.BLANCO, Coche.TipoCarburante.ELECTRICO);
        coches[2] = new Coche("Toyota", "per213", TipoColor.AZUL, Coche.TipoCarburante.GASOLINA);

        Coche[] cochesBis = {coches[2], coches[1], coches[0]}; //Copia inversa del array

        Coche[] cochesBis2 = {coches[2], coches[1], new Coche("BMW", "defrew", TipoColor.ROJO, Coche.TipoCarburante.GASOLINA)};

        Coche elMio = new Coche("Audi", "Dale23", TipoColor.NEGRO, Coche.TipoCarburante.GASOLINA);
        elMio = coches[2];
        elMio.setArrancado(true);
        coches[2].acelerar();

        ArrayList arrayListObj = new ArrayList(); //ArraList NO generico
        arrayListObj.add(43);
        arrayListObj.add("AAAAAAAa");
        arrayListObj.add(elMio);
        arrayListObj.add(false);

        for (Object obj : arrayListObj) {
            System.out.println("OBJ: " + obj);
        }

        ArrayList<Integer> ventasAnuales = new ArrayList<Integer>(); //ArrayList generico
        Integer objEntero = new Integer(123);
        objEntero.longValue();
        ventasAnuales.add(objEntero);
        ventasAnuales.add(300000);

        ArrayList<Coche> cochesParaVender = new ArrayList<Coche>();
        cochesParaVender.add(new Coche("Toyota", "verde", 100, TipoColor.AZUL, Vehiculo.TipoCarburante.DIESEL));
        cochesParaVender.add(coches[0]);
        cochesParaVender.add(coches[1]);
        cochesParaVender.add(coches[2]);
        cochesParaVender.add(new CocheRally("Subaru imprezza"));

        if (cochesParaVender.contains(coches[0])) {
            System.out.println("El coche existe");
        }
        cochesParaVender.forEach((coche)
                -> {
            System.out.println("-> " + coche.toString());
        });

        cochesParaVender.forEach(TestColecciones::mostrarCoche);

    }

    public static void mostrarCoche(Coche c) {
        System.out.println(" -> " + c.toString());
    }

}
