import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class Sum {
  public static void main(String[] args) {

    System.out.println(sum(10));
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