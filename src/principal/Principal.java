package principal;
import dominio.Tablero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Principal {

    public static void main(String[] args) {
        File matriz = new File("C:\\Users\\adtda\\OneDrive\\Documentos\\mis documentos\\CEU\\1º\\2º Cuatri\\Programacion 2\\segunda-practica\\matriz.txt");
        try {
            FileReader fr = new FileReader(matriz);

        } catch (FileNotFoundException e) {}

        System.out.println(matriz);
    }

}

