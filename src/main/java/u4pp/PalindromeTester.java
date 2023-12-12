package u4pp;
/**
* This is, in fact, a palindrome tester. A palindrome is the same forwards and backwards. Think racecar and racecar.
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * @author Ian
     */
    public static void execute(Scanner sc) {
        //This guy creates a scanner that lets the user input a phrase/string that gets tested to be a palindrome.
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
     * @author Ian
     * @param whatever phrase you want to be tested you tomato!!!!
     */
    public static boolean isPalindrome(String phrase) {
        /* This is the actual palindrome function. It flips the word backwards and gets rid of numbers, as well as lowercasing everything. */
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

}