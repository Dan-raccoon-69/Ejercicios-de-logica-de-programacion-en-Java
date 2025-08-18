public class Fibonacci {
    public static void main(String[] args) throws Exception {
        fibonacci();
    }

    public static void fibonacci() {
        long resultado = 0, numAntes = 0, numDespues = 1;
        System.out.print(numAntes+ " " + numDespues);
        for(int i = 0; i<48; i++){
            resultado = numAntes + numDespues;
            System.out.print(" " + resultado);
            numAntes = numDespues;
            numDespues = resultado;
        }
    }
}