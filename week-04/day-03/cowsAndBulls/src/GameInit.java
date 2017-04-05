import java.util.ArrayList;
import java.util.List;

public class GameInit {
  private List<Integer> guesses;
  private List<Integer> toGuess;
  private String guessResponse = "";

  public GameInit() {
    this.guesses = new ArrayList<>();
    this.toGuess = new ArrayList<>();
    fillNumbers();
  }

  public void fillNumbers() {
    for (int i = 0; i < 4; i++) {
      toGuess.add(new RandomNumber().getRandom());
    }
  }

  public void numToArray(int guess) {
    while (guess > 0) {
      guesses.add(0, guess % 10);
      guess = guess / 10;
    }
  }

  public String guess(int guess) {
    String guessResponse = " ";
    numToArray(guess);
    for (int i = 0; i < 4; i++) {
      if(guesses.get(i) == toGuess.get(i)) {
        this.guessResponse += "cow ";
      }
      else if(toGuess.contains(guesses.get(i))) {
        this.guessResponse += "bull ";
      }
    }
    System.out.println(this.guessResponse);
    return guessResponse;
  }
}
