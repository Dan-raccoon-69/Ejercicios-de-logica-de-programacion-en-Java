public class Array {
    int array[] = new int[100];

    public Array() {
    };

    private void llenarArreglo() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 100) + 1;
        }
        mostrarArreglo();
    }

    private void mostrarArreglo() {
        System.out.println("\nElementos del arreglo: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void ordenarArreglo() {
        // se resta 1 a la condicion para que no se salga del rango del arreglo.
        int aux;
        for (int i = 0; i < (array.length) - 1; i++) {
            for (int j = 0; j < (array.length) - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    private int numMayor() {
        return array[array.length - 1];
    }

    private int numMenor() {
        return array[0];
    }

    private int sumaPrimer_UltimoElemento() {
        return numMayor() + numMenor();
    }

    private void numerosPrimos() {
        System.out.println("\nNumeros primos: ");
        for (int i : array) {
            boolean isPrimo = true;
            if (i == 1) {
                isPrimo = false;
                continue;
            }
            for (int k = 2; k < i; k++) {
                if ((i % k == 0)) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private void numerosPares() {
        System.out.println("\nNumeros pares: ");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private void promedioArreglo() {
        double promedio = 0;
        System.out.println("\nPromedio: ");
        for (int i : array) {
            promedio += i;
        }
        promedio = promedio / array.length;
        System.out.println(promedio);
    }

    private boolean existeCien(){
        boolean existeCien = false;
        for (int i : array) {
            if(i == 100){
                existeCien = true;
                break;
            }
        }
        return existeCien;
    }

    public void mostrarCalculos(){
        llenarArreglo();
        ordenarArreglo();
        System.out.println("\nNumero Mayor: " + numMayor());
        System.out.println("\nNumero Menor: " + numMenor());
        numerosPrimos();
        numerosPares();
        System.out.println("\nArreglo ascendentemente: ");
        mostrarArreglo();
        promedioArreglo();
        System.out.println("\nSumaPrimer_UltimoElemento: " + sumaPrimer_UltimoElemento());
        System.out.println("\nExiste al menos un cien? : " + existeCien());

    }
}
