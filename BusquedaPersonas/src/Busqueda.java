import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Busqueda {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Personas> listaPersonasTotales = new ArrayList<>();
        listaPersonasTotales = cargarBD();
        ArrayList<Personas> listaPersonasEncontradas = new ArrayList<>();
        
        
        Scanner datos = new Scanner(System.in);
        String valorBusqueda;
        System.out.println("Ingresa el nombre de la persona: ");
        valorBusqueda = datos.next().toLowerCase();

        for (Personas personas : listaPersonasTotales) {
            if(personas.toString().toLowerCase().contains(valorBusqueda)){
                listaPersonasEncontradas.add(personas);
            }
        }

        System.out.println("\nPersonas Encontradas: ");
        for (Personas personas : listaPersonasEncontradas) {
            System.out.println(personas);
        }
    }

    public static ArrayList<Personas> cargarBD() {
        ArrayList<Personas> listaPersonas = new ArrayList<>();
        Personas persona = new Personas("Daniel Gustavo De La Cruz Bautista");
        Personas persona1 = new Personas("Mar\u00EDa Guadalupe P\u00E9rez Rodr\u00EDguez");
        Personas persona2 = new Personas("Juan Carlos Garc\u00EDa L\u00F3pez");
        Personas persona3 = new Personas("Ana Laura Mart\u00EDnez Gonz\u00E1lez");
        Personas persona4 = new Personas("Jos\u00E9 Luis Torres S\u00E1nchez");
        Personas persona5 = new Personas("Ana Hern\u00E1ndez Ram\u00EDrez");
        Personas persona6 = new Personas("Carlos Alberto Vargas Morales");
        Personas persona7 = new Personas("Laura Patricia M\u00E9ndez Ortiz");
        Personas persona8 = new Personas("Francisco Javier L\u00F3pez Torres");
        Personas persona9 = new Personas("Ricardo Alejandro Rodr\u00EDguez Jim\u00E9nez");
        listaPersonas.add(persona);
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);
        listaPersonas.add(persona7);
        listaPersonas.add(persona8);
        listaPersonas.add(persona9);

        return listaPersonas;
    }

}
