import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        float lado1, lado2;
        int opcion;
        opcion = Integer.parseInt(
                JOptionPane.showInputDialog("Escoge la opcion deseada:" + "\n1. Cuadrado\n" + "2. Rectangulo"));
        switch (opcion) {
            case 1 -> {
                lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del lado"));
                Area_Perimetro cuadrilatero1 = new Area_Perimetro(lado1);
                JOptionPane.showMessageDialog(null, cuadrilatero1.calcular());
            }
            case 2 -> {
                lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del 1er lado"));
                lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del 2do lado"));
                if (lado1 != lado2) {
                    Area_Perimetro cuadrilatero2 = new Area_Perimetro(lado1, lado2);
                    JOptionPane.showMessageDialog(null, cuadrilatero2.calcular());
                } else {
                    JOptionPane.showMessageDialog(null, "Los lados deben de ser diferentes en el rectangulo.");
                }
            }
        }
    }
}
