package strings;

public class CreacionStrings {
    public static void main(String[] args) {
        String curso = "Programación en Java"; // creación automatizada de la creación del objeto String (es decir new String)

        String curso2 = new String("Programación en Java"); // segunda forma de crear un objeto String

        System.out.println("curso = " + curso);
        System.out.println("curso2 = " + curso2);

        boolean esIgual = (curso==curso2);
        System.out.println("esIgual = " + esIgual);

        boolean esIgualEquals = curso.equals(curso2);
        System.out.println("esIgualEquals = " + esIgualEquals);

        curso2 = "programación en java";

        boolean esIgualIgnorandoMayus = (curso.equalsIgnoreCase(curso2));
        System.out.println("esIgualIgnorandoMayus = " + esIgualIgnorandoMayus);

    }
}
