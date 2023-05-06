public class CalculadoraNumPrimos {
    public static void main(String[] args) throws Exception {
        obtenerNumPrimos(7); // 2 3 5 7
        obtenerNumPrimos(20); // 2 3 5 7 11 13 17 19
    }

    public static boolean isNumPrimo(int num) {
        boolean isPrimo = true;
        if(num == 1){
            isPrimo = false;
        }
        else{
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrimo = false;
                    break;
                }
            }    
        }
        return isPrimo;
    }

    public static void obtenerNumPrimos(int n){
        int arreglo[] = new int[n];
        int contador = 0, k = 0;
        for(int i = 1; i <= n; i++){
            boolean isPrimo = isNumPrimo(i);
            if(isPrimo){
                arreglo[contador] = i;
                contador++;
            }
        }
        
        while(arreglo[k] != 0){
            System.out.print(arreglo[k] + " ");
            k++;
        }
        System.out.println();
    }
}
