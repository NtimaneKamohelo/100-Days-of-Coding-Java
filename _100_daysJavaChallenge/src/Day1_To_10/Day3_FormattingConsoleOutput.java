package Day1_To_10;

public class Day3_FormattingConsoleOutput {
    public static void main(String[] args) {
        //Display the header of the table
        System.out.printf("%-10s %-10s\n", "degrees", "radians");

        //Display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d %-10.4f\n", degrees, radians);
    }
}
