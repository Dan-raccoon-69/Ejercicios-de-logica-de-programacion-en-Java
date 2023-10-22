import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    static Arreglo[] arreglo = new Arreglo[10];
    static Arreglo[] arregloOcurrencias = new Arreglo[10];
    public static void main(String[] args) throws Exception {
        llenarArreglo();
        mostrarArreglo();
    }

    public static void llenarArreglo(){
        for (int i = 0; i < 10; i++) {
            Arreglo array = new Arreglo(0);
            array.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero " + (i+1) + ":"));
            arreglo[i] = array;
        }
    }

    public static void mostrarArreglo(){
        for (Arreglo arreglo2 : arreglo) {
            System.out.print(arreglo2.valor + " ");
        }
    }

    public static void ocurrencias(){

    }
    
}
