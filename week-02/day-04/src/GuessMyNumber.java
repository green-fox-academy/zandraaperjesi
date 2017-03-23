import java.util.Random;
import java.util.Scanner;

/**
 * Created by zandraa on 3/23/2017.
 */
public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("I will think of a random number and you will guess.");
    System.out.println("What is the highest number I can think of?");
    while (!myScanner.hasNextInt()) {
        myScanner.next();
        System.out.println("Please give me a number!");
    }
    int numberCap = myScanner.nextInt();
    System.out.println("I've the number between 1-" + numberCap + ". You have 5 lives.");
    int  numToGuess = rand.nextInt(numberCap) + 1;
    System.out.println(numToGuess);
    for (int i = 4; i >= 0; i--) {
      System.out.println("Your guess: ");
      while (!myScanner.hasNextInt()) {
        myScanner.next();
        System.out.println("You have to guess a number!");
      }

      int guess = myScanner.nextInt();
      if (guess == numToGuess) {
        System.out.println("Congratulations. You won! :)");
        break;
      }
      else if (i == 0) {
        System.out.println("The number was: " + numToGuess + " :( . Better luck next time!");
      }
      else if (guess < numToGuess) {
        System.out.println("Too low. You have " + i + " lives left.");
      }
      else if (guess > numToGuess) {
        System.out.println("Too high. You have " + i + " lives left.");
      }
    }
  }
}
