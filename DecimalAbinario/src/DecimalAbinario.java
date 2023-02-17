public class DecimalAbinario {
    public static void main(String[] args) throws Exception {
        System.out.println(convertirDecimalABinario(8)); // 1000
        System.out.println(convertirDecimalABinario(4)); // 100
        System.out.println(convertirDecimalABinario(100)); // 1100100
        System.out.println(convertirDecimalABinario(1000)); // 1111101000
        System.out.println(convertirDecimalABinario(24)); // 11000
        System.out.println(convertirDecimalABinario(25)); // 11001
    }

    public static String convertirDecimalABinario(int decimal) {
        System.out.print("Binario de " + decimal + " = ");
        int residuo;
        String resultado = "";
        while (decimal >= 2) {
            residuo = decimal % 2;
            resultado += residuo;
            decimal = decimal / 2;
        }
        String nuevo = (resultado += decimal);
        resultado = "";
        for (int i = nuevo.length() - 1; i >= 0; i--) {
            resultado += nuevo.charAt(i);
        }
        return resultado;
    }
}
