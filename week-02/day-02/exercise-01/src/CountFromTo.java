import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class CountFromTo {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int a = myScanner.nextInt();
    System.out.println("Give me another number: ");
    int b = myScanner.nextInt();

    if (b <= a) {
      System.out.println("The second number should be bigger");
    }
    else {
      for (int i = a; i < b; i++) {
        System.out.println(i);
      }
    }
  }
}
