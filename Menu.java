import java.util.Scanner;

public class Menu
{
    public static int chose_mode(Scanner input)
    {
        int mode = 0;
        while (mode == 0)
        {
            printMenu();
            mode = getNextInt(input);
            if (mode != 1 && mode != 2)
            {
                System.out.println("Enter a valid number");
                mode = 0;
            }
        }
        return (mode);
    }

    public static int getNextInt(Scanner input)
    {
        while(!input.hasNextInt())
        {
            input.next();
            System.out.println("Enter a valid number");
            printMenu();
        }
        return (input.nextInt());
    }

    public static void printMenu()
    {
        System.out.println("Veuillez choisir le mode de conversion : ");
        System.out.println("1 - Celsius -> Fahrenheit");
        System.out.println("2 - Fahrenheit -> Celsius");
    }
}
