package Day1_To_10;

import java.util.Scanner;

public class Day3_ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //prompt the user to enter height in inches
        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();

        double weihgtInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weihgtInKilograms / (heightInMeters * heightInMeters);

        //Display results
        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else
            System.out.println("Obese");
    }
}