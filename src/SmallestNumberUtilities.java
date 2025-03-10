import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestNumberUtilities {
    public static int getSmallestNumber(int [] inputs){
        int smallest = Math.min(inputs[0], Math.min(inputs[1], inputs[2]));
        System.out.println("The smallest number is: " + smallest);
        return smallest;
    }

    //can different methods have the same name if they're in different classes?
    public static void multiplyNumberBy3(int smallest){
        int smallestTripled = smallest * 3;
        System.out.println(smallestTripled);
    }

    public static void divideNumberBy3(int smallest){
        int smallestThird = smallest / 3;
        System.out.println(smallestThird);
    }

    public static void isSmallestPrime(int smallest){
        List<Integer> division_Results = new ArrayList<>();

        for(int i = 1; i <= smallest; i++)
        {
            int result = (smallest % i);

            if(result == 0)
            {
                division_Results.add(i);
            }
        }

        if(division_Results.size() == 2)
        {
            System.out.println(smallest + " is a prime number!");
        }
        else
        {
            System.out.println(smallest + " is not a prime number");
        }
    }

    public static void numberPlusAge(int smallest){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        int smallestPlusAge = smallest + age;
        System.out.println(smallest + "+" + age + " is: " + smallestPlusAge);
    }
}
