import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class Sum {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Give me a number to sum until: ");
    int numGiven = myScanner.nextInt();

    System.out.println("The sum is: " + sum(numGiven));
  }

  private static int sum(int sumTill) {
    int sum = 0;

    for (int i = 0; i < sumTill + 1; i++) {
      sum += i;
    }

    return sum;
  }
}

// - Write a function called `sum` that sum all the numbers
//   until the given parameter