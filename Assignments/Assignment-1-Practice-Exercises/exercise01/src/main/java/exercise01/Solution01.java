/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jenna Bates
 */

/*
 *   Exercise 1 - Saying Hello
 *
 *   Instructions: Create a program that prompts for your name and prints a greeting using your name
 *   Example Output: What is your name? Brian
 *                   Hello, Brian, nice to meet you!
 *   Constraint: Perform the input, string concatenation, and output in separate statements
 *   Challenges: Write a new version of the program without using any variables
 *               Write a version of the program that displays different greetings for different people
 *               Write a version of the program that displays the greetings in a GUI window
 *
 */

/*
 *  PseudoCode:
 *      Prompt user for name (output)
 *      Get name from user (input)
 *      Print greeting (output) and include name
 *
 */
package exercise01;

import java.util.Scanner;

public class Solution01
{
    public static void main(String[] args)
    {
        private static final Scanner kb = new Scanner(System.in);
        //is it better to declare all variables up here or should I be declaring my variables as I use them like I did below?

        System.out.println("Hello! What is your name?");
        String name = kb.nextLine();
        System.out.println("Nice to meet you, " + name);

    }

}
