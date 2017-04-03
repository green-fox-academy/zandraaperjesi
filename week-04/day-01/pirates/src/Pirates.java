public class Pirates {
  public int intoxicated;
  public boolean alive;
  public boolean passeOut;

  public Pirates() {
    intoxicated = 0;
    alive = true;
    passeOut = false;
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
    if(alive && !passeOut) {
      if (intoxicated <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        passeOut = true;
        intoxicated = 0;
      }
    }
    else if (!alive){
      System.out.println("He's dead.");
    }
    else {
      System.out.println("He's passed out.");
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

  public void hasParrot() {
    if(alive) {
      RanNum rand = new RanNum();
      int n = rand.randomNumber();
      if(n < 1) {
        System.out.println("has parrot.");
      }
      else {
        System.out.println("no parrot.");
      }
    }
    else {
      System.out.println("he's dead.");
    }
  }

  public void wakeUp() {
    System.out.println("Huh?");
    passeOut = false;
  }
}
