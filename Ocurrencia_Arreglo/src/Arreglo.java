public class Arreglo {
    public int valor;
    public int ocurrencia = 0;
    
    public Arreglo(int valor, int ocurrencia) {
        this.valor = valor;
        this.ocurrencia = ocurrencia;
    }

    public Arreglo(int valor) {
        this.valor = valor;
        this.ocurrencia = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(int ocurrencia) {
        this.ocurrencia = ocurrencia;
    }

}
