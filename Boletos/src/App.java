import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre;
        Object numBoletos;
        boolean estudiante = false;

        try {
            nombre = JOptionPane.showInputDialog("BIENVENIDO\n" + "Ingresa tu nombre: ");
            numBoletos = JOptionPane.showInputDialog(
                    null,
                    "Selecciona el numero de boletos a comprar",
                    "Compra de boletos",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[] { 1, 2, 3 },
                    1);
            int numeroDeBoletos = Integer.parseInt(numBoletos.toString());
            int n = JOptionPane.showConfirmDialog(null, "¿Eres estudiante?",
                    "Descuento de Estudiante",
                    JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                estudiante = true;
            } else if (n == JOptionPane.NO_OPTION) {
                estudiante = false;
            }
            Boleto boleto = new Boleto(nombre, numeroDeBoletos, estudiante);
            int precioTotal = boleto.obtenerPrecioTotal();
            JOptionPane.showMessageDialog(null, "Nombre Comprador: " + boleto.getNombreComprador() + 
            "\nCantidad Boletos: " + boleto.getCantidadBoletos() +
            "\nEstudiante: " + boleto.isEstudiante() + 
            "\nCosto Total: $" + boleto.obtenerPrecioTotal());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LLENADO DE DATOS");
        }
    }
}
