import java.util.ArrayList;
import java.util.List;

public class Armada {
  public List<Ship> ships;

  public Armada() {
    this.ships = new ArrayList<>();
  }

  public boolean war(Armada otherArmada) {
    int i = 0;
    int j = 0;

    while (i < this.ships.size() && j < otherArmada.ships.size()) {
      if(this.ships.get(i).battle(otherArmada.ships.get(j))) {
        j++;
      }
      else {
        i++;
      }

      if (this.ships.get(i).equals(this.ships.get(this.ships.size() - 1))) {
        System.out.println("The armada's last ship has fallen!");
        return false;
      }
      if (otherArmada.ships.get(j).equals(otherArmada.ships.get(otherArmada.ships.size() - 1))) {
        System.out.println("The other armada has lost all of its ships!");
        return true;
      }
    }
    return false;
  }
}
