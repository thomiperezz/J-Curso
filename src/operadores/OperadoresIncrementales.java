package operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        int j=++i; // i=i+1, se incrementa i a 2 y se asigna 2 a j (pre-incremento)

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("----------------------");
        i=1;
        j=i++; // j=1, i++ (se asigna el valor de i a j y luego i se incrementa a 2)
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("-----------------------");
        i=3;
        j=--i; //pre-decremento
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        System.out.println("-----------------------");
        i=3;
        j=i--; //post-decremento
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
