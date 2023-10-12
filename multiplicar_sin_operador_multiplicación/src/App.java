public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(multiplicar(2, 10));
        System.out.println(multiplicar(5, -4));
        System.out.println(multiplicar(-10, 84));
        System.out.println(multiplicar(-20, -30));
    }

    public static int multiplicar(int a, int b) {
        int valor = 0;
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            a = Math.abs(a);
            b = Math.abs(b);
        } else {
            if (b < 0) {
                a = 0 - a;
                b = Math.abs(b);
            }
        }
        for (int i = 0; i < b; i++) {
            valor += a;
        }
        return valor;
    }
}