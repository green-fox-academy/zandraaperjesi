public class Station {

  int gasAmount;

  public Station() {
    this.gasAmount = 900;
  }

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
