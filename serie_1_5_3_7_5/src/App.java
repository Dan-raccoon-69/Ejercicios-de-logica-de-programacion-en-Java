public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        serie(25);

    }

    public static void serie(int cantidad) {
        int contador = 1, serie = 1;
        System.out.print(serie + " ");
        while (contador < cantidad) {
            if (contador % 2 == 0) serie -= 2;
            else serie += 4;
            System.out.print(serie + " ");
            contador++;
        }
    }
}
