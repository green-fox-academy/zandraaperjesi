import java.util.Arrays;

public class Dice {
  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();

    int allSix = 0;

    while(allSix != 6 * myDice.getCurrent().length) {
      allSix = 0;
      for (int i = 0; i < myDice.getCurrent().length; i++) {
        allSix += myDice.getCurrent(i);
        if(myDice.getCurrent(i) != 6) {
          myDice.reroll(i);
        }
      }
    }

    for (int rolled : myDice.getCurrent()) {
      System.out.println(rolled);
    }
  }
}