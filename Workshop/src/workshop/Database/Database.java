// PAQUETE - ACHIVO QUE SE ENCARGA DE  ALMACENAR LA INFORMACION - ADMINISTRAR EL INVENTARIO
package workshop.Database;
// Productos

import workshop.objetos.*;

/**
 *
 * @author Daniel
 */
public class Database {

    private Producto productos[];

    public Database() {
        productos = new Producto[3];
        Producto fritura = new Frituras("Doritos");
        Producto leche = new Leche("LaLa");
        Producto queso = new Queso("Oaxaca");

        productos[0] = fritura;
        productos[1] = leche;
        productos[2] = queso;
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
        return productos;
    }

}
