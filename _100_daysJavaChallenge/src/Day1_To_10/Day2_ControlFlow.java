package Day1_To_10;

/**
 * Boolean data type
 * The boolean data type declares a variable with the value either true or false
 */

import java.util.Scanner;

public class Day2_ControlFlow {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        //create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int number = input.nextInt();

        int answer = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
