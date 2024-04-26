package com.example.guessmegame;
import java.util.Random;
import java.util.Scanner;
public class Main {

public static void main (String [] args) {
        System.out.println ("Welcome to the Ultimate Guessing Game!");
        System.out.println ("Please enter your first name to begin.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println ("Hello " + name);

        System.out.println ("Shall we begin?");
        System.out.println ("\t1. Yes");
        System.out.println ("\t2. No");

        int beginAnswer = scanner.nextInt();
        while (beginAnswer != 1 ) {
            System.out.println ("Shall we begin?");
            System.out.println ("\t1. Yes");
            System.out.println ("\t2. No");

            beginAnswer = scanner.nextInt();
        }


        Random random = new Random ();
        int x = random.nextInt(20) + 1;
        System.out.println ("Please guess a number between 1 and 21. You have 6 tries.");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
        timesTried++;

        if (timesTried < 5){
            if (userInput == x){
                hasWon = true;
                shouldFinish = true;
            }
            else if (userInput > x){
                System.out.println ("Guess lower fruit loops.");
                userInput = scanner.nextInt();
            } else{
                System.out.println ("Guess higher bubz.");
                userInput = scanner.nextInt();
            }
        } else {shouldFinish = true;}
        }
        if (hasWon) {
            System.out.println (" Congratulations! You have guessed in " + timesTried + " guesses");
        }
        else {System.out.println ("Game Over!");
        System.out.println ("The number was " + x);
        }

    }

}
