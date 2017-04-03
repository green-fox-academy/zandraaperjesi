import java.util.ArrayList;
import java.util.List;

public class Farm {
  public List<Animal> animals;
  public int slots;

  public Farm() {
    this.animals = new ArrayList<>();
    this.slots = 5;
  }

  public void breed() {
    if(slots > 0) {
      animals.add(new Animal());
      slots--;
    }
  }

  public void slaughter() {
    int leastHungry = 100;
    int leastHungryIndex = -1;
    for(Animal a : animals) {
      if(a.hunger < leastHungry) {
        leastHungryIndex = animals.indexOf(a);
      }
    }
    if(leastHungryIndex >= 0) {
      animals.remove(leastHungryIndex);
    }
  }
}
