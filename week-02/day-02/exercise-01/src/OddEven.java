import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class OddEven {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int n = myScanner.nextInt();
    if(n % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
  }
}
