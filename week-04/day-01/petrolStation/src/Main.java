public class Main {
  public static void main(String[] args) {

    Station gasStation = new Station();
    Car car = new Car();

    System.out.println("gas in station: " + gasStation.gasAmount + ",gas in car: " + car.gasAmount);
    gasStation.refill(car);
    System.out.println("refilling");
    System.out.println("gas in station: " + gasStation.gasAmount + ",gas in car: " + car.gasAmount);
  }
}
