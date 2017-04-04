public class Tree extends Plant{
  public Tree() {
    super();
    this.setNeedWaterWhen(10);
  }

  public void waterPlant(int water) {
    setCurrentWaterAmount(water * .4);
  }
}
