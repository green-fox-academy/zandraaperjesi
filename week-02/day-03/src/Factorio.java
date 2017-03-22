import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class Factorio {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a number to calculate factorial for: ");
    int givenNum = myScanner.nextInt();

    System.out.println(givenNum + "! = " + factorio(givenNum));
  }

  private static int factorio(int factorTill) {
    int factorial = 1;

    for (int i = 1; i < factorTill + 1; i++) {
     factorial *= i;
    }

    return factorial;
  }
}

// - Create a function called `factorio`
//   that returns it's input's factorial
