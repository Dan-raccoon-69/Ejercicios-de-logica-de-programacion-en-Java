import java.util.Scanner;

public class ArregloDato {
    public static void main(String[] args) throws Exception {
        IngresarDatoArrayOrdenado(6);
    }

    public static void IngresarDatoArrayOrdenado(int numAingresar) {
        try (Scanner datos = new Scanner(System.in)) {
            int arreglo[] = new int[10];
            int i, posicionAniadir = 0;
            boolean moverDatos = false;

            // ingresando datos
            for (i = 0; i < 5; i++) {
                System.out.print("Escribe el numero: " + (i + 1) + ": ");
                arreglo[i] = datos.nextInt();
            }

            // validar que sean valores crecientes
            for (i = 0; i < 4; i++) {
                if (arreglo[i + 1] < arreglo[i]) {
                    System.out.println("\nIngresa valores ordenados crecientemente.");
                    return;
                }
            }

            mostrarArreglo(arreglo);

            // comprobando si se tienen que dezplazar los valores
            for (i = 0; i < 5; i++) {
                if (numAingresar < arreglo[i]) {
                    moverDatos = true;
                    posicionAniadir = i;
                    break;
                }
            }
            // aniadiendo en posicion correspondiente
            if (moverDatos) {
                for (i = 5; i > posicionAniadir; i--) {
                    arreglo[i] = arreglo[i - 1];
                }
                arreglo[posicionAniadir] = numAingresar;
            } else
                arreglo[5] = numAingresar;

            mostrarArreglo(arreglo);
        }

    }

    public static void mostrarArreglo(int[] array) {
        System.out.println();
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
