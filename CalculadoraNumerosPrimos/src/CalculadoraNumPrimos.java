public class CalculadoraNumPrimos {
    public static void main(String[] args) throws Exception {
        obtenerNumPrimos(7); // 2 3 5 7
        obtenerNumPrimos(20); // 2 3 5 7 11 13 17 19
        obtenerNumPrimos(10); // 2 3 5 7
        obtenerNumPrimos(0); // Mensaje de error
        obtenerNumPrimos(-5); // 2 3 5
    }

    // funcion que se encarga de retornar un true - false si un numeró es primo
    public static boolean isNumPrimo(int num) {
        boolean isPrimo = true;
        if (num == 1) {
            isPrimo = false;
        } else {
            for (int j = 2; j < num; j++) {
                /*
                 * Omitimos dividir entre 1 y el mismo numero, si el residuo es cero
                 * con algun otro numero (j) significa que no es un numeró primo.
                 */
                if (num % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        return isPrimo;
    }

    // funcion que se encarga de almacenar los numeros que sean primos en un arreglo
    public static void obtenerNumPrimos(int n) {
        System.out.println();
        // En caso de que num sea 0, le diremos al usuario que no puede ser 0
        if (n != 0) {
            // si n < 0, le diremos al usuario y n lo transformaremos a positivo
            if (n < 0) {
                System.out.println("El numero " + n + " es negativo, se convertira en positivo.");
                n *= -1;
            }
            int arreglo[] = new int[n];
            int iteradorArreglo = 0;
            // un ciclo que itera desde el 1 hasta n, si (i) es primo, se guarda en el
            // arreglo
            for (int i = 1; i <= n; i++) {
                boolean isPrimo = isNumPrimo(i);
                if (isPrimo) {
                    arreglo[iteradorArreglo] = i;
                    iteradorArreglo++;
                }
            }
            // llamamos a la funcion mostrarArreglo para mostrar los elementos
            mostrarArreglo(arreglo);
        } else
            System.out.println("El numero no puede ser 0");
    }

    // funcion que se encarga de mostra el arreglo cuyos numeros sean primos
    public static void mostrarArreglo(int[] arreglo) {
        int iteradorCiclo = 0;
        while (arreglo[iteradorCiclo] != 0) {
            System.out.print(arreglo[iteradorCiclo] + " ");
            iteradorCiclo++;
        }
        System.out.println();
    }
}
