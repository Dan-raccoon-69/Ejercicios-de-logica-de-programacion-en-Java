public class Funcionalidades {
    public static void main(String[] args) throws Exception {
        System.out.println(transformar("hola mundo", "camel case"));
        System.out.println(transformar("hola mundo", "snake case"));
        System.out.println(transformar("hola mundo", "kebab case"));
        System.out.println(transformar("hola mundo", "pascal case"));
        System.out.println(transformar("holamundo", "camel case"));
    }

    public static String transformar(String cadena, String aTransformar) {
        String resultadoTransformar = "";
        int palabras = cadena.split(" ").length;

        if (aTransformar.equals("camel case")) {
            resultadoTransformar = camel(cadena);
            if (palabras > 1) {
                resultadoTransformar = "El texto recibido no tiene formato Case conocido, se ha transformado a "
                        + aTransformar + " : " + resultadoTransformar;
                System.out.println();
                return resultadoTransformar;
            }

        } else if (aTransformar.equals("snake case")) {
            resultadoTransformar = snake(cadena);
            if (palabras > 1) {
                resultadoTransformar = "El texto recibido no tiene formato Case conocido, se ha transformado a "
                        + aTransformar + " : " + resultadoTransformar;
                System.out.println();
                return resultadoTransformar;
            }

        } else if (aTransformar.equals("pascal case")) {
            resultadoTransformar = pascal(cadena);
            if (palabras > 1) {
                resultadoTransformar = "El texto recibido no tiene formato Case conocido, se ha transformado a "
                        + aTransformar + " : " + resultadoTransformar;
                System.out.println();
                return resultadoTransformar;
            }

        } else if (aTransformar.equals("kebab case")) {
            resultadoTransformar = kebab(cadena);
            if (palabras > 1) {
                resultadoTransformar = "El texto recibido no tiene formato Case conocido, se ha transformado a "
                        + aTransformar + " : " + resultadoTransformar;
                System.out.println();
                return resultadoTransformar;
            }
        }
        return resultadoTransformar;
    }

    public static String snake(String cadena) {
        String[] palabras = cadena.split(" ");
        String resultado = "";
        int contadorGuiones = 0;
        for (String string : palabras) {
            resultado += string;
            if ((palabras.length > 1) && (contadorGuiones < (palabras.length) - 1)) {
                resultado += "_";
                contadorGuiones++;
            }
        }
        return resultado;
    }

    public static String camel(String cadena) {
        String[] palabras = cadena.split(" ");
        String resultado = "";
        int contador = 0;
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
        return resultado;
    }

    public static String pascal(String cadena) {
        String[] palabras = cadena.split(" ");
        String resultado = "";
        for (String string : palabras) {
            char c = (char) (string.charAt(0) - 32);
            resultado += c;
            for (int i = 1; i < string.length(); i++) {
                resultado += string.charAt(i);
            }
        }
        return resultado;
    }

    public static String kebab(String cadena) {
        String[] palabras = cadena.split(" ");
        int contadorGuiones = 0;
        String resultado = "";
        for (String string : palabras) {
            resultado += string;
            if ((palabras.length > 1) && (contadorGuiones < (palabras.length) - 1)) {
                resultado += "-";
                contadorGuiones++;
            }
        }
        return resultado;
    }
}
