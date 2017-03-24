import java.util.Scanner;

/**
 * Created by zandraa on 3/24/2017.
 */
public class PalindromeBuilder {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a word and I will build an anagram from it: ");
    String usersWord = myScanner.next();
    StringBuilder reversedword = new StringBuilder(usersWord).reverse();
    System.out.println(usersWord.concat(reversedword.toString()));
  }
}
