import java.util.Scanner;

public class busquedaBinary {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try (Scanner datos = new Scanner(System.in)) {
            int num,i,j;
            boolean buscar = false;

            //declaracion de arreglo
            int arreglo[]={1,20,5,60,14,2,7,3,0,74};
            
            System.out.print("Escribe el numero a buscar: ");
            num=datos.nextInt();
            
            //busqueda
            for(i = 0; i < arreglo.length; i++){
                if(arreglo[i] == num){
                    buscar=true;
                    break;
                }
            }

            //imprimiendo arreglo original
            System.out.println("\nArreglo original:");
            for(j = 0; j < arreglo.length; j++){
                System.out.print(arreglo[j] + " ");
            }

            //mensajes
            if(buscar){
                System.out.println("\nEl numero "+ num+ " si existe en el arreglo en la posicion: " + (i+1));
            }
            else {
                System.out.println("\nEl numero " + num + " no existe en el arreglo.");
            }
        }
    }
}
