public class NumPrimo {
    public static void main(String[] args) throws Exception {
        System.out.println(isNumPrimo(2)); // true
        System.out.println(isNumPrimo(1)); // false
        System.out.println(isNumPrimo(4)); // false
        System.out.println(isNumPrimo(17)); // true
        System.out.println(isNumPrimo(13)); // true
        System.out.println(isNumPrimo(69)); // false
        System.out.println(isNumPrimo(97)); // true
        System.out.println(isNumPrimo(100)); // false
        System.out.println(isNumPrimo(86)); // false

        //-----------------------------
        System.out.println("\nPrimoV2\n");
        
        numPrimos1_100();
    }

    public static String isNumPrimo(int num) {
        boolean isPrimo = true;
        if(num == 1){
            isPrimo = false;
        }
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrimo = false;
                break;
            }
        }
        return "El " + num + " es primo? " + isPrimo;
    }

    public static boolean isNumPrimoV2(int num) {
        boolean isPrimo = true;
        if(num == 1){
            isPrimo = false;
        }
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrimo = false;
                break;
            }
        }
        return isPrimo;
    }

    // Escribe un programa que se encargue de comprobar si un número es o no primo.
    // Hecho esto, imprime los números primos entre 1 y 100.

    public static void numPrimos1_100(){
        System.out.println("Numeros primos del 1 al 100:");
        for(int i = 1; i <= 100; i++){
            boolean isPrimo = isNumPrimoV2(i);
            if(isPrimo){
                System.out.println(i);
            }
        }
    }
}
