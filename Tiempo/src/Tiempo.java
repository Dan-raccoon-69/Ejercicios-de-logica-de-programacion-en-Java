public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos) {
        // This hace referencia a la variable global
        this.setHora(hora);
        this.setMinutos(minutos);
        this.setSegundos(segundos);
    }

    public void setHora(int hora) {
        this.hora = (hora >= 0 && hora <= 23) ? hora : 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = (minutos >= 0 && minutos <= 59) ? minutos : 0;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = (segundos >= 0 && segundos <= 59) ? segundos : 0;
    }

    @Override
    public String toString() {
        return hora + ":" + minutos + ":" + segundos;
    }

    public String militar() {
        return hora + "" + minutos + ":" + segundos;
    }

    public void imprimeEstandar() {
        int horaAjustada = 0;
        boolean am = true;
        if (hora >= 0 && hora <= 11) {
            horaAjustada = hora;
        } else if (hora == 12) {
            horaAjustada = hora;
            am = false;
        } else {
            horaAjustada = hora - 12;
            am = false;
        }
        String resultado = (horaAjustada) + ":" + minutos + ":" + segundos + " " + (am ? "AM" : "PM");
        System.out.println("\n" + resultado);
    }

    public void imprime24Horas() {
        System.out.println("\n" + hora + ":" + minutos + ":" + segundos);
    }

    public void tick() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

}
