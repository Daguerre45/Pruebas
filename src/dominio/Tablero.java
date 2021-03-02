package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tablero {

    public void leerEstadoActual() {
        File matriz = new File("C:\\Users\\adtda\\OneDrive\\Documentos\\mis documentos\\CEU\\1º\\2º Cuatri\\Programacion 2\\segunda-practica\\matriz.txt");
        try {
            FileReader fr = new FileReader(matriz);
            System.out.println(matriz);
        } catch (FileNotFoundException e) {}
    }
}
