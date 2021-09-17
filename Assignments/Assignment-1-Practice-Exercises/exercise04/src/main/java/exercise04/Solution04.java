/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Bates
 */

/*
 * Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.
 *
  Example Output:
    Enter a noun: dog
    Enter a verb: walk
    Enter an adjective: blue
    Enter an adverb: quickly
    Do you walk your blue dog quickly? That's hilarious!

 */

/*
    Pseudocode:
        - Prompt the user for a noun
        - Store the noun in a String
        - Prompt the user for a verb
        - Store the verb in a String
        - Prompt the user for an adjective
        - Store the adjective in a String
        - Prompt the user for an adverb
        - Store the adverb in a String
        - output: the + adjective + noun + verb + adverb + in the park
 */

package exercise04;

import java.util.Scanner;

public class Solution04
{
    public static void main( String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a noun:");
        String noun = kb.nextLine();
        System.out.println("Enter a verb:");
        String verb = kb.nextLine();
        System.out.println("Enter an adjective:");
        String adjective = kb.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = kb.nextLine();

        System.out.println("The " + adjective + " " + noun + " " + verb + " " + adverb + " in the park");
    }
}
