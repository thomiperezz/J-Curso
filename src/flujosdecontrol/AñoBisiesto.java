package flujosdecontrol;

import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        System.out.println("Introduzca un mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduzca un año: ");
        int anio = sc.nextInt();

        /*
        if (mes==1 || mes==3 || mes == 5 || mes == 7 || mes ==8 || mes == 10 || mes == 12) {
            dia=31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes==11) {
            dia=30;
        } else {
            if ((anio%400==0 && anio%100==0) || (anio%4==0 && anio%100!=0)) {
                dia=29;
            } else {
                dia=28;
            }

        }
        */

        //segunda forma de hacer con switch case
        switch(mes) {
            case 1:
                dia=31;
                break;
            case 2:
                if ((anio%400==0 && anio%100==0) || (anio%4==0 && anio%100!=0)) {
                    dia=29;
                } else {
                    dia=28;
                }
                break;
            case 3:
                dia=31;
                break;
            case 4:
                dia=30;
                break;
            case 5:
                dia=31;
                break;
            case 6:
                dia=30;
                break;
            case 7:
                dia=31;
                break;
            case 8:
                dia=31;
                break;
            case 9:
                dia=30;
                break;
            case 10:
                dia=31;
                break;
            case 11:
                dia=30;
                break;
            case 12:
                dia=31;
                break;
        }
        System.out.println("Dia: " + dia + "\nMes: " + mes + "\nAnio: " + anio);
    }
}
