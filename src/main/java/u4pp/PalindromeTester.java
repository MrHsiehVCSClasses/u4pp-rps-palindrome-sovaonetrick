package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     */
    public static void execute(Scanner sc) {
        /* YOUR CODE HERE */
        Scanner pickles = new Scanner(System.in);
        Boolean keepTesting = true;

        while (keepTesting == true) {

        System.out.println("Welcome to Palindrome Tester");
        System.out.println("Enter a phrase: ");
        String piccatini = pickles.nextLine();

        Boolean apple = isPalindrome(piccatini);
        
        if (apple == true) {
            System.out.println(piccatini + " is a palindrome");
        }
        else {
            if (apple == false) {
                System.out.println(piccatini + " is not a palindrome");
        }
        
        String avocado = "p";
        String yes = "y";
        String no = "n";

        while (true) {

        System.out.println("Keep testing? (Y)es or (N)o: ");
        avocado = pickles.nextLine();
        avocado = avocado.toLowerCase();
        
        if (avocado.equals(yes)) {
            break;
        }
        else {
            if (avocado.equals(no)) {
                keepTesting = false;
            }
            else {
                System.out.println("Invalid input, please try again");
            }
        }

        }
    }
        pickles.close(); }
    }

    /**
     * YOUR JAVADOC HERE
     */
    public static boolean isPalindrome(String phrase) {
        /* YOUR CODE HERE */
        String reversed = "";
        String letter;
        String numbas = "\\d";
        String punctus = "[\\p{Punct}]";

        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(numbas, "");
        phrase = phrase.replace(" ", "");
        phrase = phrase.replaceAll(punctus, "");

        for (int i = 0; i < phrase.length(); i++) {
            letter = phrase.substring(i, i + 1);
            reversed = letter + reversed;
        }

        if (reversed.equals(phrase)) {
            return true;
        }
        else {
            return false;
        }
    }

    /* Any helper methods you might need */
}