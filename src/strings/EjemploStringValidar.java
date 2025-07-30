package strings;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String nulo = null;

        boolean esNulo = (nulo==null);

        System.out.println("esNulo = " + esNulo);
        if (!esNulo) {
            System.out.println("nulo.toUpperCase() = " + nulo.toUpperCase());
        } else {
            nulo = "Ya no es nulo";
            System.out.println("nulo.toUpperCase() = " + nulo.toUpperCase());
        }

        if (nulo.length()==0){ // condicional para verificar si un String es vacío
            System.out.println("Es un string vacío");
        } else {
            System.out.println("Es un string con contenido");
        }

        boolean esVacio = nulo.isEmpty();
        System.out.println("esVacio = " + esVacio); // segunda forma de validar si un String es vacío

        boolean esBlanco = nulo.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        String nulo2="";
        esBlanco = nulo2.isBlank();
        System.out.println("esBlanco = " + esBlanco);
    }
}
