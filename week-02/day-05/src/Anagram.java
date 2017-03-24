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

  private static boolean isAnagram (String wordOne, String wordTwo) {
    char[] firstArray = wordOne.toCharArray();
    char[] secondArray = wordTwo.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    String firstWord = new String(firstArray);
    String secondWord = new String(secondArray);
    return firstWord.equals(secondWord);
  }
}
