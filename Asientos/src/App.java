import javax.swing.JOptionPane;

public class App {
    public static int[] asientos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    public static int numLugaresReservados = 0;

    public static void main(String[] args) throws Exception {
        String respuesta = "";
        do {
            visualizarAsientos();

            int nLugares = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "\nIngresa el numero de asientos a reservar: "));
            apartarLugares(nLugares);

            visualizarAsientos();

            respuesta = JOptionPane.showInputDialog(null, "Ingresa 'SI' para continuar, 'NO' para terminar.");
        } while (respuesta.equals("si") || respuesta.equals("SI"));

    }

    public static void apartarLugares(int nLugares) {
        try {
            if ((nLugares > (asientos.length - numLugaresReservados)) && (numLugaresReservados != 10)) {
                JOptionPane.showMessageDialog(null, "ASIENTOS FALTANTES");
            }
            if (numLugaresReservados == 10) {
                JOptionPane.showMessageDialog(null, "ASIENTOS AGOTADOS");
            } else {
                int lugares = 0;
                for (int i = 0; i < nLugares; i++) {
                    do {
                        lugares = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "\nLugares : " + nLugares + "\nIngresa el asiento: " + (i + 1)));
                        if ((lugares > 10 || lugares < 1)) {
                            JOptionPane.showMessageDialog(null, "ASIENTO INVALIDO, vuelve a intentar.");
                        } else {
                            if (asientos[lugares - 1] == 0) {
                                JOptionPane.showMessageDialog(null, "ASIENTO OCUPADO, vuelve a intentar.");
                                visualizarAsientos();
                            } else {
                                asientos[lugares - 1] = 0;
                                numLugaresReservados++;
                            }
                        }
                    } while (lugares > 10 || lugares < 1);
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void visualizarAsientos() {
        System.out.println("\nAsientos: ");
        for (int l : asientos) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}
