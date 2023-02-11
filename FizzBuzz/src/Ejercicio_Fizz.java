public class Ejercicio_Fizz {
    public static void main(String[] args) throws Exception {
        FizzBuzz();
    }

    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if((i % 3 != 0) && (i % 5 != 0) && (i % 15 != 0))
            System.out.print(i + " ");
            if ((i % 3 == 0) && (i % 15 != 0))
                System.out.print("Fizz");
            else if ((i % 5 == 0) && (i % 15 != 0))
                System.out.print("Buzz");
            else if (i % 15 == 0)
                System.out.print("Fizz Buzz");
            System.out.println();
        }
    }
}
