package strings;

public class Concatenaciones {
    public static void main(String[] args) {
        String curso = "Java";
        String alumno = "Thomas";
        String detalle = alumno +" "+curso;
        System.out.println(detalle);

        System.out.println("-----------------------------------");

        int numeroA = 10;
        int numeroB = 20;

        System.out.println("detalle+numeroA+numeroB = " + detalle+numeroA+numeroB); // por precedencia toma un String y concatena los dos números
        System.out.println("detalle + (numeroA + numeroB))"+ detalle + (numeroA + numeroB)); // suma y luego concatena con el String
        System.out.println("numeroA+numeroB+detalle = " + numeroA+numeroB+detalle);

        String detalle2 = curso.concat(" ").concat(alumno).concat(detalle); // concat devuelve otra instancia con los dos Strings concatenados
        System.out.println("detalle2 = " + detalle2);

        System.out.println("-----------------------------------");

        String resultado = curso.transform(c -> {
            return c + " con " + alumno;
        });
        System.out.println(resultado);
        System.out.println("resultado==curso = " + resultado==curso); // ejemplo de inmutabilidad (se devuelve otra instancia de String)

        String resultado2=resultado.replace("a","z");
        System.out.println("resultado2 = " + resultado2);

    }
}
