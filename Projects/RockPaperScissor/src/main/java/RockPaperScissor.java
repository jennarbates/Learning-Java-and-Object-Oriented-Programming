/* Jenna Bates
 * Dr. Steinberg
 * COP3330 Spring 2022
 * Programming Assignment 1
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

public class RockPaperScissor {
    private int userWins = 0;
    private int computerWins = 0;
    private int game;
    private Scanner input;
    private Random rand;
    private final static String GREETING = "Welcome to the Rock...Paper...Scissor Game!\nLet me tell you the rules to this game.\nYou and I will get to choose rock, paper, or scissor.\nAfter we made a decision, we will then reveal the choices we both made and decide a winner based on these rules.\nRock beats Scissor!\nPaper beats Rock!\nScissor beats Paper!\nIf we both pick the same option, then it is a tie.\nReady to play? Here we go! I've been told by users that I'm really good!";

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
        this.computerWins = 0;
        this.userWins = 0;
        while (this.computerWins < 3 && this.userWins < 3) {
            System.out.println("Game " + game + " Tally\nPlayer 1:     " + userWins + "\nPlayer 2:     " + computerWins);
            switch (choiceBattle(userChoice(), computerChoice())) {
                case 0: System.out.println("A Tie Occur.");
                    break;
                case 1:
                    this.userWins++;
                    break;
                case 2:
                    this.computerWins++;
                    break;
                //ask about if throwing an exception in the default case makes sense
            }
        }
        game++;
    }

    // Returns: tie = 0, user/p1 win = 1,computer/p2 win = 2
    public int choiceBattle(int p1, int p2) {
        //rock = 1, paper = 2, scissors = 3
        int result = -1;
        if (p1 == p2) {
            result = 0;
            System.out.println("Tie!");
        } else {
            System.out.println("You used " + choiceToString(p1) + " and I used " + choiceToString(p2) + "!");
            //p1 wins
            if ((p1 == 2 && p2 == 1) || (p1 == 1 && p2 == 3) || (p1 == 3 && p2 == 2)) {
                System.out.println(choiceToString(p1) + " beats " + choiceToString(p2) + "!\nPlayer 1 gets a point.");
                result = 1;
            }
            //p1 loses
            else {
                System.out.println(choiceToString(p2) + " beats " + choiceToString(p1) + "!\nPlayer 2 gets a point.");
                result = 2;
            }
        }
        return result;
    }

    public String choiceToString(int choice) {
        String choiceAsString;
        switch (choice) {
            case 1:
                choiceAsString = "Rock";
                break;
            case 2:
                choiceAsString = "Paper";
                break;
            case 3:
                choiceAsString = "Scissor";
                break;
            default:
                choiceAsString = "ERROR";
        }
        return choiceAsString;

    }

    public int userChoice() {
        int choice = -1;
        System.out.println("It is your turn to choose.");
        while (true) {
            System.out.print("1: Rock\n2: Paper\n3: Scissor\nEnter your choice: ");
            choice = input.nextInt();
            if (choice >= 1 && choice <= 3) {
                System.out.println("You have selected " + choiceToString(choice).toLowerCase() + ".");
                return choice;
            }
            System.out.println("That is an invalid choice. Please try again.");
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