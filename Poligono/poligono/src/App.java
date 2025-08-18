import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(poligono("triangulo"));
        
    }

    public static String poligono(String poligono) {
        double resultado = 0;
        double base = 0;
        double altura = 0;
        double lado = 0;

        Scanner scanner = new Scanner(System.in);

        if(poligono.equals("rectangulo") || poligono.equals("triangulo")){
            System.out.println("altura: ");
            altura = scanner.nextDouble();
            System.out.println("base: ");
            base = scanner.nextDouble();
            resultado = poligono.equals("rectangulo") ? base * altura : (base * altura)/2; 
        }else{
         System.out.println("lado: ");
            lado = scanner.nextDouble();
            resultado = lado * lado;   
        }
        return "Area de " + poligono + " = " + resultado;
    }

}
