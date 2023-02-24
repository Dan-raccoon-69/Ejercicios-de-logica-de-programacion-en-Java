import java.util.Scanner;

public class GuardarArreglo {
    public static void main(String[] args) throws Exception {
        guardarPares_Impares();
    }

    public static void guardarPares_Impares() {
        try (Scanner datos = new Scanner(System.in)) {
            int i, j = 0, k = 0;
            int arregloOriginal[] = new int[10];
            int arregloPares[] = new int[10];
            int arregloImpares[] = new int[10];

            // ingresando 10 datos
            for (i = 0; i < arregloOriginal.length; i++) {
                System.out.print("Escribe el numero " + (i + 1) + ": ");
                arregloOriginal[i] = datos.nextInt();
            }

            // ingresando datos a diversos arreglos correspondientes
            for (int dato : arregloOriginal) {
                if (dato % 2 == 0) {
                    arregloPares[j] = dato;
                    j++;
                } else {
                    arregloImpares[k] = dato;
                    k++;
                }
            }

            System.out.println("\nArreglo completo: ");
            mostrarArreglo(arregloOriginal);
            System.out.println("\nArreglo de Impares: ");
            mostrarArreglo(arregloImpares);
            System.out.println("\nArreglo de pares: ");
            mostrarArreglo(arregloPares);
        }
    }

    public static void mostrarArreglo(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
