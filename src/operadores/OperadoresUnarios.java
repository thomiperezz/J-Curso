package operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i=-5;

        int j=+i; // es como multiplicar i por (1)
        
        int k = -i; // es como multiplicar i por (-1)

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("----------------------------------");
        i=6;
        j=+i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
