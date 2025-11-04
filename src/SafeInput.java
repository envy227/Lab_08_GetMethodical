import java.util.Scanner;

public class SafeInput
{
    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while(retString.length() == 0);
        return retString;
    }

    // Part B: getInt
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // Clear the pipe (newline fix)
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    // Part C: getDouble
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // Clear the pipe (newline fix)
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    // Part D: getRangedInt
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // Clear the pipe (newline fix)
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    // Part E: getRangedDouble
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // Clear the pipe (newline fix)
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    // Part F: getYNConfirm
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String input = "";
        boolean done = false;
        boolean confirmation = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            input = pipe.nextLine().trim();

            if (input.equalsIgnoreCase("Y"))
            {
                confirmation = true;
                done = true;
            }
            else if (input.equalsIgnoreCase("N"))
            {
                confirmation = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Y or N.");
            }
        } while (!done);

        return confirmation;
    }

    // Part G: getRegExString
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Input must match the pattern: " + regEx);
            }
        } while (!done);

        return retVal;
    }

    // Part H: prettyHeader
    public static void prettyHeader(String msg)
    {
        final int WIDTH = 60;
        int msgLen = msg.length();
        int starCount = (WIDTH - msgLen - 6) / 2; // 6 is for "***" on each side
        String centerSpaces = " ".repeat(starCount);

        // Top Row (60 asterisks)
        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        // Second Row (*** centered msg ***)
        System.out.print("***");
        System.out.print(centerSpaces);
        System.out.print(msg);

        // Handle odd vs even spacing if needed, but for 60-char width, the repeat works
        System.out.print(centerSpaces);

        // Add one more space if the total width is odd after centering
        if ((WIDTH - msgLen - 6) % 2 != 0)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        // Bottom Row (60 asterisks)
        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}