/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

import poo.TipoColor;
import poo.CocheRally;
import poo.Coche;
import clasesjava.ProbandoString;
import poo.Vehiculo;

/**
 *
 * @author usuario
 */
public class Main {

    /*public static void main(String[] args) {
        ProbandoString.tratarCadenas();
        
    }*/

    public static void main(String[] args) {
        System.out.println("Empezando POO");
        Coche coch = new Coche("Audi", "333gbg019", TipoColor.ROJO, Vehiculo.TipoCarburante.GASOLINA);
        coch.echarGasolina(72.12);
        coch.mostrarEstado();

        Coche otroCoche = new Coche("BMW", "p93232jh", TipoColor.NEGRO, Coche.TipoCarburante.DIESEL);
        otroCoche.echarGasolina(29.82);
        otroCoche.mostrarEstado();

        int j = 3;
        int x = j;
        j++;
        System.out.println("Nivel deposito: " + otroCoche.getNivelDeposito() + " litros");
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros\n");
        coch.setArrancado(true);
        coch.mostrarEstado();
        for (int i = 0; i < 5; i++) {
            coch.acelerar();

        }
        coch.echarGasolina(3);
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros\n");

        coch.acelerar();
        coch.mostrarEstado();

        CocheRally cocheRa = new CocheRally(1.7f, "Seat", "IloveRally", TipoColor.NEGRO, Vehiculo.TipoCarburante.GASOLINA);
        cocheRa.echarGasolina(100);
        cocheRa.mostrarEstado();
        cocheRa.setArrancado(true);
        cocheRa.acelerar();
        cocheRa.derrapar();
        cocheRa.mostrarEstado();
        cocheRa.acelerar();
        cocheRa.acelerar();
        cocheRa.mostrarEstado();

        Coche seatNormal = cocheRa; //Conversión implicita 
        seatNormal.explosionCilindro();
        seatNormal.acelerar();
        seatNormal.mostrarEstado();

        CocheRally cr = (CocheRally) seatNormal; //Conversión explicita o casting
        System.out.println("Y el rozamiento es :" + cr.getRozamiento());

    }
}
