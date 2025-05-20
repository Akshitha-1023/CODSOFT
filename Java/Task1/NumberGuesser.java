import java.util.Scanner;
import java.util.Random;

public class NumberGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    boolean playAgain = true;
    int totalRounds = 0;
    int roundsWon = 0;

    System.out.println("Welcome to the Number Guessing Game!");
  }
}

while (playAgain) {
  int targetNumber = (int) (Math.random()*100) + 1;
  int guess = 0;
  int attempts = 0;
  int maxAttempts = 10;
  boolean hasGuessed = false;

  System.out.println("\nI've picked a number between 1 and 100. Can you guess it?");
  System.out.println("You have " + maxAttempts + "attempts.");
}
    
