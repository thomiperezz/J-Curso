package primitivos;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número entero: ");
        //String numeroDecimal = scanner.nextLine();


        try {
            //int numero = Integer.parseInt(numeroDecimal);
            int numero = scanner.nextInt();
            String numeroBinario = Integer.toBinaryString(numero);
            String numeroOctal = Integer.toOctalString(numero);
            String numeroHexadecimal = Integer.toHexString(numero);

            String mensaje = "Número decimal: " + numero + "\n" + "Numero Binario: " + numeroBinario +
                    "\n" + "Numero Octal: " + numeroOctal + "\n" + "Numero Hexadecimal: " + numeroHexadecimal;

            System.out.println(mensaje);

        } catch (InputMismatchException e) {
            System.out.println("Error, ingresar un número válido..");
            main(args);
        }

    }
}
