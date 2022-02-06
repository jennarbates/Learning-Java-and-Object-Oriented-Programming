import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    private int userWins;
    private int computerWins;
    private int game;
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

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
}
