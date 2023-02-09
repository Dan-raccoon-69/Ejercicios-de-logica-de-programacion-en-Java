import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        calcularArreglo();
    }

    public static void calcularArreglo() {
        Scanner datos = new Scanner(System.in);
        int arreglo[] = new int[10];
        System.out.println("\nLlenando el Arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe el numero " + (i + 1) + ": ");
            arreglo[i] = datos.nextInt();
        }
        System.out.println("\nArreglo viejo: ");
        mostrarArreglo(arreglo);
        System.out.print("\nEscribe el numero de posiciones a dezplazar: ");
        int posiciones = datos.nextInt();
        dezplazandoArreglo(arreglo, posiciones);
        System.out.println("Arreglo nuevo: ");
        mostrarArreglo(arreglo);
    }

    public static void dezplazandoArreglo(int arreglo[], int posiciones) {
        int aux = 0, recorridos = 0;
        while (recorridos < posiciones) {
            for (int i = 9; i >= 1; i--) {
                if (i == 9) {
                    aux = arreglo[9];
                }
                arreglo[i] = arreglo[i - 1];
                if (i == 1) {
                    arreglo[0] = aux;
                }
            }
            recorridos++;
        }
    }

    public static void mostrarArreglo(int arreglo[]) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}
