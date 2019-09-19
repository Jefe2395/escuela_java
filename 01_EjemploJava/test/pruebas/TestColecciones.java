package pruebas;

import poo.Coche;
import poo.CocheRally;
import poo.TipoColor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Pelota;
import poo.Vehiculo;

/**
 *
 * @author usuario
 */
public class TestColecciones {

    public TestColecciones() {
    }

    //@Test
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

    //@Test
    public void sets() {
        HashSet<Pelota> pelotas = new HashSet<>();
        Pelota pel1 = new Pelota();
        Pelota pel2 = new Pelota();
        Pelota pel3 = new Pelota();
        Pelota pel4 = new Pelota();
        Pelota pel5 = new Pelota();
        Pelota pel6 = new Pelota();
        Pelota pel7 = new Pelota();
        pelotas.add(pel1);
        pelotas.add(pel2);
        pelotas.add(pel3);
        pelotas.add(pel4);
        pelotas.add(pel5);
        pelotas.add(pel6);
        pelotas.add(pel7);

        pelotas.add(pel1);
        System.out.println("Set pelotas: " + pelotas);
        assertEquals(pelotas.size(), 7);
        for (Pelota p : pelotas)
        {
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void masp()
    {
        HashMap<String, Boolean> coloresCalidos = new HashMap<>();
        coloresCalidos.put("BLANCO", false);
        coloresCalidos.put("AZUL", false);
        coloresCalidos.put("ROJO", true);
        coloresCalidos.put("VERDE", Boolean.FALSE);
        coloresCalidos.put("NARAJA", true);
        
        if(coloresCalidos.get("ROJO"))
        {
            System.out.println("Rojo es calido");
        }
        if(coloresCalidos.get("AZUL"))
        {
            System.out.println("Azul es calido");
        }
        System.out.println("VERDE es " + coloresCalidos.get("VERDE"));
        System.out.println("NARANJA es " + coloresCalidos.get("NARAJA"));
        
        coloresCalidos.put("NARAJA", false);
        System.out.println("NARANJA es " + coloresCalidos.get("NARAJA"));
    }

}
