package strings;

import java.util.Arrays;

public class MetodosString {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        String ejemplo1 = "Cadena de ejemplo 1";
        String ejemplo2="Cadena de ejemplo 2";
        String ejemplo3="cadena de ejemplo 1";

        System.out.println("ejemplo1 = " + ejemplo1);
        System.out.println("ejemplo2 = " + ejemplo2);
        System.out.println("ejemplo3 = " + ejemplo3);

        System.out.println("-----------------------------------");

        boolean equals = ejemplo1.equals(ejemplo2); // comparación por valor
        System.out.println("equals = " + equals);

        boolean equals2 = ejemplo1==ejemplo2; // comparación por referencia
        System.out.println("equals2 = " + equals2);


        System.out.println("-----------------------------------");
        boolean equalsIgnoreCase = ejemplo1.equalsIgnoreCase(ejemplo3);
        System.out.println("equalsIgnoreCase = " + equalsIgnoreCase);

        System.out.println("-----------------------------------");
        String letra = "a";
        String letra1 = "a";
        String letra2 = "b";
        System.out.println("letra.compareTo(letra2) = " + letra.compareTo(letra2)); // -1 si es anterior alfabéticamente
        System.out.println("letra.compareTo(letra1) = " + letra.compareTo(letra1)); // 0 si es igual alfabéticamente
        System.out.println("letra2.compareTo(letra) = " + letra2.compareTo(letra)); // 1 si es posterior alfabéticamente

        System.out.println("-----------------------------------");
        String stringConEspacios = "   Acá empieza la cadena";
        System.out.println("stringConEspacios =" + stringConEspacios);
        System.out.println("stringConEspacios =" + stringConEspacios.trim()); // le saca los espacios en el principio de la cadena

        char posicion = stringConEspacios.trim().charAt(4); // devuelve el caracter en la posición pasada por parámetro
        System.out.println("posicion = " + posicion);
        char[] cadenaConvertidaArray = stringConEspacios.trim().toCharArray();
        System.out.println("cadenaConvertidaArray = " + Arrays.toString(cadenaConvertidaArray)); // array a formato String

        for (int i = 0; i < cadenaConvertidaArray.length; i++) { // forma de recorrer el array
            System.out.print(cadenaConvertidaArray[i]);
        }
        System.out.println("");
        System.out.println("-----------------------------------");
        String subString = stringConEspacios.trim().substring(1,4); // toma desde cierta longitud inicio de la cadena hasta otra longitud fin
        System.out.println("subString = " + subString);

        String subString2 = stringConEspacios.trim().substring(2); // toma desde cierta longitud inicio de la cadena y lo restante
        System.out.println("subString2 = " + subString2);


        System.out.println("subString.indexOf(\"z\") = " + subString2.indexOf("z")); // muestra la posición del caracter pasado por parámetro

        System.out.println("subString.lastIndexOf(\"z\") = " +subString2.lastIndexOf("z")); // muestra desde la derecha hacia la izquierda la posición del primer caracter que encuentra

        boolean empiezaCon = subString2.startsWith("á"); // si la cadena empieza con el prefijo indicado, devuelve true o false en caso contrario
        System.out.println("empiezaCon = " + empiezaCon);

        boolean terminaCon = subString2.endsWith("na"); // si la cadena termina con el sufijo indicado, devuelve true o false en caso contrario
        System.out.println("terminaCon = " + terminaCon);

        boolean terminaCon2 = subString2.endsWith("n"); // caso false
        System.out.println("terminaCon2 = " + terminaCon2);

        String[] split = subString2.split("n");
        System.out.println("split = " + Arrays.toString(split));

        String[] split2 = subString2.split(" ");
        System.out.println("split2 = " + Arrays.toString(split2));


    }
}
