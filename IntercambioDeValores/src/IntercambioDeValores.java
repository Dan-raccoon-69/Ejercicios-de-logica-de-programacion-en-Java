public class IntercambioDeValores {
    public static void main(String[] args) throws Exception {
        cambioValores(5, 6);
        cambioValores(69, 666);
        cambioValores(35, 20);

    }

    public static void cambioValores(int num1, int num2){
        System.out.println("\nAntes: \n Numero 1 : " + num1 + ", Numero2 : " + num2);
        int aux;    
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Despues: \n Numero 1 : " + num1 + ", Numero2 : " + num2);
    }
}
