package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a>=10 && b>=10) { // devuelve verdadero si se cumplen las dos condiciones (operador AND)
            System.out.println("Ambos números son mayor o igual a 10");
        }

        if (a>=10 & b>=10) { // devuelve verdadero si se cumplen las dos condiciones (operador AND), evalua las dos condiciones siempre por más que la primera sea falsa
            System.out.println("Ambos números son mayor o igual a 10");
        }

        if (a>10 || b==10) { // devuelve verdadero si se cumple una de las dos condiciones (operador OR)
            System.out.println("a es mayor a 10 o b es igual a 10");
        }

        if (a==30 | b==20 ){ // devuelve verdadero si se cumple una de las dos condiciones (operador OR), evalua las dos condiciones siempre
            System.out.println("a es igual a 10 o b es igual a 30");
        }

        if (!(a<10)){ // devuelve verdadero si no se cumple la condición (operador NOT)
            System.out.println("a no es menor a 10");
        }

        if ((a==10) ^ (b==30)) { // devuelve verdadero si las dos condiciones son diferentes
            System.out.println("una de las dos condiciones no se cumple");
        }




    }
}
