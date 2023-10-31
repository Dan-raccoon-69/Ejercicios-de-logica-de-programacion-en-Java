import javax.swing.JOptionPane;

public class App {
    static int array[] = new int[12];
    public static void main(String[] args) throws Exception {
        llenarArreglo();
        verHistograma();
    }

    public static void llenarArreglo() {
        int valor = 0;
        for (int i = 0; i < array.length; i++) {
            do {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + (i + 1)));
                if (valor < 1 || valor > 6) {
                    JOptionPane.showMessageDialog(null, "Valor fuera del rango (1 - 6)");
                } else {
                    array[i] = valor;
                }
            } while ((valor < 1 || valor > 6));
        }
    }

    public static void verHistograma() {
        String vUno = "", vDos = "", vTres = "", vCuatro = "", vCinco = "", vSeis = ""; 
        System.out.println("\nHistograma: ");
        for (int i = 0; i < array.length; i++) {
                if(array[i] == 1) vUno += "*";
                if(array[i] == 2) vDos += "*";
                if(array[i] == 3) vTres += "*";
                if(array[i] == 4) vCuatro += "*";
                if(array[i] == 5) vCinco += "*";
                if(array[i] == 6) vSeis += "*";
        }
        System.out.println("1: " + vUno + "\n2: " + vDos + "\n3: " + vTres + "\n4: " + vCuatro + "\n5: " 
        + vCinco + "\n6: " + vSeis);
    }
}
