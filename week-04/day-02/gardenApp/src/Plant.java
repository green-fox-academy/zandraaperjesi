public class Plant {
  private boolean needWater;
  private double currentWaterAmount;
  private String color;
  private int needWaterWhen;

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

  public boolean getNeedsWater() {
    return this.needWater;
  }

  public void setNeedsWater(boolean need) {
    this.needWater = need;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public int getNeedWaterWhen() {
    return needWaterWhen;
  }

  public void setNeedWaterWhen(int needsWaterUnder) {
    this.needWaterWhen = needsWaterUnder;
  }
}
