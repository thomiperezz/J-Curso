package primitivos;

public class ConversionDeTipos {
    public static void main(String[] args) {
        /*conversiones de tipo String a primitivos */
        System.out.println("-------------------------------------");
        String numeroStr = "50";
        int numeroParseado = Integer.parseInt(numeroStr);
        System.out.println("numeroParseado = " + numeroParseado);

        String realStr = "5000000.213";
        double realParseado = Double.parseDouble(realStr);
        System.out.println("realParseado = " + realParseado);

        String logicoStr = "true";
        boolean logicoParseado = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoParseado = " + logicoParseado);


        /*conversiones de tipo primitivo a String */
        System.out.println("-------------------------------------");
        int numeroInt = 123;
        String numeroIntStr = String.valueOf(numeroInt);
        String segundaForma = Integer.toString(numeroInt);
        System.out.println("numeroIntStr = " + numeroIntStr);
        System.out.println("segundaForma = " + segundaForma);

        /* conversionmes entre tipos de primitivos */
        System.out.println("-------------------------------------");
        int i = 10000;
        short s = (short)i; // en este caso de un tipo de dato de mayor capacidad a uno de menor si hay problemas (se debe forzar la conversión casteandolo)
        long l = i; // en los casos de tipos de datos de menor capacidad (16 bits) a los de mayor cantidad (32 bits) no hay problema.
        System.out.println("s = " + s);
        System.out.println("l = " + l);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = (float)i;
        System.out.println("f = " + f);

    }
}
