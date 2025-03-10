import java.util.LinkedHashMap;

public class JokesHash {
    public static LinkedHashMap<String, String> jokes = new LinkedHashMap<String, String>();

    public JokesHash()
    {
        populateJokes();
    }

    private void populateJokes()
    {
        // TODO: make this into a for loop of inputs
        jokes.put("Why don’t skeletons fight each other?", "Because they don’t have the guts!");
        jokes.put("Why did the scarecrow win an award?", "Because he was outstanding in his field!");
        jokes.put("What did one plate say to the other plate?", "Dinner’s on me!");
        jokes.put("Why do cows have hooves instead of feet?","Because they lactose!");
        jokes.put("What do you call a factory that makes good products?", "A satisfactory!");
        jokes.put("Why did the tomato turn red?","Because it saw the salad dressing!");
        jokes.put("How do you organize a space party?", "You planet!");
        jokes.put("What did the janitor say when he jumped out of the closet?", "Supplies!");
        jokes.put("Why couldn’t the bicycle stand up by itself?", "It was two-tired!");
        jokes.put("Why don’t eggs tell jokes?", "Because they might crack up!");
        jokes.put("Why did the golfer bring an extra pair of pants?", "In case he got a hole in one!");
        jokes.put("What do you call a bear with no teeth?", "A gummy bear!");
        jokes.put("Why did the math book look sad?", "Because it had too many problems!");
        jokes.put("Why did the cookie go to the doctor?", "Because it felt crumby!");
        jokes.put("What do you call an alligator in a vest?", "An investigator!");
        jokes.put("Why did the coffee file a police report?", "It got mugged!");
        jokes.put("What did the buffalo say to his son when he left for college?", "Bison!");
        jokes.put("Why did the banana go to the doctor?", "Because it wasn’t peeling well!");
        jokes.put("Why don’t oysters donate to charity?", "Because they’re shellfish!");
        jokes.put("Why did the football team go to the bank?", "To get their quarterback!");

        // Checking that I included 20 jokes in the hashmap
        // System.out.println(jokes.size());
    }

    // creating a getter method so the LinkedHashMap can be accessible in the main method to pull jokes from
    public LinkedHashMap <String, String> getJokes()
    {
        return jokes;
    }
}
