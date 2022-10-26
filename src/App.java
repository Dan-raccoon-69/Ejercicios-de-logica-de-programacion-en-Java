import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);

        // Ejercicio1
        /**
         * Pedir palabras al usuario hasta que el usuario escriba una cadena vacia.
         * Muestra la concatencación de esas palabras al final.
         */
        String cadenas, concatenacion = "";
        do {
            System.out.println("Escribe la palabra: ");
            cadenas = datos.nextLine();
            concatenacion = concatenacion + cadenas + " ";
        } while (cadenas.length() != 0);

        System.out.println(concatenacion);

        // Ejercicio2
        /**
         * Pide un numero por consola y valida que ese numero este entre 0 y 10.
         * Hazlo con un do-while.
         */

        int number;
        do {
            System.out.println("Escribe un numero: ");
            number = datos.nextInt();
            if (!(number >= 0 && number <= 10)) {
                System.out.println("Numero fuera de rango, intenta otra vez.");
            }
        } while (!(number >= 0 && number <= 10));
        System.out.println("Numero valido.");

        // Ejercicio3
        /**
         * Pide un numero de segundos e indica cuantas horas, minutos y segundos
         * equivalen
         */

        int segundos, minutos, horas;
        System.out.println("Ingresa los segundos: ");
        segundos = datos.nextInt();
        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        // Ejercicio4
        /**
         * Generar un numero aleatorio enre 1 y 100.
         * Pedir al usuario un numero, si el usuario falla, debes de indicarle si el
         * numero que introdujo es mayor o menor que el.
         * El programa termina cuando el usuario acierta, no hay limites de intentos.
         */

        int numeroAleatorio = (int) (Math.random() * 100 + 1);
        int numeroUsuario, intentos = 0;
        boolean ganaste = false;
        do {
            System.out.println("Numero de usuario: ");
            numeroUsuario = datos.nextInt();
            if (numeroAleatorio > numeroUsuario) {
                System.out.println("El numero es más grande.\nIntenta otra vez\n");

            } else if (numeroAleatorio < numeroUsuario) {
                System.out.println("El numero es más pequeño.\nIntenta otra vez\n");
            } else {
                ganaste = true;
            }
            intentos++;
        } while (ganaste != true);

        if (ganaste) {
            System.out.println("GANASTE!");
            System.out.println("Intentos: " + intentos);
        }

    }
}
