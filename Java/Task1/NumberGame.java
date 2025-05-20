import java.util.Scanner;
import java.util.Random;

public class NumberGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    boolean playAgain = true;
    int totalRounds = 0;
    int roundsWon = 0;

    System.out.println("Welcome to the Number Guessing Game!");
    
    while (playAgain) {
      int targetNumber = (int) (Math.random()*100) + 1;
      int guess = 0;
      int attempts = 0;
      int maxAttempts = 10;
      boolean hasGuessed = false;
    
      System.out.println("\nI've picked a number between 1 and 100. Can you guess it?");
      System.out.println("You have " + maxAttempts +  "attempts.");
      while (attempts < maxAttempts) {
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        attempts++;
      
        if (guess == targetNumber){
          System.out.println("Correct! You have guessed it in" + attempts +  "attempts.");
          hasGuessed = true;
          roundsWon++;
          break;
        }else if (guess > targetNumber) {
          System.out.println(" Too high!");
        }else {
          System.out.println("Too low!");
        }
      }
      
      if (!hasGuessed) {
        System.out.println("Out of attempts! The correct number was: " + targetNumber);
      }
      totalRounds++;
      System.out.print("Do you want to play again? (yes/no): ");
      String response = scanner.next();
      
      if (!response.equalsIgnoreCase("yes")) {
        playAgain = false;
      }
    }
    
   System.out.println("\n Game Over.");
   System.out.println("Rounds played: " + totalRounds);
   System.out.println("Rounds won: " + roundsWon);
   scanner.close();
  }
}


 

    
  

    
  


    
