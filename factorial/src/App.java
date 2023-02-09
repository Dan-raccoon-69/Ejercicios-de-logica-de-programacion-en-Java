public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Factorial de un numero
         */

        System.out.println(factorial(5)); // 120
        System.out.println(factorial(7)); // 5040
        System.out.println(factorial(9)); // 362880
        System.out.println(factorial(4)); // 24
    }

    public static String factorial(int numero) {
        int factorial = 1, i;
        for (i = 1; i <= numero; i++)
            factorial *= i;
        return "Factorial de " + numero + " es: " + factorial;
    }
}
