/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name;

        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        name = input.next();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
