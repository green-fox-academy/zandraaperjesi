import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class ParametricAverage {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int sum = 0;
    double times = 5;

    for (int i = 0; i < times; i ++) {
      System.out.println("Enter a number: ");
      int n = myScanner.nextInt();
      sum += n;
    }

    double average = sum / times;

    System.out.println("Sum: " + sum + ", Average: " + average);
  }
}
