package main;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jenna Bates
 */






import java.time.LocalDate;
import java.util.Scanner;

public class Application
{
    private static final Scanner kb = new Scanner(System.in);
    private static LocalDate currentDate = LocalDate.now(); // would this not be final because you might want to update it later since it is time?
    private static final Methods method = new Methods();

    private static int getUserInt(String request)
    {
        System.out.println(method.makeInputRequestString(request));
        return kb.nextInt();
    }
    private static double getUserDouble(String request)
    {
        System.out.println(method.makeInputRequestString(request));
        return kb.nextDouble();
    }

    public static void main(String[] args)
    {
        //insert selection menu

        int userSelection = getUserInt(" your selection");
        switch(userSelection)
        {
            //exercise06
            case 1:
                int age = getUserInt(" your age");
                int retireAge = getUserInt(" the age you would like to retire");

                final int year = currentDate.getYear();

                int ageDiff = method.calcDiff(retireAge, age);
                if(ageDiff <= 0) //exercise06-challenge01
                {
                    System.out.println("You have can already retire right now in " + year + "!");
                }
                else
                {
                    System.out.println("You have " + ageDiff + " years left until you retire");
                    System.out.println("It's " + year + " so you can retire in " + (year + ageDiff) + ".");
                }
                break;

            //exercise07
            case 2:
                double lengthFt = getUserDouble(" the length in feet");
                double widthFt = getUserDouble(" the width in feet");




        }


    }

}
