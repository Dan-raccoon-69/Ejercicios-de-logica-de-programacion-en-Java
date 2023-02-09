import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        insertarArreglo();
    }

    public static void insertarArreglo() {
        Scanner datos = new Scanner(System.in);
        int arreglo[] = new int[10];
        System.out.println("\nLlenando el Arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print("Escribe el numero " + (i + 1) + ": ");
            arreglo[i] = datos.nextInt();
        }
        boolean ordenado = validarArreglo(arreglo);
        if (ordenado) {
            System.out.println("\nArreglo viejo: ");
            mostrarArreglo(arreglo);
            System.out.print("\nEscribe el numero a insertar: ");
            int numero = datos.nextInt();
            insertarElemento(arreglo, numero);
            System.out.println("\nArreglo nuevo: ");
            mostrarArreglo(arreglo);

        } else {
            System.out.println("\nNo es posible continuar, el arreglo debe de estar ordenado crecientemente.");
        }

    }

    public static void mostrarArreglo(int arreglo[]) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }

    public static void insertarElemento(int arreglo[], int numero) {
        boolean menor = false;
        int posicion = 0;
        for (int j = 0; j < 5; j++) {
            if (numero < arreglo[j]) {
                posicion = j;
                menor = true;
                break;
            }
        }
        System.out.println(posicion);
        if (menor) {
            for (int i = 5; i > posicion; i--) {
                arreglo[i] = arreglo[i - 1];
            }

            arreglo[posicion] = numero;
        } else {
            arreglo[5] = numero;
        }
        // elemento = 12
        // 2 4 6 8 10 0 0 0 0 0
        // 0 1 2 3 4 5 6 7 8 9
    }

    public static boolean validarArreglo(int arreglo[]) {
        int contador = 0;
        boolean ordenado = false;

        for (int i = 0; i < 4; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                contador++;
            }
        }
        if (contador == 4) {
            ordenado = true;
        }
        return ordenado;
    }

}
