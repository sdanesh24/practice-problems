import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        // best practice to create the new ArrayList using List<> or ArrayList<> here?
        List<Integer> division_Results = new ArrayList<>();

        for(int i = 1; i <= input; i++)
        {
            int result = (input % i);

            if(result == 0)
            {
               // my first thought: division_Results.add(result);
               // better to show the exact divisors to confirm that they are 1 and input for primes
               division_Results.add(i);
            }
        }

        System.out.println("Divisors: " + division_Results);
        // .size() method used for ArrayLists
        // .length used for arrays (length of an array is fixed when instantiated)
        if(division_Results.size() == 2)
        {
            System.out.println(input + " is a prime number!");
        }
        else
        {
            System.out.println(input + " is not a prime number");
        }
        scanner.close();
    }
}

// how to make another class that just has a space for me to test the modulo operator to see if my for loop is running properly?