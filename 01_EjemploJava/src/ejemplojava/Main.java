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
        Coche coch = new Coche("Audi", 100, TipoColor.AMARILLO, Coche.TipoCarburante.ELECTRICO);
        coch.echarGasolina(72.12);
        coch.mostrarEstado();

        Coche otroCoche = new Coche("BMW", 130, TipoColor.NEGRO, Coche.TipoCarburante.DIESEL);
        otroCoche.echarGasolina(29.82);
        otroCoche.mostrarEstado();

        int j = 3;
        int x = j;
        j++;
        System.out.println("Nivel deposito: " + otroCoche.getNivelDeposito() + " litros");
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros");
        coch.setArrancado(true);
        coch.mostrarEstado();
        for (int i = 0; i < 40; i++) {
            coch.acelerar();

        }
        coch.echarGasolina(3);
        System.out.println("Nivel deposito: " + coch.getNivelDeposito() + " litros");
    }
}
