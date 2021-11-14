package Challenge01;/*
 *  UCF COP3330 Fall 2021 Assignment 1 Challenge 1 Solution
 *  Copyright 2021 Jenna Bates
 */

/*
 *   Exercise 1 - Saying Hello
 *
 *   Instructions: Create a program that prompts for your name and prints a greeting using your name
 *   Example Output: What is your name? Brian
 *                   Hello, Brian, nice to meet you!
 *   Constraint: Perform the input, string concatenation, and output in separate statements
 *   Challenges: ** Write a new version of the program without using any variables **
 *               Write a version of the program that displays different greetings for different people
 *               Write a version of the program that displays the greetings in a GUI window
 *
 */

import java.util.Scanner;

/*
 *  PseudoCode:
 *      Prompt user for name (output)
 *      Print greeting (output) and use function (input) to grab name from user as 'variable' in output (output)
 *
 */
public class Challenge01
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        System.out.println("Nice to meet you, " + kb.nextLine());

    }

}
