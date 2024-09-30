import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = 0;

        while (true) {
            System.out.print("Enter the month (1-12): ");
            month = scanner.nextInt();
            System.out.print("Enter the year (e.g., 2024): ");
            year = scanner.nextInt();

            if (isValidMonth(month) && isValidYear(year)) {
                int days = getDaysInMonth(month, year);
                System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
                break; // Exit the loop if the input is valid
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private static boolean isValidYear(int year) {
        return year > 0; 
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                return 31;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                return 30;
            case 2: 
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; 
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
