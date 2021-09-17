package methodnotes;
import java.text.DecimalFormat;
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
    private static final DecimalFormat df = new DecimalFormat("#.##");


    public static double calcDelta(double x, double y)
    {
        return Math.abs(x - y);
    }

    private static double formatDouble(double num)
    {

        return Double.parseDouble( df.format(num) );
    }

    public static double calcDistance(double x1, double y1, double x2, double y2)
    {
        return formatDouble( (Math.sqrt( Math.pow( calcDelta(x1,y1) ,2) + Math.pow( calcDelta(x2,y2),2) )) );
    }


    public static String makeInputRequestString(String request)
    {
        return "Please input " + request;
        //this makes unit testing easier since you can't do unit testing on anything that uses scanner since scanner is private
    }

    private static double getUserDouble(String request)
    {

        System.out.println(makeInputRequestString(request));
        return kb.nextDouble();
    }

    private static double[] coordReader()
    {
        double[] coord = new double[2];
        coord[0] = getUserDouble("the x value");
        coord[1] = getUserDouble("the y value");
        return coord;
    }

    public static void main(String[] args)
    {
        System.out.println("First Coordinate:");
        double[] coord1 = coordReader();
        System.out.println("First Coordinate:");
        double[] coord2 = coordReader();
        System.out.println("The distance between (" + coord1[0] + "," + coord1[1] + ") and (" + coord2[0] + "," + coord2[1] + ") is " + calcDistance(coord1[0],coord1[1],coord2[0],coord1[1]) + " units.");

    }
}
