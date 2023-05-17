public class numAlreves {
    public static void main(String[] args) throws Exception {
        calcular(15);
        calcular(15587);
        calcular(53784);
        calcular(537);
        calcular(53);
        calcular(5378);
    }

    public static void calcular(int num) {
        String numero,newNumeroString = "";
        int newNumeroInt;
        
        numero = String.valueOf(num);
        if(numero.length() == 5){
            for (int i = numero.length() - 1; i >= 0; i--) {
                newNumeroString += numero.charAt(i);
            }
    
            newNumeroInt = Integer.parseInt(newNumeroString);
            System.out.println("\nNumero = " + num + "\nNumero Nuevo = " + newNumeroInt);
        }
        else{
            System.out.println("\nEl Número = " + num + " no tiene las 5 cifras");
        }

    }
}
