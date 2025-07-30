package strings;

public class EjemploString {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        String s1= "Hello World"; // instancia de un objeto String
        String s2 = "Ejemplo de String con \"comillas\""; // se debe utilizar el \ para incluir las comillas en el string
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s1+s2 = " + s1+" "+s2); // se pueden concatenar los string

        System.out.println("s2==s1 = " + (s2==s1)); // check de si son el mismo objeto
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // check de si tienen el mismo valor los objetos

        System.out.println("-----------------------------------");
        String valor1="Hola";
        String valor2="Hola";
        System.out.println("valor1.equals(valor2) = " + valor1.equals(valor2));
        System.out.println("(valor1==valor2) = " + (valor1==valor2));
    }
}
