package operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        double promedio = i+j+k/3d*10d; // precedencia de la división, primero realiza la división,luego la multiplicación y luego la suma
        double promedio2= (i+j+k)/3d; // precedencia del paréntesis, primero realiza la suma y luego la división
        double promedio3= ++i + j-- + k / 3d * 10d; // (10+1) + (20) = 31 + (30/3) * 10 = 31 + 100 = 131
        System.out.println("promedio = " + promedio);
        System.out.println("promedio2 = " + promedio2);
        System.out.println("promedio3 = " + promedio3);



    }
}
