import java.util.ArrayList;
import java.util.List;

public class Ship {
  public List<Pirates> crew;
  public Pirates captain;

  public Ship() {
    crew = new ArrayList<>();
    captain = new Pirates();
  }

  public void fillShip() {
    RanNum ran = new RanNum();
    int n = ran.piratesInShip();
    for (int i = 0; i < n; i++) {
      crew.add(new Pirates());
    }
    System.out.println("Captain drank " + captain.intoxicated + " rums.");
    if(!captain.alive) {
      System.out.println("He is dead.");
    }
    else if(captain.passOut) {
      System.out.println("He is passed out.");
    }
    else {
      System.out.println("He is ready for battle.");
    }
  }
}
