import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zandraa on 3/24/2017.
 */
public class Anagram {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a word: ");
    String wordOne = myScanner.nextLine();
    System.out.println("Give me another word: ");
    String wordTwo = myScanner.nextLine();
    System.out.println(isAnagram(wordOne, wordTwo));
  }

  private static boolean isAnagram (String firstString, String secondString) {
    char[] firstArray = firstString.toCharArray();
    char[] secondArray = secondString.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    System.out.println(firstArray.toString() + " " + secondArray.toString());
    return firstArray.equals(secondArray);
  }
}
