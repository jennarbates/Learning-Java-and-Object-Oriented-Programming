/*
Exercise 6 - Retirement Calculator
Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
Challenge
Handle situations where the program returns a negative number by stating that the user can already retire.
*/


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jenna Bates
 */


import java.time.LocalDate;
import java.util.Scanner;


/*
Pseudocode/Planning:
prompt(input) for age to be stored in an int (output)
convert input to int
prompt(input) for retirement age to be stored in an int (output)
convert input to int
calculate difference (retirementAge - age)
print difference (output)


methods:
prompt building method
user input request method
delta calculator method


 */
public class Solution06
{

    private static final Scanner kb = new Scanner(System.in);
    private static LocalDate currentDate = LocalDate.now(); // would this not be final because you might want to update it later since it is time?


    public static int calcDiff(int x, int y)
    {
        return (x - y);
    }

    public static String makeInputRequestString(String request)
    {
        return "Please input " + request;
    }

    private static int getUserInt(String request)
    {
        System.out.println(makeInputRequestString(request));
        return kb.nextInt();
    }



    public static void main(String[] args)
    {
        int age = getUserInt(" your age");
        int retireAge = getUserInt(" the age you would like to retire");

        final int year = currentDate.getYear();

        int ageDiff = calcDiff(retireAge, age);
        if(ageDiff <= 0)
        {
            System.out.println("You have can already retire right now in " + year + "!");
        }
        else
        {
            System.out.println("You have " + ageDiff + " years left until you retire");
            System.out.println("It's " + year + " so you can retire in " + (year + ageDiff) + ".");
        }


    }
}