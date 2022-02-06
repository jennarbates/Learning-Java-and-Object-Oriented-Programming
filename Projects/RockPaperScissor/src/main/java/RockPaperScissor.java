import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    private int userWins;
    private int computerWins;
    private int game;
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
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
    }
    public RockPaperScissor(int userWins, int computerWins){
        super();
        this.userWins = userWins;
        this.computerWins = computerWins;
        this.game = 0;
    }
    public RockPaperScissor(int userWins, int computerWins, int game){
        super();
        this.userWins = userWins;
        this.computerWins = computerWins;
        this.game = game;
    }

    //methods

    public static void greeting(){
        System.out.println(GREETING);
    }

    public void playRound(){
        int computerWins = 0;
        int userWins = 0;
        System.out.println("Welcome to game " + game + "!");
        while(round<3){
            //switch( choiceBattle(userChoice(),computerChoice()) ){
            //case 0: tie;
                //break;
            //case 1: user;
                //break;
           //case 2: pc;
                //break;
            //ask about if throwing an exception in the default case makes sense
           // }
            round++;
        }
    }

}
