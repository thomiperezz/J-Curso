package strings;

public class MetodosPractica {
    public static void main(String[] args) {
        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length()); // longitud
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // convertir a mayúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // convertir a minúsculas
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres")); // compara por valor
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres")); // compara por valor
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres")); // compara por valor ignorando minúscula y mayúscula
        System.out.println("nombre.compareTo(\"andres\") = " + nombre.compareTo("Aaron")); // compara por orden alfabético
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // devuelve el caracter en la posición indicada por parámetro
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2)); //toma desde el parámetro en adelante, incluyéndolo
        System.out.println("nombre.substring(2,4) = " + nombre.substring(2,4)); // toma desde el parámetro hasta el segundo parámetro sin incluirlo
        System.out.println("nombre.replace(\"e\",\".\") = " + nombre.replace("e","."));
        System.out.println("nombre.indexOf('a') = " + nombre.indexOf('a')); // devuelve la posición del caracter pasado por parámetro (-1 si no existe)
        System.out.println("nombre.indexOf('A') = " + nombre.indexOf('A'));
        System.out.println("nombre.contains(\"dr\") = " + nombre.contains("dr")); // devuelve true o false si está el caracter o cadena pasada por parámetro
        System.out.println("nombre.startsWith(\"And\") = " + nombre.startsWith("And"));
        System.out.println("nombre.endsWith(\"es\") = " + nombre.endsWith("es"));

        System.out.println("---------------------------");
        nombre = "     Andres";
        System.out.println("nombre = " + nombre);
        System.out.println("nombre = " + nombre.trim());

    }
}
