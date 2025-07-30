package primitivos;

public class Primitivos {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        byte numeroByte = 127; // el byte acepta entre -127 y 127 positivo (Valor máximo de un byte)
        byte numeroByte2 = -127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByte2 = " + numeroByte2);

        /* conversiones en byte, bits */
        System.out.println("tipo byte corresponde en bytes a = " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a = " + Byte.SIZE);
        System.out.println("Valor mínimo de un byte = " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de un byte = " + Byte.MAX_VALUE);

        /*conversiones en short */
        System.out.println("---------------------------------------");
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a = " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a = " + Short.SIZE);
        System.out.println("valor máximo de un tipo de dato short = " + Short.MIN_VALUE);
        System.out.println("valor mínimo de un tipo de dato short = " + Short.MAX_VALUE);

        /* conversiones en int */
        System.out.println("---------------------------------------");
        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a = " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a = " + Integer.SIZE);
        System.out.println("valor mínimo de un tipo de dato int = " + Integer.MIN_VALUE);
        System.out.println("valor máximo de un tipo de dato int = " + Integer.MAX_VALUE);

        /* conversiones en long */
        System.out.println("--------------------------------------");
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a = " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a = " + Long.SIZE);
        System.out.println("valor mínimo de un tipo de dato long = " + Long.MIN_VALUE);
        System.out.println("valor máximo de un tipo de dato long = " + Long.MAX_VALUE);

        /* caso especial de var */
        System.out.println("--------------------------------------");
        var caso1=32768; //en este caso por atrás el tipo var toma un tipo de dato int (igual en todos los casos)
        var caso2=9223372036854775807L; // en este caso toma el tipo de dato long (igual en todos los casos)
        var caso3=9223372036854775808F; // en este caso toma el tipo de dato float (igual en todos los casos)
        System.out.println("caso1 = " + caso1);
        System.out.println("caso2 = " + caso2);

    }
}
