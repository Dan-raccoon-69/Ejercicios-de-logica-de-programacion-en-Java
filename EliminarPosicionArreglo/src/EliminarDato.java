import java.util.Scanner;

public class EliminarDato {
    public static void main(String[] args) throws Exception {
        System.out.print("Posicion empieza desde 0");
        eliminarPosicion(5);
    }

    public static void eliminarPosicion(int posicion) {
        System.out.println();
        try (Scanner datos = new Scanner(System.in)) {
            // validando que posicion se encuentre entre 0 y 9
            if (posicion < 0 || posicion > 9) {
                System.out.println("\nPosicion Incorrecta \nValores entre 0 y 9.");
                return;
            }

            // pidiendo datos
            int i, arreglo[] = new int[10];
            for (i = 0; i < 10; i++) {
                System.out.print("Escribe el numero " + (i + 1) + ": ");
                arreglo[i] = datos.nextInt();
            }

            System.out.println("\nArreglo viejo: ");
            mostrarArreglo(arreglo);

            // desplazando datos
            for (i = posicion + 1; i < 10; i++) {
                arreglo[i - 1] = arreglo[i];
            }
            arreglo[9] = 0;
            System.out.println("\nArreglo nuevo: ");
            mostrarArreglo(arreglo);
        }
    }

    public static void mostrarArreglo(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
