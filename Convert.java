import java.util.Scanner;

class Convert
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Convertisseur CELSIUS ET FAHRENHEIT");
        boolean replay = true;
        
        while(replay)
        {
            int mode = Menu.chose_mode(input);
            if (mode == 1)
            {
                System.out.println("Choisir la valeur a convertir :");
                double A = input.nextDouble();

                double res = (9.0 / 5.0) * A + 32;
                System.out.println("Le resultat est : " + arrondi(res, 2) + "F");
            }

            else
            {
                System.out.println("Choisir la valeur a convertir :");
                double A = input.nextDouble();

                double res = ((A - 32.0) * 5) / 9.0;
                System.out.println("Le resultat est : " + arrondi(res, 2) + "C");
            }

            System.out.println("Wanna replay ? (y/n) --default [y]");
            if (input.next().charAt(0) == 'n')
            {
                replay = false;
                System.out.println("See you~~ !");
            }
        }
    }

    public static double arrondi(double A, int B)
    {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}