package operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        boolean variable = (7==7) ? true : false; // condicion ? si_es_verdadero: si_es_falso
        System.out.println("variable = " + variable);


        String estado="";
        double promedio=5.4;

        estado = promedio>5.5? "Aprobado":"Reprobado";
        System.out.println("promedio = " + estado);
    }
}
