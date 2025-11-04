public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("--------------------------");

        for (int celsius = -100; celsius <= 100; celsius++)
        {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%d\t\t%.2f\n", celsius, fahrenheit);
        }
    }


    public static double CtoF(double Celsius)
    {
        return (Celsius * 9 / 5) + 32;
    }
}