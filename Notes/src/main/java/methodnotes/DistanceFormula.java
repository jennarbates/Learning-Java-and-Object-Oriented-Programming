package methodnotes;

import java.util.Scanner;

public class DistanceFormula
{
    private static final Scanner kb = new Scanner(System.in);
    //We only use one instance of Scanner -> static
    //final -> value isn't going to change


    public static double calcDelta(int x, int y)
    {
        return Math.abs(x - y);
        //look into what data type Math.abs returns
    }

    public static double calcDistance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(calcDelta(x1,y1) + Math.sqrt(calcDelta(x2,y2)));
    }

    public static String makeInputRequest(String request)
    {
        return "Please input " + request;
        //this makes unit testing easier since you can't do unit testing on anything that uses scanner since scanner is private
    }

    private static int getUserInput(String request)
    {


        System.out.println(makeInputRequest(request));
        //switch statement to determine type from type parameter and request input of that type
    }

    private static int[] coordReader()
    {
        int[] coord = new int[2];
        coord[0] = getUserInput("the x value");
        coord[1] = getUserInput("the y value");
        return coord;

    }


    public static int[] main(String[] args)
    {


    }
}
