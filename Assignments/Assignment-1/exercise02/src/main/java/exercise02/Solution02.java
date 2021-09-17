/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jenna Bates
 */

/*
 * Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.
 *
 * Example Output:
 *      What is the input string? Homer
 *      Homer has 5 characters.
 *
 * Constraints:
 *      - Make sure the output contains the original string
 *      - Use a single output statement to construct the output
 *      - Use a built-in function of the programming language to determine the length of the string
 */

/*
 *
 * Pseudocode:
 *      Prompt the user for a string (output)
 *      Get a string value from the user (input)
 *      use function to determine string length and assign to variable
 *      output the string and string length
 */

package exercise02;

import java.util.Scanner;

public class Solution02
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("What is the input string?");
        String s = kb.nextLine();
        int stringlength = s.length();
        System.out.println(s + " has " + stringlength + " characters.");
    }

}
