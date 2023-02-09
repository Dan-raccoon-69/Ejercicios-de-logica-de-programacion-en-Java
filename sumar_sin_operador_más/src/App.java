public class App {
    public static void main(String[] args) throws Exception {
        /**
         * realizar una suma sin utilizar el operador suma
         */
        sumar(5,4); // 9
        sumar(15,47); // 62
        sumar(-2,-6); // -8
        sumar(-20,50); // 30
    }

    public static void sumar(int a, int b){
        // 5 -1(-4);
        System.out.println((a)-(1)*(-b));
    }
}
