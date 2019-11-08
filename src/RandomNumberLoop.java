import java.security.SecureRandom;

public class RandomNumberLoop {
    public static void main(String[] args)
    {
        //create a random number generator
        SecureRandom rng = new SecureRandom();
        int num = rng.nextInt(10)+1;

        System.out.printf("The random number is %d%n", num);

        for (int i=1; i<=num; i++)
        {
            System.out.println("My name is Jaret");
        }
    }
}
