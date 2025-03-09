import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

        if(userInput != 0 && userInput % 3 == 0 && userInput % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else if(userInput != 0 && userInput % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else if(userInput != 0 && userInput % 5 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(userInput + " is not evenly divisible by three or five.");
        }
        scanner.close();
    }
}