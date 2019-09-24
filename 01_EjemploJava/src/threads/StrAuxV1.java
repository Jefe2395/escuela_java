package threads;

import clasesjava.StringAux;

/**
 * @author Jaime Palomo
 */
public class StrAuxV1 implements IStrAux {
    private StringAux strAux;

    public StrAuxV1() {
        this.strAux = new StringAux("");
    }
    
    
    @Override
    public String quitarEspaciosSobrantes(String texto) {
        strAux.setString(texto);
        return strAux.quitarEspaciosSobrantes();
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
