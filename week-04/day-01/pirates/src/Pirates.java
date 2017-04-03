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

  public void brawl(Pirates pirate) {
    if(alive && pirate.alive) {
      RanNum rand = new RanNum();
      int n = rand.randomNumber();
      if(n < 1) {
        die();
      }
      else if(n > 1) {
        pirate.die();
      }
      else {
        System.out.println("zZZzzZZzz");
        intoxicated = 0;
        pirate.intoxicated = 0;
      }
    }
    else{
      System.out.println("You can's fight dead pirates.");
    }
  }
}
