package Day1_To_10;

import java.util.Scanner;

/**
 * An if statement is a construct that enables a program
 * to specify an alternative paths of execution.
 *
 * The program below prompts a user to enter an integer.
 * if the number is the multiple of 5, the program displays HiFive.
 * if the number is divisible by 2, it displays HiEven.
 */

public class Day2_IF_Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intNumber = input.nextInt();

        if (intNumber % 5 ==0 ){
            System.out.println("HiFive");
        }
        if (intNumber % 2 == 0){
            System.out.println("HiEven");
        }


    }
}
