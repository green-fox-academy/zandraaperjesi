import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants = new ArrayList<>();
  private int plantsNeedWater = 0;

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void waterGarden(int water) {
    System.out.println("Watering with " + water);
    for(Plant p : plants) {
      if(p.getCurrentWaterAmount() < p.getNeedWaterWhen()) {
        p.waterPlant(water / plantsNeedWater);
      }
    }
  }

  public void checkForWaterNeeded() {
    plantsNeedWater = 0;
    for(Plant p : plants) {
      if(p.getCurrentWaterAmount() < p.getNeedWaterWhen()) {
        System.out.println("The " + p.getColor() + p.getClass() + " needs water" );
        plantsNeedWater += 1;
      }
      else {
        System.out.println("The " + p.getColor() + p.getClass() + " doesn't need water" );
      }
    }
  }
}
