package u4pp;

/**
* @author is going insane and cannot look at this screen anymore. Code lets you play rock paper scissors but is inconvenient and you should google a rock paper scissors game instead
*/
import java.util.Scanner;

public class RockPaperScissors {

    /* any code you need here for part b */

    /**
     * picks a random number from 0 to 1 with about equal 1/3 chances for r, p, s
     */
    public static String genChoice() {
        double gen;
        String rocka = "r";
        String papa = "p";
        String sza = "s";

        gen = Math.random();
        if (gen >= 0.67) {
            return rocka;
        }
        else {
            if (gen <= 0.33) {
                return papa;
            }
            else {
                return sza;
            }
        }
    }
    public static void play(Scanner sc) {
        /* PART B: YOUR CODE HERE */
        int wins = 0;
        int ties = 0;
        int losses = 0;
        Boolean keepPlaying = true;

        Scanner playCheck = new Scanner(System.in);

        sc = new Scanner(System.in);

        while (keepPlaying == true) {
        
        System.out.print("Please choose either R for Rock, P for Paper, S for Scissors, or A for any:");
        String player = sc.nextLine();

        if ("a" == player.toLowerCase()) {
            player = genChoice();
        }

        String computer = genChoice();

        int result = results(player, computer);

        if (result == 0) {
            ties++;
            System.out.println("It's a tie!");
        }
        else {
            if (result == 1) {
                wins++;
                System.out.println("You win!");
            }
            else {
                if (result == -1) {
                    losses++;
                    System.out.println("You lose.");
                }
            }
        }
        System.out.println("You have " + wins + " wins and " + losses + " losses and " + ties + " ties.");
        
        String decision = "p";
        Boolean scuffedCheck = true;

        while (scuffedCheck == true) {

        System.out.print("Would you like to play again? (Y)es or (N)o: ");
        decision = playCheck.nextLine();
        decision = decision.toLowerCase();

        String optionY = "y";
        String optionN = "n";

        if (decision.equals(optionY) == true) {
            keepPlaying = true;
            scuffedCheck = false;
        }
        else {
            if (decision.equals(optionN)) {
            keepPlaying = false;
            scuffedCheck = false;
            }
            else {
                System.out.println("Invalid Input, please try again");
            }
        }
        }
    }
    sc.close();
    playCheck.close();

    }
    

    
    
    

    /**
     * basic "who wins and who loses" code following irl rules
     */
    public static int results(String playerChoice, String computerChoice) {
        playerChoice = playerChoice.toLowerCase();
        computerChoice = computerChoice.toLowerCase();

        if (playerChoice.equals(computerChoice)) {
            return 0;
        }

        if (playerChoice.equals("r") && computerChoice.equals("s") || playerChoice.equals("s") && computerChoice.equals("p") || playerChoice.equals("p") && computerChoice.equals("r")) {
            return 1;
        }
        else {
            return -1;
        }
    }

    /* 
     * create helper methods for part b
     * I recommend at least making a helper method that returns a random option between "r", "p", and "s"
     */
}