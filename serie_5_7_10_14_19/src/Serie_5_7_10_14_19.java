public class Serie_5_7_10_14_19 {
    public static void main(String[] args) throws Exception {
        imprimeSerie(12);
        imprimeSerie(5);
    }

    public static void imprimeSerie(int N) {
        // La suceción va de: 2,3,4,5, 2,3,4,5, 2,3,4,5 ...
        int serie = 5, k = 0, i = 2;

        do {
            System.out.println(serie); 
            if (i <= 5) serie += i;
            i++;
            if (i > 5) i = 2;
            k++;
        } while (k < N);
        System.out.println();
    }
}
