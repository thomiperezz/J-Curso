package strings;

import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los tres nombres de los familiares: ");
        String nombre1 = entrada.nextLine();
        String nombre2 = entrada.nextLine();
        String nombre3 = entrada.nextLine();

        String caracterMayusculaNombre1 = nombre1.toUpperCase().substring(1,2);
        System.out.println("caracterMayusculaNombre1 = " + caracterMayusculaNombre1);
        String ultimasDosLetrasNombre1 = nombre1.substring(nombre1.length()-2,nombre1.length());
        System.out.println("ultimasDosLetrasNombre1 = " + ultimasDosLetrasNombre1);

        String caracterMayusculaNombre2 = nombre2.toUpperCase().substring(1,2);
        System.out.println("caracterMayusculaNombre2 = " + caracterMayusculaNombre2);
        String ultimasDosLetrasNombre2 = nombre2.substring(nombre2.length()-2,nombre2.length());
        System.out.println("ultimasDosLetrasNombre2 = " + ultimasDosLetrasNombre2);

        String caracterMayusculaNombre3 = nombre3.toUpperCase().substring(1,2);
        System.out.println("caracterMayusculaNombre3 = " + caracterMayusculaNombre3);
        String ultimasDosLetrasNombre3 = nombre3.substring(nombre3.length()-2,nombre3.length());
        System.out.println("ultimasDosLetrasNombre3 = " + ultimasDosLetrasNombre3);

        String mensaje = caracterMayusculaNombre1 + "." + ultimasDosLetrasNombre1 + "_" +
                caracterMayusculaNombre2 + "." + ultimasDosLetrasNombre2 + "_" + caracterMayusculaNombre3 + "." + ultimasDosLetrasNombre3;
        System.out.println("mensaje = " + mensaje);

    }
}
