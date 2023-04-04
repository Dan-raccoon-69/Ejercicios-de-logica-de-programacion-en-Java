public class CPalabras {
    public static void main(String[] args) throws Exception {
        contarPalabras("Hola, mucho gusto. mi nombre es Daniel un placer conocerte, hola de nuevo soy daniel.");
    }

    public static void contarPalabras(String cadena) {
        cadena = cadena.replace('.', ' ').replace(',', ' ').replace(':', 'n').replace(';', ' ').toUpperCase();

        String[] palabrasArray = cadena.split(" ");
        for (int i = 0; i < palabrasArray.length; i++) {
            String palabra = palabrasArray[i];
            int contadorPalabras = 0;
            for (String string : palabrasArray) {
                if (palabra.equals(string) && palabra.length() >= 3) {
                    contadorPalabras++;
                }
            }
            if (palabra.length() >= 3 && contadorPalabras == 1) {
                System.out.println("La palabra: '" + palabra + "' se repite " + contadorPalabras + " vez.");
            }
            else if((palabra.length() >= 3 && contadorPalabras > 1)){
                System.out.println("La palabra: '" + palabra + "' se repite " + contadorPalabras + " veces.");
            }
        }
    }
}