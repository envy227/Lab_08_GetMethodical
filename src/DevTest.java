import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        // Test getDouble
        double salary = SafeInput.getDouble(in, "Enter your salary");
        System.out.println("You entered: " + salary);

        // Test getRangedInt (low=1, high=10)
        int choice = SafeInput.getRangedInt(in, "Enter a choice", 1, 10);
        System.out.println("You entered: " + choice);

        // Test getRangedDouble (low=5.5, high=9.9)
        double score = SafeInput.getRangedDouble(in, "Enter a score", 5.5, 9.9);
        System.out.println("You entered: " + score);

        // Test getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue");
        System.out.println("Confirmation is: " + confirm);

        // Test getRegExString (SSN pattern)
        String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + ssn);

        // Test prettyHeader
        SafeInput.prettyHeader("Test Message");
    }
}