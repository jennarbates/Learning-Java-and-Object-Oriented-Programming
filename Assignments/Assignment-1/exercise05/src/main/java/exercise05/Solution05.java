/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jenna Bates
 */

/*
Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example output:
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints:
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the input and output statements separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */

/*
Pseudocode:

Prompt for first number (output)
Get first number as string
get second number as string
print firstNum + secondNum = firstNum+secondNum
print firstNum - secondNum = firstNum-secondNum
print firstNum * secondNum = firstNum*secondNum
print firstNum / secondNum = firstNum/secondNum


 */

//test
package exercise05;

import java.util.Scanner;

public class Solution05
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("What is the first number?");
        String firstNum = kb.nextLine();
        System.out.println("What is the second number?");
        String secondNum = kb.nextLine();
        int firstInt = Integer.parseInt(firstNum);
        int secondInt = Integer.parseInt(secondNum);
        //int addition = firstInt + secondInt;
        System.out.println(firstInt + " + " + secondInt + " = " + (firstInt + secondInt) + "\n"
                + firstInt + " - " + secondInt + " = " + (firstInt - secondInt) + "\n" +
                firstInt + " / " + secondInt + " = " + (firstInt / secondInt) + "\n" +
                firstInt + " * " + secondInt + " = " + (firstInt * secondInt) );
    }
}
