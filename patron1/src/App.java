public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Replicar la siguiente salida en consola, pidiendo n que indicara el tamaño
         * *
         * **
         * ***
         * ****
         * *****
         * ******
         */
        patron1(10);        
    }

    public static void patron1(int n){
        int aux = 1;
        for(int i=0; i < n; i++){
            for(int j = 0; j < aux; j++){
                System.out.print("*");
            }
            aux++;
            System.out.println();
        }   
    } 
}

