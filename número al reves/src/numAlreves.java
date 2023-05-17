public class numAlreves {
    public static void main(String[] args) throws Exception {
        calcular(15);
        calcular(1558);
    }

    public static void calcular(int num) {
        String numero,newNumeroString = "";
        int newNumeroInt;
        
        numero = String.valueOf(num);
        for (int i = numero.length() - 1; i >= 0; i--) {
            newNumeroString += numero.charAt(i);
        }

        newNumeroInt = Integer.parseInt(newNumeroString);
        System.out.println("\nNumero = " + num + "\nNumero Nuevo = " + newNumeroInt);
    }
}
