import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    private int userWins;
    private int computerWins;
    private int game;
    private Random rand;
    private int seed;
    private Scanner input;
    private boolean playing = true;
    private int roundNum = 0;
    public static final String GREETING = "Welcome to the Rock...Paper...Scissor Game! Let me tell you the rules to this game. You and I will get to \n" +
            "choose rock, paper, or scissor. After we made a decision, we will then reveal the choices we both made and \n" +
            "decide a winner based on these rules. Rock beats Scissor! Paper beats Rock! Scissor beats Paper! If we both \n" +
            "pick the same option, then it is a tie. Ready to play? Here we go! I've been told by users that I'm really good!";


    public RockPaperScissor(){
        super();
        //ask about using this() in default constructor & as a method
        userWins = 0;
        computerWins = 0;
        game = 1;
        rand = new Random();
        input = new Scanner(System.in);
    }

    public RockPaperScissor(int game, int seed, Scanner input){
        super();
        userWins = 0;
        computerWins = 0;
        game = 1;
        seed = 1;
        this.game = game;
        this.seed = seed;
        this.input = input;
        this.rand = new Random(seed);
    }

    public static void greeting(){
        System.out.println(GREETING);
    }

    public void playRound(){
        int computerWins = 0;
        int userWins = 0;
        System.out.println("Welcome to game " + game + "!");
        while(userWins < 3 && computerWins < 3){
            switch( choiceBattle( userChoice(),computerChoice()) ){
            case 0: System.out.println("It was a tie!");
                break;
            case 1: userWins++;
                System.out.println("You won!");
                break;
           case 2: computerWins++;
                System.out.println("You Lost!");
                break;
            //ask about if throwing an exception in the default case makes sense
            }

        }

    }

    // Returns: tie = 0, user/p1 win = 1,computer/p2 win = 2
    public int choiceBattle(int p1, int p2){
        //rock = 1, paper = 2, scissors = 3
        int result = -1;
        System.out.println("You used " + readChoice(p1) + " and I used " + "!");
        if(p1 == p2){
            result = 0;
            System.out.println("It's a tie!");
            }
        else{
                    //p1 wins
                    if( (p1 == 3 && p2 == 1) || (p1 == 1 && p2 == 3) || (p1 == 3 && p2 == 2)) {
                        System.out.println(readChoice(p1) + " beats " + readChoice(p2));
                        result = 1;
                    }
                    //p1 loses
                    else {
                        System.out.println(readChoice(p2) + " beats " + readChoice(p1));
                        result = 2;
                    }
            }
        return result;
        }

    public String readChoice(int choice){
        String choiceAsString;
        switch (choice){
            case 1: choiceAsString = "rock";
                break;
            case 2: choiceAsString = "paper";
                break;
            case 3: choiceAsString = "scissors";
                break;
            default:
                choiceAsString = "ERROR";
        }
        return choiceAsString;

    }

    public int userChoice(){
        int choice = -1;
        while(true) {
            System.out.println("Please make a choice:\n    1: Rock\n    2:Paper\n    3:Scissors");
            choice = input.nextInt();
            if (choice == 1 || choice == 2 || choice == 3) {
                return choice;
            }
            System.out.println("That is an invalid choice. Please try again");
        }
    }

    public int computerChoice(){
        int choice = -1;
        choice = rand.nextInt(3) + 1;
        return choice;
    }

    public int getWinner(){
        // user wins = 1, computer wins = 2
        if(userWins > computerWins)
            return 1;
        else if(computerWins > userWins)
            return 2;
        else
            return -1;
    }
        }






