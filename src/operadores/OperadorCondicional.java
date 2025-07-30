package operadores;

public class OperadorCondicional {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c=a<b ? (a=a+b):(a=a-b); // (condicion) ? valor1:valor2
        System.out.println("c = " + c);

    }
}
