package flujosdecontrol;

import java.util.Scanner;

public class EjemploMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el número del mes: ");
        int numeroMes = sc.nextInt();
        String mes = "";

        switch(numeroMes) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes="Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes="Diciembre";
                break;
        }
        System.out.println("El mes ingresado es: " + mes);
    }
}
