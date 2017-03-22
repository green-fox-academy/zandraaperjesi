import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("Give me an int:");
      sum += myScanner.nextInt();
    }

    double average = ((double) sum) / 5;
    System.out.println("Sum: " + sum + ", Average: " + average);
  }
}
