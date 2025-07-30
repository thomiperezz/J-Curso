package operadores;

public class OperadorInstanceOfTiposGenericosOAbstractos {
    public static void main(String[] args) {
        Object txt = new String("Creando un objeto de la clase String"); // Object o clase padre puede contener un tipo de valor de referencia String

        Integer num = Integer.valueOf(7); // es lo mismo que hacer num==8 (es lo que hace el compilador para asignar el valor de forma explícita)

        System.out.println("txt = " + txt);
        System.out.println("num = " + num);

        boolean b1 = num instanceof Integer; // verifica si es un objeto de la clase Integer
        boolean b2 = txt instanceof String; // verifica si es un objeto de la clase String
        boolean b3 = txt instanceof Object; // verifica si es un objeto de la clase Object (la clase padre de todos los objetos)
        System.out.println("num es del tipo Integer = " + b1);
        System.out.println("txt es del tipo String = " + b2);
        System.out.println("txt es del tipo Object = " + b3);

        b1 = txt instanceof Integer;
        System.out.println("txt es del tipo Integer = " + b1);

        System.out.println("---------------------------------");
        Object d1 = num.doubleValue();
        System.out.println("double d1 = " + d1);
        boolean b4 = d1 instanceof Number;
        System.out.println("d1 es del tipo Number = " + b4);
        boolean b5 = d1 instanceof  Double;
        System.out.println("d1 es del tipo Double = " + b5);
        boolean b6= d1 instanceof Integer;
        System.out.println("d1 es del tipo Integer = " + b6);
        boolean b7 = d1 instanceof String;
        boolean b8 = d1 instanceof Object;
        boolean b9 = d1 instanceof Long;
        boolean b10 = d1 instanceof Float;
        System.out.println("d1 es del tipo String = " + b7);
        System.out.println("d1 es del tipo Object = " + b8);
        System.out.println("d1 es del tipo Long = " + b9);
        System.out.println("d1 es del tipo Float = " + b10);
    }
}
