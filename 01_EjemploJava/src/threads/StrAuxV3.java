package threads;

/**
 * @author Jaime Palomo
 */
public class StrAuxV3 implements IStrAux {

    @Override
    public String quitarEspaciosSobrantes(String texto) {
        texto = texto.trim();

        while (texto.contains("  ")) {
            texto = texto.replace("  ", " ");
        }
        return texto;
    }

    @Override
    public int contarPalabras(String texto) {
        int contador = 1;
        texto = texto.trim();
        if (texto.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < texto.length() - 1; i++) {
                if (texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' ') {
                    contador++;
                }
            }
        }
        return contador;
    }

}
