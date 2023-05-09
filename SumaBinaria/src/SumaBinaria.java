public class SumaBinaria {
    public static void main(String[] args) throws Exception {
        sumaBinaria("10010", "11111"); // 110001
        sumaBinaria("1000", "1000"); // 10000
        sumaBinaria("1101", "10000"); // 11101
    }

    public static void sumaBinaria(String binario1, String binario2){
        int num1 = binarioADecimal(binario1);
        int num2 = binarioADecimal(binario2);
        int resultado = num1 + num2;
        System.out.println(binario1 + " + " + binario2 + " = " + decimalABinario(resultado));
        System.out.println();
    }

    public static int binarioADecimal(String binario) {
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

    public static String decimalABinario(int decimal) {
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
