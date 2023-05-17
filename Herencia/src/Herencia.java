public class Herencia {
    public static void main(String[] args) throws Exception {
        herencia(1000000);
        herencia(500000);
    }

    public static void herencia(double herencia){
        System.out.println("\nAhijada: $" + (herencia/3) + "\nHijo: $" + (herencia/2) + "\nSobrino: $" + (herencia/6));
    }
}
