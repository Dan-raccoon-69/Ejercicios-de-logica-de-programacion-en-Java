public class Rotacion13 {
    public static void main(String[] args) throws Exception {
        System.out.println(rotacion13("hola")); // ubyn
        System.out.println(rotacion13("ubyn")); // hola
        System.out.println(rotacion13("chan")); // puna
        System.out.println(rotacion13("chane")); // punar
        System.out.println(rotacion13("pena")); // cran
    }

    public static String rotacion13(String cadena) {
        System.out.print("\n" + cadena + " = ");
        cadena = cadena.toLowerCase();
        String resultado = "";
        char[] caracteres = cadena.toCharArray();
        for (char caracter : caracteres) {
            if (caracter >= 'a' && caracter <= 'm') {
                caracter += 13;
            } else if (caracter >= 'n' && caracter <= 'z') {
                caracter -= 13;
            }
            resultado += caracter;
        }
        return resultado;
    }
}
