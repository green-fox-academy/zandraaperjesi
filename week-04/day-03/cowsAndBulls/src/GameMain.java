import java.util.Scanner;

public class GameMain {
  public static void main(String[] args) {
    GameInit game = new GameInit();
    Scanner myScanner = new Scanner(System.in);
    int playerGuess = 0;

    while(game.getState().getState().equals("playing")) {
      do {
        System.out.println("Guess a 4 digit number!");
        if (myScanner.hasNextInt()) {
          playerGuess = myScanner.nextInt();
          if (playerGuess < 1111 || playerGuess > 9999) {
            System.out.println("not a valid guess");
            playerGuess = 0;
          }
        }
        else {
          System.out.println("not a valid guess");
          myScanner.next();
        }
      } while(playerGuess <= 0);

      System.out.println(game.guess(playerGuess));
    }
  }
}
