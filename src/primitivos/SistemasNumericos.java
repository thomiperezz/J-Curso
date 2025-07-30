package primitivos;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal corresponde en binario a = "+Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // a pesar de ser el valor en binario, se toma el decimal porque es un int
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numeroDecimal corresponde en octal a = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal= 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numeroDecimal corresponde en hexadecimal a = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }
}
