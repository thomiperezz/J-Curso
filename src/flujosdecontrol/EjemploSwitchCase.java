package flujosdecontrol;

public class EjemploSwitchCase {
    public static void main(String[] args) {
        int num = 3;

        switch (num) { // switch case soporta los primitivos int, byte, short, char, String, Enum y los Wrapper de las mismas
            case 0:
                System.out.println("El número es 0..");
                break;
            case 1:
                System.out.println("El número es 1..");
                break;
            case 3:
                System.out.println("El número es 3..");
                break;
        }

        String saludo="Hola";

        switch(saludo) {
            case "Hola":
                System.out.println("Te están dando la bienvenida..");
                break;
            case "Chau":
                System.out.println("Te están despidiendo..");
                break;
        }
    }
}
