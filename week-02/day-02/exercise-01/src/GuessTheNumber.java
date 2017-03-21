import java.util.Scanner;
import java.util.Random;

/**
 * Created by zandraa on 3/21/2017.
 */
public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    boolean isGuessed = false;

    Random random = new Random();
    int numberToGuess = random.nextInt(50) + 1;

    while (isGuessed == false) {
      System.out.println("Guess a number between 1 and 50: ");
      int n = myScanner.nextInt();

      if (n > numberToGuess) {
        System.out.println("The stored number is lower");
      }
      else if (n < numberToGuess ) {
        System.out.println("The stored number is higher");
      }
      else {
        System.out.println("You found the number: " + numberToGuess);
        isGuessed = true;
      }
    }
  }
}
