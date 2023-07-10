package workshop.objetos;

/**
 *
 * @author Daniel
 */
// SE IMPLEMENTA "Cloneable" PARA NO PERMITIR AL USUARIO CAMBIAR LOS DATOS DEL PRODUCTO
public abstract class Producto implements Cloneable{

    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        // validar que la cantidad no sea negativa
        if (cantidad < 0) {
            System.out.println("No hay cantidades negativas.");
            return;
        }
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        // validar que el precio no sea negativo
        if (precio < 0) {
            System.out.println("No hay cantidades negativas.");
            return;
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto { " + "nombre = " + nombre + ", cantidad = " + cantidad + ", precio = " + precio + " " + '}';
    }
    
    // TODOS LOS PRODUCTOS QUE EL USUARIO PUEDA MANIPULAR SERAN CLONEABLES 
    public Producto clonar() throws CloneNotSupportedException{
        return (Producto) super.clone();
    }

}
