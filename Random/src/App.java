import java.time.LocalDate;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 200; i++) {
            System.out.println(obtenerIdCliente());
        }

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
    }

    public static int obtenerIdCliente() {
        Random random = new Random();
        int numero = random.nextInt(6) + 1;
        return numero;
    }

    
}
