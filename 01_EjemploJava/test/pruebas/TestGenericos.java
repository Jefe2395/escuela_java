package pruebas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class TestGenericos {

    public TestGenericos() {
    }

    @Test
    public void metodosGenericos() {
        ArrayList<Integer> listaInt = new ArrayList<Integer>();
        insertarDobleGenerico(listaInt, 10);
        insertarDobleGenerico(listaInt, 21);
        System.out.println("Enteros: " + listaInt.toString());

        ArrayList<String> listaStr = new ArrayList<String>();
        insertarDobleGenerico(listaStr, "Texto1");
        insertarDobleGenerico(listaStr, "Texto2");
        System.out.println("Textos " + listaStr.toString());

        Float[] arrF = {1.1f, 2.2f, 3.3f};
        convertirEnArrayList(arrF);
        mostrarGenerico(arrF);
    }

    public static <Tipo> void insertarDobleGenerico(ArrayList<Tipo> lista, Tipo valor) {
        lista.add(valor);
        lista.add(valor);
    }

    public static <Tipo> void mostrarGenerico(Tipo[] lista) {

        for (Object obj : lista) {
            System.out.println(obj.toString());
        }
    }

    public static <Tipo> ArrayList convertirEnArrayList(Tipo[] array) {
        ArrayList<Tipo> lista = new ArrayList<Tipo>();
        //lista.addAll(Arrays.asList(array));
        for (Tipo obj : array) {
            lista.add(obj);
        }
        return lista;
    }
}
