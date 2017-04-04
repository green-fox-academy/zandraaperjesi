public class Plant {
  private boolean needWater;
  private double currentWaterAmount;

  public Plant() {
    this.needWater = false;
    this.currentWaterAmount = 0;
  }

  public void waterPlant(int water) {
    currentWaterAmount += water;
  }

  public double getCurrentWaterAmount() {
    return this.currentWaterAmount;
  }

  public void setCurrentWaterAmount(double waterAmount) {
    currentWaterAmount += waterAmount;
  }
}
