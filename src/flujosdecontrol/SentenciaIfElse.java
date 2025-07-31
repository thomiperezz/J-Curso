package flujosdecontrol;

import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un promedio para ver si el alumno está aprobado o no: ");
        Float promedio = scanner.nextFloat();

        if (promedio>10 || promedio<=0) {
            System.out.println("Promedio incorrecto, ingresar un promedio entre 1 y 10;");
        }

        if (promedio>=8 && promedio<=10) { // if (condicion) {bloque de código} else {bloque de código}
            System.out.println("Alumno aprobado con excelente nota");
        } else if (promedio>=7 && promedio<8) {
            System.out.println("Alumno aprobado con buena nota");
        } else if (promedio>=(6.5) && promedio<7) {
            System.out.println("Alumno aprobado con lo justo");
        } else {
            System.out.println("Alumno desaprobado");
        }

    }
}
