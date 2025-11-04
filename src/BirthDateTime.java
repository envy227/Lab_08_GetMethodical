import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year, month, day, hour, minute;
        int daysInMonth;

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Determine days in month using a switch (HINT: only 3 groups)
        switch (month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 29; // Assuming a range that covers all years, 29 is the max day for February
                break;
            default: // Months 1, 3, 5, 7, 8, 10, 12
                daysInMonth = 31;
                break;
        }

        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, daysInMonth);
        hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("\nYour birth date and time is: " +
                year + "-" + month + "-" + day + " at " +
                hour + ":" + minute);
    }
}