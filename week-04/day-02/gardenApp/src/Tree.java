public class Tree extends Plant{
  private boolean needsWater;
  private double currentWaterAmount;

  public Tree() {
    super();
  }

  public void waterPlant(int water) {
    setCurrentWaterAmount(water * .4);
  }
}
