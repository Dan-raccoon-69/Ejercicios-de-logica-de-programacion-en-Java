import java.awt.HeadlessException;
import javax.swing.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        ListaDobleDos lista = new ListaDobleDos();
        int opcion;
        boolean control = true;
        String paso;
        String m1, m3;
        int m2;
        double p1;
        while (control == true) {
            try {
                lista.menu();
                paso = JOptionPane.showInputDialog("ELIJA UNA OPCION");
                opcion = Integer.parseInt(paso);
                switch (opcion) {
                    case 1:
                        m1 = JOptionPane.showInputDialog("ESCRIBA LA MARCA");
                        m3 = JOptionPane.showInputDialog("ESCRIBA EL PRECIO");
                        p1 = Double.parseDouble(m3);
                        paso = JOptionPane.showInputDialog("ESCRIBA EL VOLUMEN");
                        m2 = Integer.parseInt(paso);
                        lista.insertarNodoInicio(m1, m2, p1);
                        break;
                    case 2:
                        m1 = JOptionPane.showInputDialog("ESCRIBA LA MARCA");
                        m3 = JOptionPane.showInputDialog("ESCRIBA EL PRECIO");
                        p1 = Double.parseDouble(m3);
                        paso = JOptionPane.showInputDialog("ESCRIBA EL VOLUMEN");
                        m2 = Integer.parseInt(paso);
                        lista.InsertarNodoAlFinal(m1, m2, p1);
                        break;
                    case 3:
                        lista.recorrer();
                        break;
                    case 4:
                        m1 = JOptionPane.showInputDialog("ESCRIBA LA MARCA POR BORRAR");
                        lista.borrar(m1);
                        break;
                    case 7:
                        control = false;
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA, INTENTE OTRA VEZ");
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("ERROR ");
            }
        }
    }

}
