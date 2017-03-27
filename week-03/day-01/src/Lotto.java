import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zandraa on 3/27/2017.
 */
public class Lotto {
  public static void main(String[] args) {
    HashMap<Integer, Integer> mostCommon= new HashMap<>();
    String regex = ";";
    List<String> lottoLines = new ArrayList<>();
    HashMap<Integer, Integer> numberMap= new HashMap<>();
    ArrayList<Integer> numbersFromLines = new ArrayList<>();
    try {
      Path filePath = Paths.get("assets/otos.csv");
      lottoLines = Files.readAllLines(filePath);
    } catch (IOException ex) {
      System.exit(1);
      System.out.println("couldn't open file");
    }

    for (int i = 0; i < lottoLines.size(); i++) {
      String[] splitUp = lottoLines.get(i).split(regex);
      for (int j = splitUp.length - 5; j < splitUp.length; j++) {
        StringBuilder intConverter = new StringBuilder();
        intConverter.append(splitUp[j]);
        numbersFromLines.add(Integer.parseInt(intConverter.toString()));
      }
    }

    for (int num : numbersFromLines) {
      if (!numberMap.containsKey(num)) {
        numberMap.put(num, 1);
      }
      else {
        numberMap.put(num, numberMap.get(num) + 1);
      }
    }

    for (int i = 0; i < 5; i++) {
      int numBuffer = 0;
      int valueBuffer = 0;
      for (int j = 1; j < numberMap.size() + 1; j++) {
        if (numberMap.get(j) > valueBuffer) {
          valueBuffer = numberMap.get(j);
          numBuffer = j;
        }
      }
      mostCommon.put(numBuffer, valueBuffer);
      numberMap.put(numBuffer, 0);
    }
    System.out.println(mostCommon);
  }
}
