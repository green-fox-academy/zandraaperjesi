import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class DrawTriangle {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int n = myScanner.nextInt();

    for (int i = 1; i < n + 1; i ++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
