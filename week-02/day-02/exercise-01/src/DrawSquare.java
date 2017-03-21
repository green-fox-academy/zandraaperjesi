import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class DrawSquare {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int n = myScanner.nextInt();

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        for (int j = 0; j < n; j++) {
          System.out.print("%");
        }
      }
      else if (i == (n - 1)) {
        for (int k = 0; k < n; k++) {
          System.out.print("%");
        }
      }
      else {
        System.out.print("%");
        for (int l = 0; l < (n - 2); l++) {
          System.out.print(" ");
        }
        System.out.print("%");
      }
      System.out.println("");
    }
  }
}
