/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jenna Bates
 */

package main;

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
        //insert selection menu here

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
                int loopy = 0;
                while(loopy == 0)
                {
                    System.out.println("Would you like your area in\n 1.Meters\n 2.Feet");
                    int unitChoice = getUserInt(" your selection");
                    while(unitChoice == 1 || unitChoice == 2)
                    {
                        switch (unitChoice)
                        {
                            //meters
                            case 1:
                                double lengthM = getUserDouble(" the length in meters");
                                double widthM = getUserDouble(" the width in meters");
                                System.out.println("You entered dimensions of " + lengthM + " m by " + widthM + " m");
                                double areaM = method.calcArea(lengthM, widthM);
                                System.out.println("The area is " + areaM + " square meters.");
                                break;

                            //feet
                            case 2:
                                double lengthFt = getUserDouble(" the length in feet");
                                double widthFt = getUserDouble(" the width in feet");
                                System.out.println("You entered dimensions of " + lengthFt + " ft by " + widthFt + " ft.");
                                double areaFt = method.calcArea(lengthFt, widthFt);
                                System.out.println("The area is " + areaFt + " square feet.");
                                break;
                        }
                    }


                    System.out.println("Would you like to do a conversion? Press 1 for yes and 2 for no.");
                    switch(unitChoice)
                    {
                        //yes to conversion
                        case 1:
                            //meters to feet
                            if(unitChoice == 1)
                            {

                            }
                            //feet to meters
                            else if(unitChoice == 2)
                            {

                            }
                            //somehow neither feet nor meters
                            else
                            {
                                System.out.println("Error Code 1");
                                loopy = 1;
                                break;
                            }
                            break;

                        //no to conversion
                        case 2:
                            break;
                        default:
                            System.out.println("Sorry that's an invalid option. Exiting...");
                            loopy = 1;
                    }

                }










                double areaM = method.calcArea(lengthM, widthM);
                System.out.println("The area in meters is " + areaM + " square meters.");









        }


    }

}
