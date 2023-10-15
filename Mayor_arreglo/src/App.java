import javax.swing.JOptionPane;

public class App {
    static int array[] = new int[7];

    public static void main(String[] args) throws Exception {
        llenarArreglo();
        verArreglo();
    }

    public static void llenarArreglo() {
        int valor = 0;
        boolean repetido = false;
        for (int i = 0; i < array.length; i++) {
            do {
                repetido = false;
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + (i + 1)));
                if (valor < 11 || valor > 99) {
                    JOptionPane.showMessageDialog(null, "Valor fuera del rango (11 - 99)");
                } else {
                    if (i != 0) {
                        for (int j = 0; j < i; j++) {
                            if (array[j] == valor){
                                repetido = true;    
                                JOptionPane.showMessageDialog(null, "Valor repetido");
                            } else
                                array[i] = valor;
                        }
                    } else
                        array[i] = valor;
                }
            } while ((valor < 11 || valor > 99) || (repetido == true));
        }
    }

    public static void verArreglo() {
        int mayor = 0;
        System.out.println("Arreglo: ");
        for (int i : array) {
            System.out.print(i + " ");
            if(i > mayor){
                mayor = i;
            }
        }
        System.out.println("\nElemento mayor del Arreglo: " + mayor);
    }
}
