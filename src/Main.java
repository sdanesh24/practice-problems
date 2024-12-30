import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // need to store each of the three inputs as a list??
        int [] inputs = new int [3];
        for(int i = 0; i <3; i++) {
            System.out.println("Enter a number: ");
            inputs[i] = scanner.nextInt();
        }
        if(inputs[0] > inputs [1] && inputs[0] > inputs[2]) {
            System.out.println("The largest number is: " + inputs[0]);
        } if(inputs[1] > inputs[0] && inputs[1] > inputs[2]) {
            System.out.println("The largest number is :" + inputs[1]);
        } if(inputs[2] > inputs[0] && inputs[2] > inputs[1]) {
            System.out.println("The largest number is: " + inputs[2]);
        } else {
            return;
        }
        scanner.close();
    }
}