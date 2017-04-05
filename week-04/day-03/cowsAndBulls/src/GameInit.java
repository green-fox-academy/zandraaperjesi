import java.util.ArrayList;
import java.util.List;

public class GameInit {
  private List<Integer> guesses;
  private List<Integer> toGuess;
  private int guessesSoFar;
  private String guessResponse = "";
  private GameState state;

  public GameInit() {
    this.guesses = new ArrayList<>();
    this.toGuess = new ArrayList<>();
    guessesSoFar = 0;
    fillNumbers();
    state = new GameState();
  }

  public GameState getState() {
    return this.state;
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
    this.guessResponse = "";
    numToArray(guess);
    int cows = checkGuess();
    if(cows == 4) {
      state.endGame();
      return "You win!";
    }
    if(this.guessesSoFar == 7) {
      state.endGame();
      return "You ran out of tries";
    }
    incrementGuessesSoFar();
    return this.guessResponse;
  }

  public int checkGuess() {
    int cows = 0;
    for (int i = 0; i < 4; i++) {
      if(guesses.get(i) == toGuess.get(i)) {
        this.guessResponse += "cow ";
        cows += 1;
      }
      else if(toGuess.contains(guesses.get(i))) {
        this.guessResponse += "bull ";
      }
    }
    return cows;
  }
}
