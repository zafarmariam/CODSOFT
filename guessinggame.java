package CODSOFT;

import java.util.Scanner;

public class guessinggame {
    
    public static void main(String args[]) {
     int answer = (int)(Math.random() * 100) + 1;
    // number of trials that the user has to guess the number
    int i = 4;
            Scanner input = new Scanner(System.in);
    // TO check if the user has guessed the number
    boolean correct = false;
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have 4 tries to guess the number.");
    while (i > 0) {
        System.out.println("Enter your guess: ");
     int guess = input.nextInt();
      if (guess == answer) {
        System.out.println("You guessed the number!\nYou win!");
        break;
      }
      // if the user guesses greater than the number, print the message and reduce the number of
      // trials
      else if (guess > answer) {
        System.out.println("Your guess is too high.\nYou have " + (i - 1) + " tries left.");
        i--;
      }
      // if the user guesses less than the number, print the message and reduce the number of
      // trials
      else {
        System.out.println("Your guess is too low.\nYou have " + (i - 1) + " tries left.");
      }
      // after each trial decrease the number of trials by 1
      i--;
    }
    // if the user has run out of trials, print the message and exit the program

    if (correct == false) {
      System.out.println("You ran out of tries.\nYou lose!");
    input.close();
    }
  }
}
