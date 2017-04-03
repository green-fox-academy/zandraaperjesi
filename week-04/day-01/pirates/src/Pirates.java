public class Pirates {
  public int intoxicated;
  public boolean alive;

  public Pirates() {
    intoxicated = 0;
    alive = true;
  }

  public void drinkSomeRum() {
    if(alive) {
      intoxicated += 1;
    }
    else {
      System.out.println("He's dead.");
    }
  }

  public void howsItGoingMate() {
    if(alive) {
      if (intoxicated <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        intoxicated = 0;
      }
    }
    else {
      System.out.println("He's dead.");
    }
  }

  public void die() {
    alive = false;
  }

  public void brawl() {
    
  }
}
