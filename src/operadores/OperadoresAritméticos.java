package operadores;

import javax.swing.*;

public class OperadoresAritméticos {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        float divisionDecimal = (float) b / (float) a;
        System.out.println("a*b = " + a*b); // operador multiplicación
        System.out.println("b/a = " + b/a); // operador división
        System.out.println("divisionDecimal = " + divisionDecimal);
        System.out.println("b%a = " + b%a); // operador resto
        System.out.println("a+b = " + a+b); // operador suma
        System.out.println("a-b = " + (a-b)); // operador resta
        System.out.println("b = " + b);

        System.out.println("---------------------------");
        a++; // operador de incremento
        System.out.println("a=a++ = " + a); // operador incremento
        a--; // operador de decremento
        System.out.println("a=a-- = " + a);

        System.out.println("-(a+b) = " + -(a+b)); // operador negativo

        System.out.println("---------------------------");
        System.out.println("b = " + b);
        int c=++b; // pre-incremento (primero se incrementa en 1 y luego se asigna el valor a la variable a)
        System.out.println("c = " + c);
        int d=c++; // post-incremento (primero se asigna el valor de c en la variable d y luego se incrementa b en 1)
        System.out.println("d = " + d);
        System.out.println("c = " + c);

        System.out.println("---------------------------");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para saber si es par o no:"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }

    }
}
