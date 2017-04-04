public class Flower extends Plant{
  public Flower() {
    super();
    this.setNeedWaterWhen(5);
  }

  public void waterPlant(int water) {
    setCurrentWaterAmount(water * .75);
  }
}
