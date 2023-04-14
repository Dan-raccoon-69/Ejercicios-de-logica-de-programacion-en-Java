public class CaseTransformer {
    public static void main(String[] args) throws Exception {
        System.out.println(trasnformar("hola mundo", "snake"));
        System.out.println(trasnformar("daniel gustavo bautista", "snake"));

        System.out.println(trasnformar("hola mundo", "kebab"));
        System.out.println(trasnformar("daniel gustavo bautista", "kebab"));

        System.out.println(trasnformar("hola mundo", "pascal"));
        System.out.println(trasnformar("daniel gustavo bautista", "pascal"));

        System.out.println(trasnformar("hola mundo", "camel"));
        System.out.println(trasnformar("daniel gustavo bautista", "camel"));

    }

    public static String trasnformar(String cadena, String aTransformar) {
        String[] palabras = cadena.split(" ");
        String resultado = "";
        int contadorGuiones = 0;
        // Evitando problemas entre MAY-MIN en el tipo de case a transformar
        aTransformar = aTransformar.toLowerCase();
        
        // conversiones
        if (aTransformar.equals("snake")) {
            // Snake case: hola_mundo
            System.out.println("\nSnake case:");
            for (String string : palabras) {
                resultado += string;
                if ((palabras.length > 1) && (contadorGuiones < (palabras.length) - 1)) {
                    resultado += "_";
                    contadorGuiones++;
                }
            }
        }

        if (aTransformar.equals("camel")) {
            // Camel case: holaMundo
            int contador = 0;
            System.out.println("\nCamel case:");
            for (int k = 1; k < palabras.length; k++) {
                if (contador == 0) {
                    resultado += palabras[0];
                    contador++;
                }
                char c = (char) (palabras[k].charAt(0) - 32);
                resultado += c;
                for (int i = 1; i < palabras[k].length(); i++) {
                    resultado += palabras[k].charAt(i);
                }
            }
        }

        if (aTransformar.equals("pascal")) {
            // Pascal case: HolaMundo
            System.out.println("\nPascal case:");
            for (String string : palabras) {
                char c = (char) (string.charAt(0) - 32);
                resultado += c;
                for (int i = 1; i < string.length(); i++) {
                    resultado += string.charAt(i);
                }
            }
        }

        if (aTransformar.equals("kebab")) {
            System.out.println("\nKebab case:");
            for (String string : palabras) {
                resultado += string;
                if ((palabras.length > 1) && (contadorGuiones < (palabras.length) - 1)) {
                    resultado += "-";
                    contadorGuiones++;
                }
            }
        }

        return resultado;

    }
}
