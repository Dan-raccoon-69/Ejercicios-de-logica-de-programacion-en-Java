public class Vocales {
    public static void main(String[] args) throws Exception {
        System.out.println("Vocales de la cadena: " + contarVocales("hola Lucas"));
        System.out.println("Vocales de la cadena: " + contarVocales("mucho gusto mi nombre es daniel"));
    }

    public static int contarVocales(String cadena){
        int contadorVocales = 0;
        cadena = cadena.toLowerCase();
        char[] caracteres = cadena.toCharArray();
        
        for (char item : caracteres) {
            if(item == 'a' || item == 'i' || item == 'e' || item == 'o' || item == 'u'){
                contadorVocales++;
            }
        }
        
        return contadorVocales;
    }
}
