import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorCounter {
  Map<String, Integer> carColorOccurs = new HashMap<>();
  List<Car> allCars;

  public ColorCounter(List<Car> allCars) {
    this.allCars = allCars;
  }

  public void countColors() {
    for (Car c : allCars) {
      if (carColorOccurs.containsKey(c.color.toString())) {
        carColorOccurs.put(c.color.toString(), carColorOccurs.get(c.color.toString()) + 1);
      } else {
        carColorOccurs.put(c.color.toString(), 1);
      }
    }
  }
}
