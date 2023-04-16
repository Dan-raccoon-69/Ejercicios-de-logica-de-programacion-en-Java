public class serie_1_6_36_216 {
    public static void main(String[] args) throws Exception {
        imprimeSerie(8);
    }

    public static void imprimeSerie(int N){
        // *6 *6 *6...
        long serie = 1;
        int contador = 0;
        while(contador < N){
            System.out.println(serie);
            serie *= 6;
            contador++;
        }
    }
}
