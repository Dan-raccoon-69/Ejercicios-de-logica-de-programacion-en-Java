package workshop.controlador;

import java.util.Scanner;
import workshop.Database.Database;
import workshop.objetos.Frituras;
import workshop.objetos.Leche;
import workshop.objetos.Producto;
import workshop.objetos.Queso;
import workshop.vista.Vista;

/**
 *
 * @author Daniel
 */
public class Controlador {

    private static Scanner teclado = new Scanner(System.in);
    private static Database dataBase = new Database();
    private static Vista vista = new Vista();

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        int oPrincipal;
        do {
            Vista.header();
            Vista.menu();
            oPrincipal = teclado.nextInt();
            switch (oPrincipal) {
                case 1:
                    Vista.menuComprar();
                    vista.mostrarOpcionProducto();
                    comprar();
                    break;
                case 2:
                    Vista.menuVentas();
                    Vista.mostrarOpcionProducto();
                    sale();
                    break;
                case 3:
                    Vista.menuInventario(dataBase.obtenerProductos());
                    System.out.println("Digite una tecla para continuar...");
                    teclado.nextInt();
                    break;
                case 4:
                    Vista.menuCompras(dataBase.getListaCompras());
                    System.out.println("Digite una tecla para continuar...");
                    teclado.nextInt();
                    break;
                case 5:
                    Vista.menuVentas(dataBase.getListaVentas());
                    System.out.println("Digite una tecla para continuar...");
                    teclado.nextInt();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (oPrincipal != 6);
    }
    
    private static void comprar() {
        int buyOption;
        do {
            Vista.seleccionarOpcion();
            buyOption = Vista.mostrarOpcion();
            if (buyOption >= 1 && buyOption <=3) {
                buyProduct(buyOption);
            } else if (buyOption == 4) {
                System.out.println("\t\tSaliendo del módulo de compras...");
            } else {
                System.out.println("\t\tOpción no válida");
            }
        } while (buyOption != 4);
    }
    
    private static void buyProduct(int buyOption) {
        Producto product = null;
        switch (buyOption) {
            case 1:
                product = new Frituras("Sabritas");
                break;
            case 2:
                product = new Leche("Lala");
                break;
            case 3:
                product = new Queso("Oaxaca");
                break;
            default:
                System.out.println("Opción no válida");
        }
        int amount = vista.getAmount(teclado);
        int price = vista.getPrice(teclado);
        product.setCantidad(amount);
        product.setPrecio(price);
        dataBase.addCompras(product);
        dataBase.comprar(product);
    }
    
    private static void sale() {
        int opcVender;
        do {
            Vista.seleccionarOpcion();
            opcVender = Vista.mostrarOpcion();
            if (opcVender >= 1 && opcVender <=3) {
                venderProducto(opcVender);
            } else if (opcVender == 4) {
                System.out.println("\t\tSaliendo del módulo de ventas...");
            } else {
                System.out.println("\t\tOpción no válida");
            }
        } while (opcVender != 4);
    }
    
    private static void venderProducto(int opcVender) {
        Producto product = null;
        if (opcVender < 1 || opcVender > 3) {
            System.out.println("El producto no existe");
            return;
        }

        product = dataBase.obtenerPorId(opcVender - 1);
        if (product == null) {
            System.out.println("El producto está nulo");
        }
        System.out.println(product);
        int amount = Vista.getAmount(teclado);
        product.setCantidad(amount);
        product.setPrecio((int) (product.getPrecio()*1.25));
        System.out.println("\t\t\tValor a recibir: " + product.getCantidad() * product.getPrecio());
        dataBase.addVentas(product);
        dataBase.venta(product, amount);
    }

}
