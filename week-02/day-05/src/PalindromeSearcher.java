import java.util.Scanner;

/**
 * Created by zandraa on 3/24/2017.
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a line and I will show you the palindromes in it.");

    String inputString = myScanner.nextLine();

    for (int i = 2; i < inputString.length(); i++) {
      int slider = i;
      for (int j = 0; j < inputString.length() - i; j++) {
        if (inputString.charAt(slider) == inputString.charAt(j)) {
          System.out.println("found the same letters");
          System.out.println(inputString.charAt(slider) + " " + inputString.charAt(j));
          String s = inputString.substring(j, slider + 1);
          System.out.println(s);
        }
        slider += 1;
        //System.out.println(slider + " " + j + " " + i);
      }
      //System.out.println("looped");
    }

  }

  //private static boolean isPalindrome ();
}
