/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Empezando POO");
        Coche coch = new Coche("Audi",100,true);
        coch.echarGasolina(72.12);

        System.out.println("Coche creado: " + coch.getMarca());
        System.out.println("Capacidad deposito: " + coch.getCapacidadDeposito());
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros");
        System.out.println("Es gasolina? " + coch.isEsGasolina());
        System.out.println("Numero ruedas" + coch.getNumRuedas());

        Coche otroCoche = new Coche("BMW",130,true);
        otroCoche.echarGasolina(29.82);

        System.out.println("Coche creado: " + otroCoche.getMarca());
        System.out.println("Capacidad deposito: " + otroCoche.getCapacidadDeposito());
        System.out.println("Nivel deposito: " + otroCoche.getNivelDeposito() + " litros");
        System.out.println("Es gasolina? " + otroCoche.isEsGasolina());
        System.out.println("Numero ruedas " + otroCoche.getNumRuedas());

        int j = 3;
        int x = j;
        j++;
        System.out.println("Nivel deposito: " + otroCoche.getNivelDeposito() + " litros");
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros");
        coch.setArrancado(true);
        for (int i = 0; i < 40; i++) {
            coch.acelerar();
            coch.mostrarEstado();
        }
        coch.echarGasolina(3);
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros");
    }
}
