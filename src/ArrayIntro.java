public class ArrayIntro {
    public static void main(String[] args)
    {
        int[] grades = new int[10];
        grades[0] = 89;
        grades[1] = 78;
        grades[2] = 82;
        grades[3] = 94;
        grades[4] = 94;
        grades[5] = 94;
        grades[6] = 94;
        grades[7] = 94;
        grades[8] = 94;
        grades[9] = 2;

        int[] weights = {200,340,400,334};

        String[] friends = {"Fred","June","Clyde"};

        //example of how we did it in the assignment-lots of duplicate code
        int grade1=55;
        int grade2=77;
        int grade3=53;
        int grade4=99;
        System.out.println("Old style with individual variables:");
        System.out.printf("The grade in course 1 is %d%n", grade1);
        System.out.printf("The grade in course 2 is %d%n", grade2);
        System.out.printf("The grade in course 3 is %d%n", grade3);
        System.out.printf("The grade in course 4 is %d%n", grade4);

        System.out.println("\nNew style -looping over an array:");
        for(int i=0;i<grades.length; i++)
            System.out.printf("The grade in course %d is %d%n",i+1, grades[i]);

        System.out.printf("The average grade is %.1f%% %n", getAvg(grades));
        System.out.printf("The smallest number in the array is %d%n", min(grades));

    }

    /**
     * This method will return the average of an array of integers
     */
    public static double getAvg(int[] numbers)
    {
        //assignment 1 way ..slow and error prone
        //return (g1+g2+g3+g4+g5+g6)/6

        //better way with loops and arrays
        double sum =0;

        for (int i=0; i<numbers.length; i++)
            sum += numbers[i];

        return sum/numbers.length;
    }

    public static int min(int[] numbers)
    {
        //assume the first is the lowest
        int smallest = numbers[0];

        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        return smallest;
    }
}
