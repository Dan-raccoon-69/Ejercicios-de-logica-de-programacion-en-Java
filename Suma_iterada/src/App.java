import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumaIterada());
    }

    public static String sumaIterada() {
        int contador = 1, num, suma = 0;
        while (contador <= 10) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número " + contador + ": "));
            suma += num;
            contador++;
        }
        return "Resultado es: " + suma;
    }
}
