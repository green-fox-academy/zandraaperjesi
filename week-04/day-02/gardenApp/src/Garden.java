import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants = new ArrayList<>();

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void waterGarden(int water) {
    for(Plant p : plants) {
      if(p.getCurrentWaterAmount() < p.getNeedWaterWhen()) {
        p.waterPlant(water / checkForWaterNeeded());
      }
    }
  }

  public int checkForWaterNeeded() {
    int plantsNeedWater = 0;
    for(Plant p : plants) {
      if(p.getCurrentWaterAmount() < p.getNeedWaterWhen()) {
        plantsNeedWater += 1;
      }
    }
    return plantsNeedWater;
  }
}
