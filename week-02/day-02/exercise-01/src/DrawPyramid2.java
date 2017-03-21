import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class DrawPyramid2 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int n = myScanner.nextInt();

    for (int i = 1; i < n + 1; i += 2) {
      for (int j = 0; j < ((n - i) /2) + 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < ((n - i) /2) + 1; j++) {
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
