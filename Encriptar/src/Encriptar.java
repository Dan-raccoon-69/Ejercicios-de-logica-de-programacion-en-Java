public class Encriptar {
    public static void main(String[] args) throws Exception {
        System.out.println(encriptar("hello word"));
        System.out.println(encriptar("lucas es mi perro"));
    }

    public static String encriptar(String cadena){
        System.out.println();
        cadena = cadena.toLowerCase();
        cadena = cadena.replace('i', '1').replace('s', '5').replace('g', '9').replace('o', '0').replace('e', '3').replace('t', '7');
        return cadena;
    }
}
