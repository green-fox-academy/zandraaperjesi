import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    List<Car> allCars = new ArrayList<>();
    Map<String, Integer> carOccurs = new HashMap<>();
    ColorCounter myColorCounter;
    TypeCounter myTypeCounter;

    for (int i = 0; i < 256; i++) {
      Car bufferCar = new Car(CarType.returnType(), CarColor.returnColor());
      String bufferString = bufferCar.type.toString() + " " + bufferCar.color.toString();
      if (carOccurs.containsKey(bufferString)) {
        carOccurs.put(bufferString, carOccurs.get(bufferString) + 1);
      }
      else {
        carOccurs.put(bufferString, 1);
      }
      allCars.add(bufferCar);
    }

    myColorCounter = new ColorCounter(allCars);
    myTypeCounter = new TypeCounter(allCars);

    myColorCounter.countColors();
    myTypeCounter.countTypes();


    int occurs = 0;
    String carType = "";
    for (Map.Entry<String, Integer> e : carOccurs.entrySet()) {
      if (e.getValue() > occurs) {
        occurs = e.getValue();
        carType = e.getKey();
      }
    }
    System.out.println(carType + " " + occurs);
  }
}
