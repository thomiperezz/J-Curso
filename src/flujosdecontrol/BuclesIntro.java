package flujosdecontrol;

public class BuclesIntro {
    public static void main(String[] args) {

        for (int i=0;i<10;i++) { // bucle for (inicializacion variable, condición, incremento) { }
            System.out.println(i);
        };
        System.out.println("----------------------------------");
        int i = 0;

        while (i<10) { // bucle while (condicion) { }
            System.out.println(i);
            i+=1;
        }
        System.out.println("----------------------------------");
        do { // bucle do {bloque que se ejecuta 1 vez} while (condicion) { }
            System.out.println(i);
            i+=1;
        } while (i<=11);
        System.out.println("----------------------------------");
        System.out.println(i);
    }
}
