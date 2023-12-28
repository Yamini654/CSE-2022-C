packages 225e3;
import java.util.Scanner;

public class LabInternalq5b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a number from the user
        System.out.print("Enter a number between 1 and 7: ");
        int userInput = scanner.nextInt();

        // Check if the input is within the valid range
        if (userInput >= 1 && userInput <= 7) {
            String weekdayName = getWeekdayName(userInput);
            System.out.println("The weekday corresponding to " + userInput + " is " + weekdayName + ".");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }

    static String getWeekdayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }
}
