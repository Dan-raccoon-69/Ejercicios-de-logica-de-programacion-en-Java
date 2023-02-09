
public class Area_Perimetro {
    private final float lado1;
    private final float lado2;

    // constructores
    // sobrecarga de constructores
    public Area_Perimetro(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Area_Perimetro(float lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    // areas
    private float getArea() {
        float area;
        area = lado1 * lado2;
        return area;
    }

    // perimetros
    private float getPerimetro() {
        float perimetro;
        perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public String calcular() {
        return "\nLado1 = " + lado1 + "\nLado2 = " + lado2 + "\nArea = " + getArea() + "\nPerimetro = "
                + getPerimetro();
    }
}
