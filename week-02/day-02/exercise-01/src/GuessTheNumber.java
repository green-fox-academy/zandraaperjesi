import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    boolean isGuessed = false;
    int numberToGuess = 8;

    while (isGuessed == false) {
      System.out.println("Guess a number: ");
      int n = myScanner.nextInt();

      if (n > numberToGuess) {
        System.out.println("The stored number is lower");
      }
      else if (n < numberToGuess ) {
        System.out.println("The stored number is higher");
      }
      else {
        System.out.println("You found the number: 8");
        isGuessed = true;
      }
    }
  }
}
