package pruebas;

import clasesjava.ProbandoString;
import clasesjava.StringAux;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class StringAuxPrueba {

    public StringAuxPrueba() {

    }

    @Test
    public void probarquitarEspacios() {
        String texto1 = "En un lugar de La Mancha cuyo nombre no quiero acordarme, vivia...";
        String texto2 = "En un lugar de Madrid... ";
        String texto3 = "         en     un     LUGAR";
        String resultadoOK = "en un LUGAR";

        StringAux texto = new StringAux(texto3);

        String resultadoAux = texto.quitarEspaciosSobrantes(); //Futura llamada

        assertEquals(resultadoOK, resultadoAux);
    }
    
    @Test
    public void probacontarPalabras()
    {
        assertEquals(5, StringAux.contarPalabras("En un lugar de Madrid......"));
        assertEquals(3, StringAux.contarPalabras("          en    un     LUGAR   "));
        assertEquals(0, StringAux.contarPalabras("         "));
        assertEquals(1, StringAux.contarPalabras("aaaaaaaaa"));
    }

}
