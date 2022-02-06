/* Jenna Bates
 * Dr. Steinberg
 * COP3330 Spring 2022
 * Programming Assignment 1
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    private int userWins = 0;
    private int computerWins = 0;
    private int game;
    private Scanner input;
    private Random rand;
    private static final String GREETING = "Welcome to the Rock...Paper...Scissor Game! Let me tell you the rules to this game. You and I will get to \n" + "choose rock, paper, or scissor. After we made a decision, we will then reveal the choices we both made and \n" + "decide a winner based on these rules. Rock beats Scissor! Paper beats Rock! Scissor beats Paper! If we both \n" + "pick the same option, then it is a tie. Ready to play? Here we go! I've been told by users that I'm really good!";

    public RockPaperScissor() {
        game = 1;
        rand = new Random();
        input = new Scanner(System.in);
        this.rand = new Random();
    }

    public RockPaperScissor(int game, int seed, Scanner input) {
        this.game = game;
        this.input = input;
        this.rand = new Random(seed);
    }

    public static void greeting() {
        System.out.println(GREETING);
    }

    public void playRound() {
        System.out.println("Game " + game + " Tally\n Player 1:     " + userWins + "\n Player 2:     " + computerWins);
        switch (choiceBattle(userChoice(), computerChoice())) {
            case 0:
                break;
            case 1:
                userWins++;
                break;
            case 2:
                computerWins++;
                break;
            //ask about if throwing an exception in the default case makes sense
        }
        game++;
    }

    // Returns: tie = 0, user/p1 win = 1,computer/p2 win = 2
    public int choiceBattle(int p1, int p2) {
        //rock = 1, paper = 2, scissors = 3
        int result = -1;
        if (p1 == p2) {
            result = 0;
            System.out.println("It's a tie!");
        } else {
            System.out.println("You used " + choiceToString(p1) + " and I used " + choiceToString(p2) + "!");
            //p1 wins
            if ((p1 == 3 && p2 == 1) || (p1 == 1 && p2 == 3) || (p1 == 3 && p2 == 2)) {
                System.out.println(choiceToString(p1) + " beats " + choiceToString(p2) + "\n Player 1 gets a point.");
                result = 1;
            }
            //p1 loses
            else {
                System.out.println(choiceToString(p2) + " beats " + choiceToString(p1) + "\n Player 2 gets a point.");
                result = 2;
            }
        }
        return result;
    }

    public String choiceToString(int choice) {
        String choiceAsString;
        switch (choice) {
            case 1:
                choiceAsString = "rock";
                break;
            case 2:
                choiceAsString = "paper";
                break;
            case 3:
                choiceAsString = "scissor";
                break;
            default:
                choiceAsString = "ERROR";
        }
        return choiceAsString;

    }

    public int userChoice() {
        int choice = -1;
        while (true) {
            System.out.println("It is your turn to choose.\n1: Rock\n2: Paper\n3: Scissors\nEnter your choice: ");
            choice = input.nextInt();
            if (choice >= 1 && choice <= 3) {
                System.out.println("You have selected " + choiceToString(choice) + ".");
                return choice;
            }
            System.out.println("That is an invalid choice. Please try again");
        }
    }

    public int computerChoice() {
        int choice = -1;
        choice = rand.nextInt(3) + 1;
        return choice;
    }

    public int getWinner() {
        // user wins = 1, computer wins = 2
        if (userWins > computerWins) return 1;
        else if (computerWins > userWins) return 2;
        else return -1;
    }
}