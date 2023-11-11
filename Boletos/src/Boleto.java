public class Boleto {
    private String nombreComprador;
    private int cantidadBoletos;
    private boolean estudiante;
    
    public Boleto(String nombreComprador, int cantidadBoletos, boolean estudiante) {
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadBoletos;
        this.estudiante = estudiante;
    }
    public String getNombreComprador() {
        return nombreComprador;
    }
    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }
    public boolean isEstudiante() {
        return estudiante;
    }
    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }
    
    public int obtenerPrecioTotal(){
        int costo;
        if(estudiante){
            costo = 400 * cantidadBoletos;
        }else{
            costo = 800 * cantidadBoletos;
        }
        return costo;
    }
}
