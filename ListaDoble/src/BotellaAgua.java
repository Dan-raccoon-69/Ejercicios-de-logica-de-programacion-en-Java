public class BotellaAgua {
    String marca;
    int volumen;
    double precio;
    BotellaAgua siguiente;
    BotellaAgua anterior;

    public BotellaAgua() {
        this.marca = "BONAFONT";
        this.volumen = 1500;
        this.precio = 12.00;
        this.siguiente = null;
        this.anterior = null;
    }

    public BotellaAgua(String m1, int m2, double p1) {
        this.marca = m1;
        this.volumen = m2;
        this.precio = p1;
        this.siguiente = null;
        this.anterior = null;
    }

    public void muestraDatos() {
        System.out.println("Marca: " + this.marca + " Volumen: " + this.volumen + " Precio= " + this.precio);
    }

}
