package threads;

/**
 * @author Jaime Palomo
 */
public class StrAuxV2 implements IStrAux {

    @Override
    public String quitarEspaciosSobrantes(String texto) {
        texto = texto.trim();
        String[] palabras = texto.split(" ");
        String result = "";
        for(String palabra : palabras)
        {
            if(! palabra.isEmpty())
            {
                result +=palabra+" ";
            }
            
        }
        return result.trim();
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


