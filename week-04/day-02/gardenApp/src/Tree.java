public class Tree extends Plant{
  public Tree(String color) {
    super(color, 10);
  }

  public void waterPlant(int water) {
    setCurrentWaterAmount(water * .4);
  }
}
