public class RandomGenerator {

  public int ranNum() {
    return (int) (Math.random() * 10) * 72;
  }

  public int outOfFour() {
    return (int) (Math.random() * 4);
  }

  public int outOfSix() {
    return (int) (Math.random() * 6);
  }

  public int outOfTen() {
    return (int) (Math.random() * 10);
  }
}
