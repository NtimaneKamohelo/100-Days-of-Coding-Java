package Day1_To_10;

import java.util.Scanner;

public class Day3_WhileLoop {
    public static void main(String[] args) {
        //Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the magic number between 0 and 100");

        int guess = -1;
        while (guess != number) {
            //Prompt the user to guess the number
            System.out.println("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.printf("Yes, the number is %d ", number);
            } else if (guess > number) {
                System.out.println("Your Guess is too high");
            } else
                System.out.println("Your Guess is too low");
        }

    }
}
