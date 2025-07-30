package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploStringArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] trabalenguasArray = trabalenguas.toCharArray();

        for (int i = 0; i < trabalenguasArray.length; i++) {
            System.out.print(trabalenguasArray[i] + " ");
        }

        System.out.println("\nArray = " + Arrays.toString(trabalenguasArray));

        System.out.println("--------------------------------");
        String[] trabalenguasArray2= trabalenguas.split("a");


        for (int i = 0; i < trabalenguasArray2.length; i++) {
            System.out.print(trabalenguasArray2[i] + " ");
        }

        System.out.println("\nArray spliteado = " + Arrays.toString(trabalenguasArray2));

        System.out.println("--------------------------------");
        String archivoExtension ="archivo.ejemplo.txt";

        System.out.println("archivoExtension = " + archivoExtension);

        String[] archivoExtensionArray = archivoExtension.split("\\."); // la regex se puede utilizar con \\ o con [regex]
        String extension = archivoExtensionArray[archivoExtensionArray.length - 1];
        System.out.println("extension = " + extension);
    }
}
