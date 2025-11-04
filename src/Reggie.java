import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);


        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number (M#####)", "^[Mm]\\d{5}$");
        System.out.println("M Number: " + mNumber);


        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O, S, V, or Q)", "^[OoSsVvQq]$");
        System.out.println("Menu Choice: " + menuChoice.toUpperCase());
    }
}