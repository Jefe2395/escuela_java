package threads;

import clasesjava.StringAux;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jaime Palomo
 */
public class HiloFichero {

    private IStrAux IstrAux;

    public HiloFichero() {
        IstrAux=new StrAuxV1();
    }

    public HiloFichero(IStrAux IstrAux) {
        this.IstrAux = IstrAux;
    }

    public void crearFicheroEjem(String rutaFich) {
        String[] palabras = new String['Z' - 'A' + 1];
        Random r = new Random(new Date().getTime());
        for (char c = 'A'; c < 'Z' + 1; c++) {
            int repe = 2 + Math.abs(r.nextInt() % 8); //Numero aleatorio entre 2 y 9
            palabras[c - 'A'] = "";
            for (int i = 0; i < repe; i++) {
                palabras[c - 'A'] += "" + c;
            }
        }

        System.out.println("> " + Arrays.toString(palabras) + ",");

        //Crear ficheros
        FileWriter fich = null;

        try {
            fich = new FileWriter(rutaFich, false);
            for (int i = 0; i < 50000; i++) {
                //Numero aleatorio entre 0 y 2 (3-1)
                if (r.nextInt(3) == 0) {
                    fich.write(palabras[r.nextInt(palabras.length)]);
                }
                if (r.nextInt(3) == 0) {
                    for (int j = 0; j < 10; j++) {
                        fich.write(" ");
                    }
                }
                if (r.nextInt(12) == 0) {
                    fich.write("\n\r");
                }

            }
        } catch (IOException ioe) {
            System.out.println("Error en escritura: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Otro error: " + e.getMessage());
        } finally {
            try {
                if (fich != null) {
                    fich.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero: " + ex.getMessage());
            }
        }

    }

    public void leerFicheroEjem(String rutaFich) {
        File fich = new File(rutaFich);
        Scanner escaner = null;
        try {
            escaner = new Scanner(fich);
            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine();
                System.out.println(IstrAux.quitarEspaciosSobrantes(linea));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception e) {

            }
        }

    }

}
