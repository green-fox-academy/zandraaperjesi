import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeCounter {
  Map<String, Integer> carTypeOccurs = new HashMap<>();
  List<Car> allCars;

  public TypeCounter(List<Car> allCars) {
    this.allCars = allCars;
  }

  public void countTypes() {
    for (Car c : allCars) {
      if (carTypeOccurs.containsKey(c.type.toString())) {
        carTypeOccurs.put(c.type.toString(), carTypeOccurs.get(c.type.toString()) + 1);
      }
      else {
        carTypeOccurs.put(c.type.toString(), 1);
      }
    }

    for (Map.Entry<String, Integer> e : carTypeOccurs.entrySet()) {
      System.out.println(e.getKey() + " " + e.getValue());

    }
  }
}
