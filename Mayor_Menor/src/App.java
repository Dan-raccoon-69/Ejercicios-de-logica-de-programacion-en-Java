public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        int[] array = {4,8,-6,128,64,-36,73,-5,-44,8};
        int mayor, menor;
        mayor = menor = array[0];

        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>mayor) mayor = array[i];
            if(array[i]<menor) menor = array[i];
        }

        System.out.println("MAYOR: " + mayor);
        System.out.println("MENOR: " + menor + "\n");

        int[] array2 = {4,8,-6,128,64,-36,73,-5,-44,8};
        int mayor2, menor2;
        mayor2 = menor2 = array2[0];

        for (int i : (array2)) {
            if(i >mayor2) mayor2 = i;
            if(i <menor2) menor2 = i;
        }

        System.out.println("MAYOR2: " + mayor2);
        System.out.println("MENOR2: " + menor2);


    }
}
