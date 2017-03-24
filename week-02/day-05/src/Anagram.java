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
    System.out.println(wordOne.equals(wordTwo));
  }
}
