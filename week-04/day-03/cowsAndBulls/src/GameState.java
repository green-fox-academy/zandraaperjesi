public class GameState {
  private String state;

  public GameState() {
    state = "playing";
  }

  public void endGame() {
    state = "finished";
  }

  public String getState() {
    return state;
  }
}
