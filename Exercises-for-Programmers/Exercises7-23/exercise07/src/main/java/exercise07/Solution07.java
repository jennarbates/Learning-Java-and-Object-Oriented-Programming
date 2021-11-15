/*
 *  UCF COP3330 Fall 2021 Exercise 7 Solution
 *  Copyright 2021 Jenna Bates
 */


/*When working in a global environment,
you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure
the most accurate results.

Create a program that calculates the area of a room.
Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.
*/

/*

Plan:

Prompt user for length in feet
scan for length and store as double
Prompt user for width in feet
scan for width and store as double
Calculate area
print area with formatting for decimals in sq feet
convert dimensions to meters
calculate area
print area with formatting for decimals in sq meters


methods:
calculateArea(double length, double width)
convertFeetToMeters(double feet)
convertMetersToFeet(double meters)


 */

package exercise07;

import java.util.Scanner;

public class Solution07
{
    public static void main( String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello");

    }


}