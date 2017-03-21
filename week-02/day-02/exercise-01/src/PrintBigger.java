import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class PrintBigger {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int a = myScanner.nextInt();
    System.out.println("Give me another number: ");
    int b = myScanner.nextInt();

    if (a > b) {
      System.out.println(a + " is bigger.");
    }
    else {
      System.out.println(b + " is bigger.");
    }
  }
}
