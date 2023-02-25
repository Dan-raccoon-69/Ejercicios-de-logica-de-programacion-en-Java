import java.util.Scanner;

public class PromedioGrupo {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        double primerTrimestre[] = new double[5];
        double segundoTrimestre[] = new double[5];
        double terTrimestre[] = new double[5];

        // Promedio 1er trimestre
        System.out.println("Primer trimestre");
        double promedioPriTrimestre = llenarArreglo(primerTrimestre);
        // Promedio 2do trimestre
        System.out.println("Segundo trimestre");
        double promedioSegTrimestre = llenarArreglo(segundoTrimestre);
        // Promedio 3er trimestre
        System.out.println("Tercer trimestre");
        double promedioTerTrimestre = llenarArreglo(terTrimestre);

        // mostrando arreglo - calificaciones de cada trimestre
        System.out.println("\nCalificaciones 1er Trimestre: ");
        mostrarArreglo(primerTrimestre);
        System.out.println("Calificaciones 2do Trimestre: ");
        mostrarArreglo(segundoTrimestre);
        System.out.println("Calificaciones 3er Trimestre: ");
        mostrarArreglo(terTrimestre);

        // mostrando promedios
        System.out.println("\nPromedio 1er Trimestre: " + promedioPriTrimestre);
        System.out.println("Promedio 2do Trimestre: " + promedioSegTrimestre);
        System.out.println("Promedio 3er Trimestre: " + promedioTerTrimestre);

        // Promedio de N alumno
        int indice, salir;
        String promedioAlumno;
        do {
            System.out.println("\nIngresa el indice del alumno: ");
            indice = datos.nextInt();
            promedioAlumno = promedioNalumno(indice, primerTrimestre, segundoTrimestre, terTrimestre);
            System.out.println(promedioAlumno);
            System.out.println("\nSalir: (1:Si, otro:No)");
            salir = datos.nextInt();
        } while (salir != 1);
    }

    public static double llenarArreglo(double[] array) {
        // llena datos y retorna el promedio
        double sumaCalificaciones = 0;
        Scanner datos = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa la calificacion del alumno " + (i + 1) + ": ");
            array[i] = datos.nextDouble();
            sumaCalificaciones += array[i];
        }
        System.out.println();
        return (sumaCalificaciones) / 5;
    }

    public static void mostrarArreglo(double[] array) {
        for (double i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static String promedioNalumno(int N, double[] pTri, double[] sTri, double[] tTri) {
        if (N < 1 || N > 5) {
            System.out.println("Indice Incorrecto\nIndice entre 1 y 5.");
            return "\nNo se encontro ningun alumno con ese indice.";
        }
        double promedioAlumno = (pTri[N - 1] + sTri[N - 1] + tTri[N - 1]) / 3;
        return "\n1erTrimestre: " + pTri[N - 1] + "\n2doTrimestre: " + sTri[N - 1] + "\n3erTrimestre: " + tTri[N - 1]
                + "\nPromedio Final: " + promedioAlumno;
    }

}
