import java.util.Scanner;

public class GameMain {
  public static void main(String[] args) {
    GameInit game = new GameInit();
    Scanner myScanner = new Scanner(System.in);

    while(game.getGuesses() < 8) {
      System.out.println("Take a guess");
      int toGuess = myScanner.nextInt();
      System.out.println(game.guess(toGuess));
    }
  }
}
