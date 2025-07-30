package primitivos;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        char caracterPrimitivo = 'a'; //un char es un solo caracter
        char caracterPrimitivo2 = '0'; // también puede tomar el "0" porque utiliza el UNICODE
        char caracterArrobaUnicode = '\u0040';
        char decimal=64; // convierte el número en el caracter unicode equivalente
        char simbolo='@';

        System.out.println("caracterPrimitivo = " + caracterPrimitivo);
        System.out.println("caracterPrimitivo2 = " + caracterPrimitivo2);
        System.out.println("caracterArrobaUnicode = " + caracterArrobaUnicode);
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal==caracterArrobaUnicode) = " + (decimal==caracterArrobaUnicode));
        System.out.println("simbolo = " + simbolo);

        /*conversión del tipo de dato char*/
        System.out.println("--------------------------------------");
        char caracterPrimitivo1 = 'A';
        System.out.println("caracterPrimitivo1 = " + caracterPrimitivo1);
        System.out.println("tipo de dato char equivalente en bytes a = " + Character.BYTES);
        System.out.println("tipo de dato char equivalente en bits a = " + Character.SIZE);
        System.out.println("valor mínimo del tipo de dato char = " + Character.MIN_VALUE);
        System.out.println("valor máximo del tipo de dato char = " + Character.MAX_VALUE);
        
        /* tipos de caracteres especiales*/
        System.out.println("--------------------------------------");
        char espacio = ' ';
        System.out.println("caracterPrimitivo = " + caracterPrimitivo+espacio+caracterPrimitivo1);

        char retroceso = '\b';
        System.out.println("caracterPrimitivo1 = " + caracterPrimitivo1+espacio+espacio+espacio+retroceso+caracterPrimitivo1);

        char tabulacion='\t';
        System.out.println("caracterPrimitivo1 = " + caracterPrimitivo+tabulacion+caracterPrimitivo1);

        char saltoLinea= '\n';
        System.out.println("caracterPrimitivo = " + caracterPrimitivo+saltoLinea+caracterPrimitivo1);

    }
}
