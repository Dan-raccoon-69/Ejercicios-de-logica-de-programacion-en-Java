import javax.swing.JOptionPane;

public class App {
    static int i, arreglo[] = new int[10];

    public static void main(String[] args) throws Exception {
        llenarArreglo();
        ordenar();
    }

    public static void llenarArreglo() {
        for (i = 0; i < 10; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor " + (i + 1)));
        }
    }

    public static void ordenar() {
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.print(arreglo[9 - i] + " " + arreglo[i] + " ");
        }
    }
}
