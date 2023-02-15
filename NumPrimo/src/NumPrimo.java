public class NumPrimo {
    public static void main(String[] args) throws Exception {
        System.out.println(isNumPrimo(2)); // true
        System.out.println(isNumPrimo(4)); // false
        System.out.println(isNumPrimo(17)); // true
        System.out.println(isNumPrimo(13)); // true
        System.out.println(isNumPrimo(69)); // false
        System.out.println(isNumPrimo(97)); // true
        System.out.println(isNumPrimo(100)); // false
        System.out.println(isNumPrimo(86)); // false
    }

    public static String isNumPrimo(int num) {
        boolean isPrimo = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrimo = false;
                break;
            }
        }
        return "El " + num + " es primo? " + isPrimo;
    }
}
