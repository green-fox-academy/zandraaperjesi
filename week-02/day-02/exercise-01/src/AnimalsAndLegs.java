import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have\
    Scanner myScanner = new Scanner(System.in);
    System.out.println("chickens: ");
    int chickens = myScanner.nextInt();
    System.out.println("pigs: ");
    int pigs = myScanner.nextInt();

    System.out.println((chickens * 2 + pigs * 4) + " legs altogether.");
  }
}
