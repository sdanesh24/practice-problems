import java.util.ArrayList;
import java.util.List;

public class LargestNumberUtilities
{
    // Edit this method to 'capture' the result
    public int getLargestNumber(int[] inputs) {
       int largest = Math.max(inputs[0], Math.max(inputs[1], inputs[2]));
       System.out.println("The largest number is: " + largest);
       return largest;

        // first iteration implemented without using the Math.max() method
//        if(inputs[0] > inputs[1] && inputs[0] > inputs[2])
//        {
//            System.out.println("The largest number is: " + inputs[0]);
//        }
//        if (inputs[1] > inputs[0] && inputs[1] > inputs[2])
//        {
//            System.out.println("The largest number is :" + inputs[1]);
//        }
//        if (inputs[2] > inputs[0] && inputs[2] > inputs[1])
//        {
//            System.out.println("The largest number is: " + inputs[2]);
//        }
    }

    // so we first passed in the user inputs, did something to it (pulled out the largest number), saved that as a new variable which is the new parameter we are using here?
    public void multiplyNumberBy3(int largest) {
        int largestTripled = largest * 3;
        System.out.println("The largest number tripled is: " + largestTripled);
    }

    public void divideNumberBy3(int largest){
        int largestThird = largest / 3;
        System.out.println(largestThird);

    }

    public void isLargestPrime(int largest) {
        List<Integer> division_Results = new ArrayList<>();

        for(int i = 1; i <= largest; i++)
        {
            int result = (largest % i);

            if(result == 0)
            {
                division_Results.add(i);
            }
        }

        if(division_Results.size() == 2)
        {
            System.out.println(largest + " is a prime number!");
        }
        else
        {
            System.out.println(largest + " is not a prime number");
        }
    }

}
