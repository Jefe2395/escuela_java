package clasesjava;

/**
 * @author Jaime Palomo
 */
public class StringAux {

    private String string;

    public StringAux(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String quitarEspaciosSobrantes() {
        return quitarEspaciosSobrantes(string);
    }

    public static String quitarEspacios(String cadena) {
        String frase = "";
        cadena = cadena.trim();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ' && i + 1 < cadena.length()) {
                if (cadena.charAt(i + 1) != ' ') {
                    frase = frase + cadena.charAt(i);
                }
            } else {
                frase = frase + cadena.charAt(i);
            }
        }
        return frase;
    }

    public int contarPalabras() {
        return 0;
    }

    public static int contarPalabras(String cadena) {
        cadena = quitarEspacios(cadena);
        return cadena.split(" ").length;
    }

    public static String quitarEspaciosSobrantes(String cadena) {
        cadena = cadena.trim();
        cadena = cadena.replaceAll(" +", " ");
        return cadena;
    }

}
