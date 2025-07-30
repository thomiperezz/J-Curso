package strings;

public class EjemploExtensionArchivos {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.js";


        int posicionSeparador = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(\".\") = " + archivo.substring(posicionSeparador, archivo.length()));

    }
}
