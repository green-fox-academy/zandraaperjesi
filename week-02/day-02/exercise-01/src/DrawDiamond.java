import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class DrawDiamond {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int n = 0;

    do {
      System.out.println("Give me an odd number: ");
      n = myScanner.nextInt();
    }  while((n % 2) != 1);

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

    for (int i = n - 2; i > 0; i -= 2) {
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

