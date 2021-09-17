/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jenna Bates
 */

/*
 * Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
 *
 * Example Output:
 *   What is the quote? These aren't the droids you're looking for.
 *   Who said it? Obi-Wan Kenobi
 *   Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 *
 * Constraints:
 *      Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
        If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.
        e.g. use println() instead of printf()
 */

/*
 * Pseudocode:
 *      - Prompt user for quote to be stored in a string (output then input)
 *      - Prompt user for author to be stored in a different string (output then input)
 *      - Print author + "says" + \" + quote + \"
 *
 */
package exercise03;

import java.util.Scanner;

public class Solution03
{

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello! What is the quote?");
        String quote = kb.nextLine();
        System.out.println("Who said that?");
        String author = kb.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
