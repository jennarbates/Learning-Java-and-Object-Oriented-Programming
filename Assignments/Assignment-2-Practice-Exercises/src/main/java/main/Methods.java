/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jenna Bates
 */

package main;


public class Methods
{
    private static final double FEET_TO_METERS_CONVERSION = 0.09290304;

    public int calcDiff(int x, int y)
    {
        return (x - y);
    }

    public String makeInputRequestString(String request)
    {
        return "Please input " + request;
    }

    public double calcArea(double[] dimensions)
    {
        return dimensions[0] * dimensions[1];
    }

    public double convertFtToMeters(double feet)
    {
        return feet * FEET_TO_METERS_CONVERSION;
    }

    public double[] getDimensions(double length, double width)
    {
        double[] dimensions = new double[2];
        dimensions[0] = length;
        dimensions[1] = width;
        return dimensions;
    }





}
