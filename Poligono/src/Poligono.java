import javax.swing.JOptionPane;

public class Poligono {
    public static void main(String[] args) throws Exception {
        System.out.print(areaPoligono("circulo"));
        System.out.print(areaPoligono("cuadrado"));
        System.out.print(areaPoligono("rombo"));
        System.out.print(areaPoligono("rectangulo"));
        System.out.print(areaPoligono("triangulo"));
    }

    public static double areaPoligono(String figura) {
        System.out.println();
        double area = 0;

        figura = figura.toLowerCase();
        if (figura.contains("triangulo") || figura.contains("cuadrado") || figura.contains("rectangulo")) {

            if (figura.equals("triangulo")) {
                System.out.println("\nTriangulo\nArea: ");
                double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
                area = (base * altura) / 2;
            }

            if (figura.equals("rectangulo")) {
                System.out.println("\nRectangulo\nArea: ");
                double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
                area = (base * altura);
            }

            if (figura.equals("cuadrado")) {
                System.out.println("\nCuadrado\nArea: ");
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Lado: "));
                area = Math.pow(lado, 2);
            }
        } else {
            System.out.println("\nFigura no reconocida.");
            area = -1;
        }
        return area;
    }
}
