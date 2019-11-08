import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args)
    {
        System.out.printf("Enter the size of the times table: ");
        Scanner keyboard = new Scanner(System.in);
        int maxSize = keyboard.nextInt();

        for (int x=1; x<=maxSize; x++)
        {
            for (int y=1; y<=maxSize; y++)
            {
                System.out.printf("%5d", x*y);
            }
            System.out.println();
        }
    }
}
