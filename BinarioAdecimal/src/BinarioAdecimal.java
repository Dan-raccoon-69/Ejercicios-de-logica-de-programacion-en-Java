public class BinarioAdecimal {
    public static void main(String[] args) throws Exception {
        System.out.println(BinarioADecimal("100010"));
    }

    public static int BinarioADecimal(String binario) {
        System.out.print("\nDecimal de " + binario + " = ");
        int multiplo = 1;
        int resultado = 0;

        for (int i = (binario.length() - 1); i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                resultado += multiplo;
            }
            multiplo *= 2;
        }
        return resultado;
    }
}
