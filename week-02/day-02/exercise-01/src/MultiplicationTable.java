import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class MultiplicationTable{
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Give me a number: ");
    int n = myScanner.nextInt();

    for (int i = 1; i < 11; i++) {
      System.out.println(1 + " * " + n + " = " + (n * i));
    }
  }
}
