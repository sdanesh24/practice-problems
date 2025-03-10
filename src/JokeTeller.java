import java.util.*;

public class JokeTeller
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to hear a joke? Y/N");
        String input = scanner.next();

        // creating an instance of the JokesHash class to call the getJokes (getter) method on

        JokesHash jokesHash = new JokesHash();
        // is it better practice to keep the name of the hashmap as jokes instead of renaming it to mapJokes?
        LinkedHashMap <String, String> mapJokes = jokesHash.getJokes();
        List<String> listJokes = new ArrayList<>(mapJokes.keySet());
        Collections.shuffle(listJokes);

        if(input.equals("Y"))
        {
            int i = 0;
            // original conditional, simplified below: while (i <= listJokes.size() - 1)
            while (i < listJokes.size())
            {
                // get the joke question at the ith index of the list of jokes
                String question = listJokes.get(i);
                System.out.println("Q: " + question);
                System.out.println("A: " + mapJokes.get(question));

                System.out.println("Would you like to hear another joke? Y/N");
                String inputThree = scanner.next();

                if(inputThree.equals("N"))
                {
                    System.out.println("Okay, bye!");
                    break;
                }

                System.out.println("Would you like to add a joke to the program? Y/N");
                String inputFour = scanner.next();
                if(inputFour.equals("Y"))
                {
                    scanner.nextLine(); //why here?? what does this do?
                    System.out.println("Please enter your joke: ");
                    String userJoke = scanner.nextLine();

                    if(mapJokes.containsKey(userJoke))
                    {
                        System.out.println("That joke is already saved to the program!");
                    }
                    else
                    {

                        System.out.println("Please enter the punchline to your joke: ");
                        String userPunchline = scanner.nextLine();
                        mapJokes.put(userJoke, userPunchline);
                        listJokes.add(userJoke);
                        System.out.println("Your joke was successfully saved!");
                    }

//                    System.out.println("Would you like to hear another joke? Y/N");
//                    String inputFive = scanner.next();
//
//                    if(inputFive.equals("N"))
//                    {
//                        System.out.println("Okay, bye!");
//                        break;
//                    }
                }
//                else
//                {
//                    System.out.println("Okay, bye!");
//                }
                i++;
            }
        }
        else
        {
            System.out.println("That's lame. Bye!");
        }
        scanner.close();
    }
}
