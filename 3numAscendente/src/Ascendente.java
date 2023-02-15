public class Ascendente {
    public static void main(String[] args) throws Exception {
        ascendente(9, 50, 4); // 4 9 50
        ascendente(9, 8, 3); // 3 8 9
        ascendente(9, 8, 10); // 8 9 10
        ascendente(9, 8, 4); // 4 8 9

    }

    public static void ascendente(int num1, int num2, int num3) {
        int menor, mayor, medio = 0;
        menor = mayor = num1;
        int array[] = new int[3];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;

        for (int j = 0; j < array.length; j++) {
            if (menor > array[j]) menor = array[j];
            if (mayor < array[j]) mayor = array[j];
        }

        for (int i : array) {
            if((i < mayor) && (i > menor)){
                medio = i;
                break;
            } 
        }
        System.out.println(menor + " " + medio + " " + mayor);
    }
}
