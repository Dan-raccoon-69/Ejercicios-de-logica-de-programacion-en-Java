public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(invertirCadenas("daniel"));
        System.out.println(invertirCadenas("daniel rocket 69"));
    }

    public static String invertirCadenas(String cadena){
        String cadenaNueva = "";
        for (int j = (cadena.length()) - 1; j >= 0; j--) {
            cadenaNueva += cadena.charAt(j);
        }
        return cadenaNueva;
    }
}
