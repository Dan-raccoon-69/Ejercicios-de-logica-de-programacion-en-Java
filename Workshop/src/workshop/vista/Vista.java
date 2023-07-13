package workshop.vista;

import java.util.List;
import java.util.Scanner;
import workshop.objetos.Producto;

/**
 *
 * @author Daniel
 */
public class Vista {

    public static void header() {
        System.out.println("\n\t********************************");
        System.out.println("\t\t * BIENVENIDO * ");
        System.out.println("\t********************************");
    }

    public static void menu() {
        System.out.println("\t1. Comprar");
        System.out.println("\t2. Vender");
        System.out.println("\t3. Inventario");
        System.out.println("\t4. Ver compras");
        System.out.println("\t5. Ver Ventas");
        System.out.println("\t6. Salir \n");
    }

    public static void seleccionarOpcion() {
        System.out.print("\tSelecciona la opcion deseada: ");
    }

    public static int mostrarOpcion() {
        Scanner datos = new Scanner(System.in);
        int opc = datos.nextInt();
        return opc;
    }

    public static void menuInventario(Producto[] products) {
        System.out.println("\n\t***********************************************************");
        System.out.println("\t\t\t * I N V E N T A R I O * ");
        System.out.println("\t***********************************************************");
        atributosMenu();
        for (Producto v : products) {
            System.out.println("\t\t* " + v.getNombre() + "\t| " + v.getCantidad() + "\t\t| " + v.getPrecio() + "\t\t\t| " + v.getCantidad() * v.getPrecio() + "\t\t*");
        }
    }

    public static void menuCompras(List<Producto> products) {
        System.out.println("\n\t***********************************************************");
        System.out.println("\t\t\t\s * C O M P R A S * ");
        System.out.println("\t***********************************************************");
        atributosMenu();
    }

    public static void menuVentas(List<Producto> products) {
        System.out.println("\n\t***********************************************************");
        System.out.println("\t\t\t\s * V E N T A S * ");
        System.out.println("\t***********************************************************");
        atributosMenu();
    }

    public static void atributosMenu() {
        System.out.println("\t---------------------------------------------------------");
        System.out.println("\tProducto \t | Cantidad\t | V. Unitario\t | V. Total\t ");
    }

    public static void mostrarOpcionProducto() {
        System.out.println("\t\t1. Papas");
        System.out.println("\t\t2. Arroz");
        System.out.println("\t\t3. Carne");
        System.out.println("\t\t4. Volver");
    }
    
    public static int getAmount(Scanner teclado) {
        System.out.print("\t\t\tDigite la cantidad: ");
        return teclado.nextInt();
    }

    public static int getPrice(Scanner teclado) {
        System.out.print("\t\t\tDigite el precio por unidad: ");
        return teclado.nextInt();
    }
    
    public static void menuComprar() {
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*            MENU DE COMPRAS         *");
        System.out.println("\t\t**************************************");
    }
    
    public static void menuVentas() {
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*            MENU DE VENTAS          *");
        System.out.println("\t\t**************************************");
    }
}
