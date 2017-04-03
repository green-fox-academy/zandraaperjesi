import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Armada {
  public List<Ship> ships;

  public Armada() {
    this.ships = new ArrayList<>();
  }

  public boolean war(Armada otherArmada) {
    ListIterator<Ship> otherIt = otherArmada.ships.listIterator();
    ListIterator<Ship> thisIt = this.ships.listIterator();

    while (thisIt.hasNext() && otherIt.hasNext()) {
      thisIt.next();
      otherIt.next();
      if (thisIt.equals(this.ships.get(this.ships.size() - 1))) {
        System.out.println("The armada's last ship has fallen!");
        return false;
      }
      if (otherIt.equals(otherArmada.ships.get(otherArmada.ships.size() - 1))); {
        System.out.println("The other armada has lost all of its ships!");
        return true;
      }
    }
    return false;
  }
}
