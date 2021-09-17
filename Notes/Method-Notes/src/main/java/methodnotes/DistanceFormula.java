package methodnotes;

/*
Write a program that asks the user to enter two sets of x,y coords
and prints out the distance between those coords.
Write a program that asks the user to enter two 2d points
and prints out the distance between those 2d points.
 */


import java.util.Scanner;

public class DistanceFormula
{
    private static final Scanner kb = new Scanner(System.in);
    //We only use one instance of Scanner -> static
    //final -> value isn't going to change


    public static double calcDelta(int x, int y)
    {
        return Math.abs(x - y);
        //look into what data type Math.abs returns -> apparently it returns the same type of whatever you put in the parameter but how does it have a variable return type?
    }

    public static double calcDistance(int x1, int y1, int x2, int y2)
    {
        return Math.round(Math.sqrt( Math.pow( calcDelta(x1,y1) ,2) + Math.pow( calcDelta(x2,y2),2) ) );
    }

    public static String makeInputRequestString(String request)
    {
        return "Please input " + request;
        //this makes unit testing easier since you can't do unit testing on anything that uses scanner since scanner is private
    }

    private static int getUserInt(String request)
    {

        System.out.println(makeInputRequestString(request));
        return kb.nextInt();
    }

    private static int[] coordReader()
    {
        int[] coord = new int[2];
        coord[0] = getUserInt("the x value");
        coord[1] = getUserInt("the y value");
        return coord;
    }

    public static void main(String[] args)
    {
        System.out.println("First Coordinate:");
        int[] coord1 = coordReader();
        System.out.println("First Coordinate:");
        int[] coord2 = coordReader();
        System.out.println("The distance between (" + coord1[0] + "," + coord1[1] + ") and (" + coord2[0] + "," + coord2[1] + ") is " + calcDistance(coord1[0],coord1[1],coord2[0],coord1[1]) + " units.");

    }
}
