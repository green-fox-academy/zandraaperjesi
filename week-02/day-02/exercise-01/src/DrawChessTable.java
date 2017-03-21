import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class DrawChessTable {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int n = myScanner.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("%");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}
