package operadores;

import java.util.Scanner;

public class EjemploMayor {
    public static void main(String[] args) {
        System.out.println("Ingrese el primer número: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Los numeros ingresados fueron: " + n1 + " y " + n2);
        } else {
            System.out.println("Los números ingresados fueron: " + n2 + " y " + n1);
        }

        String mensaje = (n1>n2) ? ("Los numeros ingresados fueron: " + n1 + " y " + n2) : ("Los números ingresados fueron: " + n2 + " y " + n1);
        System.out.println(mensaje);

    }
}
