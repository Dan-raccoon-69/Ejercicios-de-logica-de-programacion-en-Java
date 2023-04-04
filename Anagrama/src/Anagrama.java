public class Anagrama {
    public static void main(String[] args) throws Exception {
        System.out.println(isAnagrama("andalucia", "alucinada"));
        System.out.println();
        System.out.println(isAnagrama("resultado", "negativo"));
    }

    public static boolean isAnagrama(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            return false;
        }

        char[] cadena1 = palabra1.toCharArray();
        char[] cadena2 = palabra1.toCharArray();
        int contadorLetras1 = 0;
        int contadorLetras2 = 0;

        boolean resultado = false;
        for (int j = 0; j < cadena1.length; j++) {
            char letraNueva = cadena1[j];
            for (char c : cadena1) {
                if (letraNueva == c) {
                    contadorLetras1++;
                }
            }

            for (char c : cadena2) {
                if (letraNueva == c) {
                    contadorLetras2++;
                }
            }

            if(contadorLetras1 != contadorLetras2){
                resultado = true;
            }
        }

        System.out.println(contadorLetras1 + " " + contadorLetras2);
        return resultado;
    }
}
