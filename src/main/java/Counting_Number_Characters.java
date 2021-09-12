/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */

import java.util.Scanner;
public class Counting_Number_Characters {
    public static void main(String[] args) {
        Scanner String_Input= new Scanner(System.in);

        System.out.print("What is the input string? ");
        String String_Value = String_Input.nextLine();

        int count = 0;
        for(int i = 0; i < String_Value.length(); i++){
            if (String_Value.charAt(i) != ' ')
            count++;
        }

        System.out.println("" + String_Value + " has " +count+ " characters.");
    }
}
