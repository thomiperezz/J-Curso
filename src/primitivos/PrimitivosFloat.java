package primitivos;

public class PrimitivosFloat {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        float real = 1;
        float real2= 1.0F; //hay que especificar con "F" que es un float, sino toma por default un double
        float real3= 2.12e3f; // es lo mismo que 2120f, se corre la coma a la derecha 3 lugares
        float real4= 2120f;
        float real5= 5e-2f; // es lo mismo que 0.05, se corre la coma a la izquierda 2 lugares
        System.out.println("real = " + real);
        System.out.println("real2 = " + real2);
        System.out.println("real3 = " + real3);
        System.out.println("real4 = " + real4);
        System.out.println("real5 = " + real5);

        /* conversiones de tipo float */
        System.out.println("--------------------------------------");
        float primitivo = 123123;
        System.out.println("primitivo = " + primitivo);
        System.out.println("tipo de dato float corresponde en bytes a = " + Float.BYTES);
        System.out.println("tipo de dato float corresponde en bits a = " + Float.SIZE);
        System.out.println("valor mínimo del tipo de dato float = " + Float.MIN_VALUE);
        System.out.println("valor máximo del tipo de dato float = " + Float.MAX_VALUE);

        /* conversiones de tipo double */
        System.out.println("--------------------------------------");
        double primitivo2=3.4028235E39; // se puede omitir la "D" al final de la variable indicando que es double, porque ya es por defecto
        System.out.println("primitivo2 = " + primitivo2);
        System.out.println("tipo de dato double corresponde en bytes a = " + Double.BYTES);
        System.out.println("tipo de dato double corresponde en bits a = " + Double.SIZE);
        System.out.println("valor mínimo del tipo de dato double = " + Double.MIN_VALUE);
        System.out.println("valor máximo del tipo de dato double = " + Double.MAX_VALUE);


    }
}
