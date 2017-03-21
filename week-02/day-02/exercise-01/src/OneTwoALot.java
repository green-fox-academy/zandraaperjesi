import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class OneTwoALot {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");

    int n = myScanner.nextInt();

    if (n <= 0) {
      System.out.println("Not enough");
    }
    else if (n == 1) {
      System.out.println("One");
    }
    else if (n == 2) {
      System.out.println("Two");
    }
    else {
      System.out.println("A lot");
    }
  }
}
