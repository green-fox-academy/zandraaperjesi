import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me an int:");
    int first = myScanner.nextInt();
    System.out.println("Give me an int:");
    int second = myScanner.nextInt();
    System.out.println("Give me an int:");
    int third = myScanner.nextInt();
    System.out.println("Give me an int:");
    int fourth = myScanner.nextInt();
    System.out.println("Give me an int:");
    int fifth = myScanner.nextInt();

    int sum = first + second + third + fourth + fifth;
    double average = ((double) sum) / 5;
    System.out.println("Sum: " + sum + ", Average: " + average);
  }
}
