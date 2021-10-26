import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of times you wish FizzBuzz to run!");
        fizzBuzz(sc.nextInt());
    }

    public static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0)) { //A multiple of 5 or 7
                System.out.println("FizzBuzz");
            } else if ((i % 5) == 0) { //Only a multiple of 5
                System.out.println("Fizz");
            } else if ((i % 7) == 0) { //Only a multiple of 7
                System.out.println("Buzz");
            } else {
                System.out.println(i + " is not a multiple of 5 or 7.");
            }
        }

    }
}
