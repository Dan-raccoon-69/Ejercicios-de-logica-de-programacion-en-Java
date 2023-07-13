// PAQUETE - ACHIVO QUE SE ENCARGA DE  ALMACENAR LA INFORMACION - ADMINISTRAR EL INVENTARIO
package workshop.Database;
// Productos

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import workshop.objetos.*;

/**
 *
 * @author Daniel
 */
public class Database {

    private Producto productos[];
    private List<Producto> compras;
    private List<Producto> ventas;

    public Database() {
        productos = new Producto[3];
        Producto fritura = new Frituras("Doritos");
        Producto leche = new Leche("LaLa");
        Producto queso = new Queso("Oaxaca");

        productos[0] = fritura;
        productos[1] = leche;
        productos[2] = queso;
        
        // inicializando las listas
        // este tipo de attalist pueden crecer y decrecer  
        compras = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public Producto obtenerPorId(int index) {
        if (index < 0 || index > 2) {
            System.out.println("Indice no aceptado.");
            return null;
        }
        // Retornando el producto pero cloneable para que no se pueda
        // acceder a ciertos valores
        Producto p = null;
        try {
            p = productos[index].clonar();
        } catch (CloneNotSupportedException cnse) {
            System.out.println(cnse);
        }
        return p;
    }

    public Producto[] obtenerProductos() {
        Producto[] productosClonados = new Producto[3];
        for (int a = 0; a < productos.length; a++) {
            try {
                productosClonados[a] = productos[a].clonar();
            } catch (CloneNotSupportedException cnse) {
                System.out.println(cnse);
            }
        }
        return productosClonados;
    }
    
    public void comprar(Producto pro){
        Producto temp = null;
        switch (pro.getClass().getSimpleName()) {
            case "Frituras":
                temp = productos[0];
                break;
            case "Leche":
                temp = productos[1];
                break;
            case "Queso":
                temp = productos[2];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error de Producto");
        }   
        temp.setCantidad(temp.getCantidad() + pro.getCantidad());
        temp.setPrecio((int) pro.getPrecio());
    }
    
    public void venta(Producto pro, int amount){
        Producto temp = null;
        switch (pro.getClass().getSimpleName()) {
            case "Frituras":
                temp = productos[0];
                break;
            case "Leche":
                temp = productos[1];
                break;
            case "Queso":
                temp = productos[2];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error de Producto");
        }   
        temp.setCantidad(temp.getCantidad() - amount);
    }
    
    public List<Producto> getListaCompras(){
        return compras;
    }
    
    public List<Producto> getListaVentas(){
        return ventas;
    }
    
    // Agrega compras
    public void addCompras(Producto p) {
        compras.add(p);
    }
    
    // Agrega ventas
    public void addVentas(Producto p) {
        ventas.add(p);
    }
    
    // Devuelve todos los productos comprados
    public List<Producto> getPurchases() {
        return compras;
    }
    
    
}
