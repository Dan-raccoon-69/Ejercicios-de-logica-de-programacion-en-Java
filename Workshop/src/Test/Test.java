package Test;

/**
 *
 * @author Daniel
 */
import workshop.Database.Database;
import workshop.objetos.Producto;

public class Test {

    public static void main(String[] args) {
        Database database = new Database();
        Producto producto = database.obtenerPorId(0);
        producto.setPrecio(20);
        producto.setNombre("Desconocido");
        //System.out.println(producto);
        
        // prueba
        Producto[] productos = database.obtenerProductos();
        for (Producto p : productos) {
            System.out.println(p + "\n");
        }
    }

}
