public class Flower extends Plant{
  public Flower(String color) {
    super(color, 5);
  }

  public void waterPlant(int water) {
    setCurrentWaterAmount(water * .75);
  }
}
