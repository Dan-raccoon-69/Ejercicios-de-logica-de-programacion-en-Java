public class Palindromo {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindromo("Hola mi amor"));
        System.out.println(isPalindromo("¿Acaso hubo buhos aca?"));
        System.out.println(isPalindromo("Ana"));
        System.out.println(isPalindromo("Anna"));
        System.out.println(isPalindromo("Frase random"));
        System.out.println(isPalindromo("Hola"));
    }

    public static String isPalindromo(String cadena) {
        String palabraVolteada = "";
        // palabra o frase
        String[] cadenaArray = cadena.split(" ");
        String palabraORfrase = (cadenaArray.length > 1) ? "Frase" : "Palabra";
        // palindromo
        String cadenaSinEspacios = cadena.replace(" ", "").
        replace("¿", "").
        replace("?", "").
        replace("!", "").
        replace("¡", "").
        replace(".", "").
        replace("'", "").
        replace("¡", "").
        replace("...", "").
        toLowerCase();
        for (int i = cadenaSinEspacios.length() - 1; i >= 0; i--) {
            palabraVolteada += cadenaSinEspacios.charAt(i);
        }
        String resultado = (palabraVolteada.equals(cadenaSinEspacios)) ? "es un palindromo." : "no es un palindromo.";

        return "La " + palabraORfrase + " '" + cadena + "' " + resultado;
    }
}
