package primitivos;

import javax.swing.*;

public class EntradaDatos {
    public static void main(String[] args) {
        String numeroDecimal = JOptionPane.showInputDialog(null,"Ingresar un número entero: ");

        try {
            int numero = Integer.parseInt(numeroDecimal);
            String numeroBinario = Integer.toBinaryString(numero);
            String numeroOctal = Integer.toOctalString(numero);
            String numeroHexadecimal = Integer.toHexString(numero);

            String mensaje = "Número decimal: " + numeroDecimal + "\n" + "Numero Binario: " + numeroBinario +
                    "\n" + "Numero Octal: " + numeroOctal + "\n" + "Numero Hexadecimal: " + numeroHexadecimal;

            JOptionPane.showMessageDialog(null, mensaje);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, ingresar un número válido..");
            main(args);
            System.exit(0);
        }

    }
}
