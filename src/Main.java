import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LargestNumberUtilities largestNumberUtilities = new LargestNumberUtilities();
        SmallestNumberUtilities smallestNumberUtilities = new SmallestNumberUtilities();

        // THIS IS A GIT TEST
        // Create a variable to store an integer
        // Confused about variable access between methods...
        // is it the same largest variable in main and LargestNumberUtilities or two different ones? use a getter here?

        int largest = 5;
        largest = 6;
        int smallest;

        // need to store each of the three inputs as a list?? - Safa OG comment
        int [] inputs = new int [3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            inputs[i] = scanner.nextInt();
        }

        // Call a method to get the largest number AND return it and save that value
        // creating an instance of the largest number utilities class to call the getLargestNumber method on bc the class is static?

        largest = largestNumberUtilities.getLargestNumber(inputs);
        smallest = smallestNumberUtilities.getSmallestNumber(inputs);

        // Take that return value
        // Create a method in LargestNumberUtilities called 'multiplyNumberBy3(capture)'
        // Store the result of that
        // Print that

        largestNumberUtilities.multiplyNumberBy3(largest);

        largestNumberUtilities.isLargestPrime(largest);

        smallestNumberUtilities.numberPlusAge(smallest);
        

        scanner.close();
    }

    // Create a method to get the largest number
        // LargestNumberUtilities
}
