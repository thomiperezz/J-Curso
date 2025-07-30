package operadores;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de gasolina del tanque: ");
        try {
            Double entradaDouble = entrada.nextDouble();
            String mensaje = "";
            if (entradaDouble > 70 || entradaDouble<=1) {
                System.out.println("Ingresar un valor válido..");;
                main(args);
            } else {
                if (entradaDouble==70d) {
                    mensaje = "Estanque lleno..";
                } else if (entradaDouble<70 && entradaDouble>=60) {
                    mensaje = "Estanque casi lleno..";
                } else if (entradaDouble<60 && entradaDouble>=40) {
                    mensaje = "Estanque 3/4..";
                } else if (entradaDouble<40 && entradaDouble>=35) {
                    mensaje = "Medio Estanque..";
                } else if (entradaDouble<35 && entradaDouble>=30) {
                    mensaje = "Suficiente..";
                } else {
                    mensaje="Insuficiente..";
                }
            }
            System.out.println(mensaje);
        } catch (Exception e) {
            System.out.println("Ingresar un valor válido..");
            main(args);
        }
    }
}
