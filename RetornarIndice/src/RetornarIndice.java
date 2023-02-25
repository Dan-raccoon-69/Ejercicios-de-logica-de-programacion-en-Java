import java.util.Scanner;

public class RetornarIndice {
    public static void main(String[] args) throws Exception {
        try (Scanner datos = new Scanner(System.in)) {
            int i;
            int arreglo[] = new int[10];

            // pidiendo datos
            for (i = 0; i < arreglo.length; i++) {
                System.out.print("Escribe el numero " + (i + 1) + ": ");
                arreglo[i] = datos.nextInt();
            }

            // validando que los datos esten ordenados crecientemente
            if (ordenadosCrecientemente(arreglo)) {
                System.out.println("Arreglo: ");
                mostrarArreglo(arreglo);
                int indice = mostrarPosicion(arreglo, 14);
                if(indice != -1){
                    System.out.println("\nEl numero a buscar se encuenta en el indice: " + indice);
                }
                else
                System.out.println("\nNumero no encontrado en el arreglo.");
            } else
                System.out.println("\nDatos no ingresados crecientemente.");
        }
    }

    public static int mostrarPosicion(int[] array, int numeroAbuscar) {
        int indice = -1;
        for (int j = 0; j < array.length; j++) {
            if (numeroAbuscar == array[j]) {
                indice = j;
                break;
            }
        }
        return indice;
    }

    public static boolean ordenadosCrecientemente(int[] array) {
        boolean ordenados = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                ordenados = false;
                break;
            }
        }
        return ordenados;
    }

    public static void mostrarArreglo(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
