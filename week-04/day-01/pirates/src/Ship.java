import java.util.ArrayList;
import java.util.List;

public class Ship {
  public List<Pirates> crew;
  public Pirates captain;
  public int numberOfPirates;

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
    numberOfPirates = crew.size();
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
    System.out.println("There are " + numberOfPirates + " pirates in the crew.");
  }

  public boolean battle(Ship otherShip) {
    if(this.countPoints() > otherShip.countPoints()) {
      win(this);
      lose(otherShip);
      return true;
    }
    else {
      lose(this);
      win(otherShip);
      return false;
    }
  }

  public void win(Ship ship) {
    int n = new RanNum().randomNumber();
    for(Pirates p : this.crew) {
      for (int i = 0; i < n; i++) {
        p.drinkSomeRum();
      }
    }
  }

  public void lose(Ship ship) {
    int n = new RanNum().randomNumber();
    for (int i = 0; i < ship.crew.size(); i++) {
      if(i / n == 1) {
        ship.crew.remove(i);
      }
    }
  }

  public int countPoints() {
    int points = 0;
    for(Pirates p : this.crew) {
      if(p.alive) {
        points++;
      }
    }
    points -= this.captain.intoxicated;
    return points;
  }
}
