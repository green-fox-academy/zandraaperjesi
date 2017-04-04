import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int storeOfAmmo;
  private int hitPoints;

  public Carrier(int storeOfAmmo) {
    this.aircrafts = new ArrayList<>();
    this.storeOfAmmo = storeOfAmmo;
    this.hitPoints = 10000;
  }

  public void addAircraft(String aircraftType) {
    if(aircraftType.equals("F16")) {
      this.aircrafts.add(new F16());
    }
    if(aircraftType.equals("F35")) {
      this.aircrafts.add(new F35());
    }
  }

  public void fill() {
    if(this.storeOfAmmo > 0) {
      for(Aircraft a : aircrafts) {
        if(a.getClass().equals(F35.class)) {
          this.storeOfAmmo = a.refill(storeOfAmmo);
        }
      }
      for(Aircraft a : aircrafts) {
        this.storeOfAmmo = a.refill(storeOfAmmo);
      }
      if(this.storeOfAmmo < 1) {
        System.out.println("No ammo left on carrier!");
      }
    }
    else {
      System.out.println("No ammo left on carrier!");
    }
  }

  public void fight(Carrier carrier) {
    int damage = 0;
    for(Aircraft a : this.aircrafts) {
      damage += a.fight();
    }
    carrier.setHealth(damage);
  }

  public void setHealth(int damage) {
    this.hitPoints -= damage;
    if(this.hitPoints < 0) {
      this.hitPoints = 0;
    }
  }

  public int damageCount() {
    int damage = 0;
    for(Aircraft a : this.aircrafts) {
      damage += a.countDamage();
    }
    return damage;
  }

  public void getStatus() {
    if (this.hitPoints > 0) {
      System.out.println("HP left: " + this.hitPoints + " Aircraft count: " + this.aircrafts.size()
              + ", Ammo Storage: " + this.storeOfAmmo + ", Total damage: " + this.damageCount());
      System.out.println("Aircrafts:");
      for (Aircraft a : this.aircrafts) {
        System.out.println(a.getStatus());
      }
    }
    else {
      System.out.println("It's dead, Jim :(, press F to pay your respect.");
    }
  }

}
