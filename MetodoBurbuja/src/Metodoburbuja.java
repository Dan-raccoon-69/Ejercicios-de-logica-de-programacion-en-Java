import javax.swing.JOptionPane;

public class Metodoburbuja {
    static int arreglo[];

    public static void main(String[] args) throws Exception {
        pedirDatos(5);
        mostrarArreglo();
        ordenar();
        mostrarArreglo();
    }

    public static void pedirDatos(int numDatos) {
        arreglo = new int[numDatos];
        for (int i = 0; i < numDatos; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato " + (i + 1) + ": "));
        }
    }

    public static void mostrarArreglo() {
        System.out.println("\nArreglo: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }

    public static void ordenar() {
        int aux;
        for (int i = 0; i < (arreglo.length - 1); i++) {
            /*
             * (num-1) porque no es necesario hacer la ultima vuelta ya que ya estarian
             * ordenados en esa parte
             */
            for (int j = 0; j < (arreglo.length - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }
}
