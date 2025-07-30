import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del curso de Java hecho por Thomi [16/07/2025)]");

        String saludar = "Hola"; // en este caso se crea una instancia de la clase String y se le asina una referencia, pero no es un tipo primitivo

        System.out.println("saludar = " + saludar);

        int primitivo1=12; // ejemplo de tipo de dato primitivo

        Integer primitivo2=21; // ejemplo de clase que envuelve a un primitivo, de tipo referencia (contiene métodos para trabajar con este dato)

        char primitivo3='A'; //ejemplo 2 de tipo primitivo2

        boolean primitivo4=true; // ejemplo 3 de primitivo

        ArrayList<Integer> referencia1 = new ArrayList(); // ejemplo de variable que hace referencia a un arreglo
        referencia1.add(primitivo1);
        referencia1.add(2);
        referencia1.add(3);
        referencia1.add(4);
        referencia1.add(5);

        for(int i=0; i<referencia1.size(); i++){
            System.out.println(referencia1.get(i));
        }

        var ejemploEspecial = "15"; // ejemplo de caso especial de asignación de forma dinámica, var puede tomar un objeto, un int, un string, etc.


    }
}