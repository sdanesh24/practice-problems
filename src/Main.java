import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String input = scanner.next();
            // creating the new empty variable to append each indexed character to
            StringBuilder reverse = new StringBuilder(input).reverse();
//            for(int i = input.length()-1; i >= 0; i--){
//                inverse = inverse.append(input.charAt(i));
//            }
            // how to debug and see what is being stored in the inverse variable at this stage?
            System.out.println("Reversed word: " + reverse);
            if(input.equals(reverse.toString())){
                System.out.println(input + " is a palindrome!");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        scanner.close();
        }
    }
