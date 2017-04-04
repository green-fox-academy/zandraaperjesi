public class Main {
  public static void main(String[] args) {

    //System.out.println(f35.getStatus());
    Carrier carrier1 = new Carrier(150);
    Carrier carrier2 = new Carrier(500);

    for(int i = 0; i < 5; i++) {
      carrier1.addAircraft("F16");
      carrier1.addAircraft("F35");
    }
    for(int i = 0; i < 5; i++) {
      carrier2.addAircraft("F16");
      carrier2.addAircraft("F35");
    }

    carrier1.fill();
    carrier2.fill();

    carrier1.fight(carrier2);

    carrier1.fill();

    carrier1.getStatus();
    carrier2.getStatus();
  }
}
