/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/

import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int gender;
        int ounces;
        int weight;
        int hours;

        /*Prompting for gender*/
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        gender = scan.nextInt();

        /*Prompting for ounces of alcohol*/
        System.out.println("How many ounces of alcohol did you have?");
        ounces = scan.nextInt();

        /*Prompting for weight in pounds*/
        System.out.println("What is your weight, in pounds?");
        weight = scan.nextInt();

        /*Prompting for hours since last drink*/
        System.out.println("How many hours has it been since your last drink?");
        hours = scan.nextInt();

        /*Calculating BAC level for men*/
        double bacMen = (((ounces * 5.14) / (weight * 0.73)) - 0.015 * hours);

        /*Calculating BAC level for women*/
        double bacWomen = (((ounces * 5.14) / (weight * 0.66)) - 0.015 * hours);

        /*Creating a nested statement based on the male gender and whether ot not it is legal to drive*/
        if (gender == 1) {
            System.out.println("Your BAC is " + bacMen);
            if (bacMen > 0.08)
                System.out.println("It is not legal for you to drive.");
            else
                System.out.println("It is legal for you to drive.");
        }

        /*Creating a nested statement based on the female gender and whether ot not it is legal to drive*/
        if (gender == 2) {
            System.out.println("Your BAC is " + bacWomen);
            if (bacWomen > 0.08)
                System.out.println("It is not legal for you to drive.");
            else
                System.out.println("It is legal for you to drive.");
        }
    }
}