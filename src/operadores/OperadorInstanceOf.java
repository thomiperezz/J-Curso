package operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String txt = new String("Creando un objeto de la clase String");

        Integer num = new Integer(8);

        System.out.println("txt = " + txt);
        System.out.println("num = " + num);

        boolean b1 = num instanceof Integer; // verifica si es un objeto de la clase Integer
        boolean b2 = txt instanceof String; // verifica si es un objeto de la clase String
        boolean b3 = txt instanceof Object; // verifica si es un objeto de la clase Object (la clase padre de todos los objetos)
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);


        Double d1 = num.doubleValue();
        System.out.println("d1 = " + d1);
        boolean b4 = d1 instanceof Number;
        System.out.println("b4 = " + b4);
        boolean b5 = d1 instanceof  Double;

    }
}
