package clasesjava;

/**
 * @author Jaime Palomo
 */
public class ProbandoString {

    public static void tratarCadenas() {
        String texto = "En un lugar de La Mancha cuyo nombre no quiero acordarme, vivia...";
        /* System.out.println(texto);
        System.out.println("Cuenta letra " + texto.charAt(3));

        //Comparación
        String texto2 = "En un lugar de Madrid... ";
        System.out.println("Comparación " + texto.compareTo(texto2));

        texto2 = texto2.substring(0, 10);
        System.out.println("Texto 2 es ahora : " + texto2);
        if (texto.contains(texto2)) {
            System.out.println("El texto contiene texto2");
        } else {
            System.out.println("El texto NO contiene texto 2");
        }

        System.out.println("\"Mancha\" está en la posicion " + texto.indexOf("Mancha"));*/
        String texto3 = "                  es                                    un    LUGAR      ";
        System.out.println(texto3);
        /*texto = texto.replace("lugar", "bar");
        System.out.println(texto);
        texto3 = texto3.trim().toUpperCase();
        System.out.println(texto3);
        texto3 = texto3.replaceAll(" +", " ");
        System.out.println(texto3);
        System.out.println("El texto tiene: " + texto3.split(" ").length);*/
        System.out.println(StringAux.quitarEspacios(texto3));
        System.out.println(StringAux.contarPalabras(texto));

    }

}
