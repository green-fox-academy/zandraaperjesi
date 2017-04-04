import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int storeOfAmmo;
  private int hitPoints;

  public Carrier(int storeOfAmmo) {
    this.aircrafts = new ArrayList<>();
    this.storeOfAmmo = storeOfAmmo;
    this.hitPoints = 1000;
  }

  public void addAircraft(String aircraftType) {
    if(aircraftType.equals("F16")) {
      this.aircrafts.add(new F16());
    }
    if(aircraftType.equals("F35")) {
      this.aircrafts.add(new F35());
    }
  }
}
