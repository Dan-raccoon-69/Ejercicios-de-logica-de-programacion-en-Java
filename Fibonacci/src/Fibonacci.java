public class Fibonacci {
    public static void main(String[] args) throws Exception {
        fibonacci();
    }

    public static void fibonacci() {
        int cantidad = 2;
        long resultado = 0, a = 0, b = 1;

        long array[] = new long[50];
        array[0] = a;
        array[1] = b;
        while (cantidad < 50) {
            // almacenandolos en un arreglo
            array[cantidad] = resultado = a + b;
            a = b;
            b = resultado;
            cantidad++;
        }
        // mostrando los 50 elementos en el arreglo
        for (int i = 0; i < 50; i++) {
            System.out.println("Posicion: " + (i + 1) + " Valor: " + array[i]);
        }
    }
}
