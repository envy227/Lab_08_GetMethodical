import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMoreItems;

        do
        {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
            totalCost += itemPrice;

            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to check out");
        } while (hasMoreItems);

        // Display the total cost formatted to 2 decimal places
        System.out.printf("\nThe total cost of your item(s) is: $%.2f\n", totalCost);
    }
}