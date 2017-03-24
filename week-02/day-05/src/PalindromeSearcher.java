import java.util.Scanner;

/**
 * Created by zandraa on 3/24/2017.
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a line and I will show you the palindromes in it.");

    String inputString = myScanner.nextLine();

    char[] slicedUpInput = inputString.toCharArray();

    for (int i = 2; i < slicedUpInput.length; i++) {
      for (int j = 0; j < slicedUpInput.length - i; j++) {
        if (slicedUpInput[i] == slicedUpInput[j]) {
          System.out.println("found the same letters");
        }
      }
    }
  }
}
