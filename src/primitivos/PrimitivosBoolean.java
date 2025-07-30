package primitivos;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogico = " + Boolean.TRUE);
        System.out.println("Boolean.FALSE = " + Boolean.FALSE);

        double expresion1=9876.43e-1;
        float expresion2=1.2e2f;

        datoLogico=expresion1>expresion2;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2==0);
        System.out.println("esIgual = " + esIgual);
    }
}
