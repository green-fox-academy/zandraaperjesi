import java.util.ArrayList;
import java.util.List;

public class GameInit {
  private List<Integer> guesses;
  private List<Integer> toGuess;
  private int guessesSoFar;
  private String guessResponse = "";

  public GameInit() {
    this.guesses = new ArrayList<>();
    this.toGuess = new ArrayList<>();
    guessesSoFar = 0;
    fillNumbers();
  }

  public int getGuesses() {
    return this.guessesSoFar;
  }

  public void incrementGuessesSoFar() {
    this.guessesSoFar += 1;
  }

  public void fillNumbers() {
    for (int i = 0; i < 4; i++) {
      toGuess.add(new RandomNumber().getRandom());
    }
  }

  public void numToArray(int guess) {
    if(guesses.size() < 4) {
      for (int i = 0; i < 4; i++) {
        guesses.add(0);
      }
    }
    int i = 3;
    while (guess > 0) {
      guesses.set(i, guess % 10);
      guess = guess / 10;
      i -= 1;
    }
  }

  public String guess(int guess) {
    //
    //ha guesses >= 8 akkor --> gamestate finished
    //
    this.guessResponse = "";
    numToArray(guess);
    for (int i = 0; i < 4; i++) {
      if(guesses.get(i) == toGuess.get(i)) {
        this.guessResponse += "cow ";
      }
      else if(toGuess.contains(guesses.get(i))) {
        this.guessResponse += "bull ";
      }
      //
      //ha a 4 cow akkor finished es print winner
      //
    }
    System.out.println(guesses);
    System.out.println(toGuess);
    incrementGuessesSoFar();
    return this.guessResponse;
  }
}
