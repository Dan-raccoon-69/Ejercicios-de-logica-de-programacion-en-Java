public class CalculadoraNumPrimos {
    public static void main(String[] args) throws Exception {
        generarnumPrimos(7);
    }

    private static boolean isNumPrimoV2(int num) {
        boolean isPrimo = true;
        if (num == 1) {
            isPrimo = false;
        } else {
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        return isPrimo;
    }

    public static int[] generarnumPrimos(int num){
        int arreglo[] = new int[num];
        int j = 0;
        for(int i = 1; i <= num; i++){
            boolean isPrimo = isNumPrimoV2(i);
            if(isPrimo){
                arreglo[j] = i;
                j++;
            }
        }

        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        return arreglo;
    }

}
