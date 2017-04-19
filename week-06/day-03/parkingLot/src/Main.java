import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    List<Car> allCars = new ArrayList<>();
    Map<String, Integer> carOccurs = new HashMap<>();

    for (int i = 0; i < 256; i++) {
      Car bufferCar = new Car(CarType.returnType(), CarColor.returnColor());
      String bufferString = bufferCar.type.toString() + " " + bufferCar.color.toString();
      if (carOccurs.containsKey(bufferString)) {
        carOccurs.put(bufferString, carOccurs.get(bufferString) + 1);
      }
      else {
        carOccurs.put(bufferString, 1);
      }
    }
  }
}
