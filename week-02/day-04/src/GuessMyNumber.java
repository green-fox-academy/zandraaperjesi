import java.util.Random;
import java.util.Scanner;

/**
 * Created by zandraa on 3/23/2017.
 */
public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    Random rand = new Random();
    int  numToGuess = rand.nextInt(100) + 1;

    System.out.println("I've the number between 1-100. You have 5 lives.");

    for (int i = 0; i < 5; i++) {
      System.out.println("Your guess: ");
    }
  }
}
