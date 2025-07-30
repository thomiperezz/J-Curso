package strings;

public class EjemploTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // c=c.concat(a).concat(b).concat("\n"); // 500 = 2ms //1000 = 2ms // 10000 = 83ms // 100000 = 4416ms
            // c += a + b + "\n"; // 500 = 5ms //1000 = 5 ms // 10000 = 47ms // 100000 = 1653ms
             sb.append(a).append(b).append("\n"); // 500 = 1ms //1000 = 0ms // 10000 = 2ms // 100000 = 9ms
        }

        long fin= System.currentTimeMillis();

        System.out.println("Tiempo total = " + (fin-inicio));
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());

    }
}
