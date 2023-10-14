import javax.swing.JOptionPane;

public class App {
    static int array[] = new int[7];

    public static void main(String[] args) throws Exception {
        llenarArreglo();
        verArreglo();
    }

    public static void llenarArreglo() {
        int valor = 0;
        for (int i = 0; i < array.length; i++) {
            do {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + (i + 1)));
                if (valor < 11 || valor > 99) {
                    JOptionPane.showMessageDialog(null, "Valor fuera del rango (11 - 99)");
                } else {
                    array[i] = valor;
                }
            } while ((valor < 11 || valor > 99));
        }
    }

    public static void verArreglo() {
        System.out.println("Arreglo: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
