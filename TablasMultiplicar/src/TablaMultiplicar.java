public class TablaMultiplicar {
    public static void main(String[] args) throws Exception {
        tablaMultiplicar(20);
    }

    public static void tablaMultiplicar(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + "*" + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
