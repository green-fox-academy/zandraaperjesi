public class Pirates {
  public int intoxicated;

  public Pirates() {
    intoxicated = 0;
  }

  public void drinkSomeRum() {
    intoxicated += 1;
  }

  public void howsItGoingMate() {
    if(intoxicated <= 4) {
      System.out.println("Pour me anudder!");
    }
    else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      intoxicated = 0;
    }
  }
}
