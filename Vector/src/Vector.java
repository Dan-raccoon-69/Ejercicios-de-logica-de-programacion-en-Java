public class Vector {
    static int array[] = new int[15];

    public static void main(String[] args) throws Exception {
        System.out.println("\nLas veces que se cargó el número 3 son: " +
        vector());
        System.out.println("\nLas veces que se cargó el número 3 son: " +
        vector());
        System.out.println("\nLas veces que se cargó el número 3 son: " +
        vector());
        
        // vector(array);

    }

    public static void llenarArreglo() {

        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 10) + 1;
        }

    }

    public static void mostrarArreglo() {
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static int vector() {
        System.out.println("\n/////////////////////////////////");
        llenarArreglo();
        mostrarArreglo();
        int contador = 0;
        for (int i : array) {
            if (i == 3) contador++;
        }
        return contador;
    }
}
