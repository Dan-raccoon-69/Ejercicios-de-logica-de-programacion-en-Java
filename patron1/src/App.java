public class App {
    public static void main(String[] args) throws Exception {
        patron1(15);        
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

