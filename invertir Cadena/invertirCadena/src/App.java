public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(invertirPalabras("daniel"));
        System.out.println(invertirPalabras("daniel rocket 69"));
    }

    public static String invertirPalabras(String cadena){
        String cadenaNueva = "";
        for (int j = (cadena.length()) - 1; j >= 0; j--) {
            cadenaNueva += cadena.charAt(j);
        }
        return cadenaNueva;
    }
}
