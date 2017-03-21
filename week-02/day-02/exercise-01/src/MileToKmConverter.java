import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    System.out.println("Kilometers:");
    Scanner myScanner = new Scanner(System.in);
    int kilometers = myScanner.nextInt();
    System.out.println(kilometers + "Kms is " + (kilometers * 0.621) + "miles.");
  }
}
