public class Ejercicio_Fizz {
    public static void main(String[] args) throws Exception {
        FizzBuzz();
    }

    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean divisiblebythree = (i % 3 == 0) ? true : false;
            boolean divisiblebyfive = (i % 5 == 0) ? true : false;
            if(!divisiblebythree && !divisiblebyfive)
            System.out.print(i + " ");
            if (divisiblebyfive && divisiblebythree)
                System.out.print("Fizz Buzz");
            else if (divisiblebyfive)
                System.out.print("Buzz");
            else if (divisiblebythree)
                System.out.print("Fizz");
            System.out.println();
        }
    }
}
