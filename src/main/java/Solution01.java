/*
 *  UCF COP3330 Fall 2021 Assignment1 Solution for Pb1
 *  Copyright 2021: Praween Pongpat
 */

import java.util.Scanner;

public class Solution01 {
    /*
       print prompt "What is your name?"
       'name' = read string from user
       'name' = "hello, 'name', nice to meet you!", (concatenate 'name' to whole context)
       print output greeting user using string
     */

    public static void main(String[] args) {        //beginning of mein method

        System.out.print("What is your name? ");      //prompt user asking for name

        Scanner input = new Scanner(System.in);         //allocate input using Scanner class in API
        String name = input.nextLine();                 //get name from user as a string

        name = "Hello, " + name + ", nice to meet you!";   //concatenate 'name' to the greeting context

        System.out.println(name);   //print output using concatenated string
    }       //end main method
}
