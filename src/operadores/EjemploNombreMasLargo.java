package operadores;

import javax.swing.*;
import java.util.Arrays;

public class EjemploNombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido de la primer persona: ");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido de la segundo persona: ");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido de la tercero persona: ");

        String[] splitNombre1 = nombre1.split(" ");
        String[] splitNombre2 = nombre2.split(" ");
        String[] splitNombre3 = nombre3.split(" ");

        String nombre;
        String apellido;

        if ((splitNombre1[0].length() >= splitNombre2[0].length() && splitNombre1[1].length() >= splitNombre2[1].length() && (splitNombre1[0].length() >= splitNombre3[0].length()) && splitNombre1[1].length() >= splitNombre3[1].length())) {
            nombre = splitNombre1[0];
            apellido = splitNombre1[1];
        } else if ((splitNombre2[0].length() >= splitNombre1[0].length() && splitNombre2[1].length() >= splitNombre1[1].length() && (splitNombre2[0].length() >= splitNombre3[0].length()) && splitNombre2[1].length() >= splitNombre3[1].length())) {
            nombre = splitNombre2[0];
            apellido = splitNombre2[1];
        } else {
            nombre = splitNombre3[0];
            apellido = splitNombre3[1];
        }
        JOptionPane.showMessageDialog(null, nombre + " " + apellido + " tiene el nombre más largo..");

    }
}
