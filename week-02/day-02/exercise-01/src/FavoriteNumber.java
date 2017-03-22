import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class FavoriteNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("What is your favorite number? ");
    int favoriteNumber = myScanner.nextInt();

    System.out.println("Your favorite number is: " + favoriteNumber);
  }
}
