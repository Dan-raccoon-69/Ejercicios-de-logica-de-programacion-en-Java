public class ContarCracteres {
    public static void main(String[] args) throws Exception {
        contarCaracteres("hola soy daniel"); // 15
        contarCaracteres("Hola mundo123"); // 13
        contarCaracteres("Lucas,./*-+ "); // 12
        contarCaracteres("Lucas,./*-+{}<=>"); // 16
    }

    public static void contarCaracteres(String cadena) {
        int i = 0;
        try {
            // el espacio en blanco es el caracter nulo (alt + 255),
            // no es un espacio en blanco
            while (cadena.charAt(i) != ' ') {
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Tamanio de la cadena: " + i);
        }
    }
}
