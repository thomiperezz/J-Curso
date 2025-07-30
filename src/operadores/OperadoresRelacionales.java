package operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("(a<b) = " + (a<b)); // devuelve verdadero si a es menor a b
        System.out.println("a<=b = " + (a<=b)); // devuelve verdadero si a es menor o igual a b
        System.out.println("(a>=b) = " + (a>=b)); // devuelve verdadero si a es mayor o igual a b
        System.out.println("(a>b) = " + (a>b)); // devuevle verdadero si a es mayor a b
        System.out.println("(a==b) = " + (a==b)); // devuelve verdadero si a es igual a b
        System.out.println("(a!=b) = " + (a!=b)); // devuelve verdadero si a no es igual a b

    }
}
