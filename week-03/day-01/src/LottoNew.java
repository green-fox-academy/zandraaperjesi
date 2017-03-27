import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LottoNew {
  public static String INPUT_PATH = "assets/otos.csv";
  public static String REGEX = ";";
  public static int NUM_START_INDEX = 11;
  public static int NUM_END_INDEX = 16;

  public static void main(String[] args) {
    List<String> winningNumbers = inputReader();
    Map<String, Integer> numbersOccurence = numberCounter(winningNumbers);
  }

  public static HashMap<String, Integer> numberCounter(List<String> numbers) {
    HashMap<String, Integer> numbersCounted = new HashMap<>();
    for (String readNumber : numbers) {
      if (numbersCounted.containsKey(readNumber)) {
        numbersCounted.put(readNumber, numbersCounted.get(readNumber) + 1);
      } else {
        numbersCounted.put(readNumber, 1);
      }
    }
    return numbersCounted;
  }

  public static List<String> inputReader() {
    List<String> numbers = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Paths.get(INPUT_PATH));
      for (String line : lines) {
        Collections.addAll(numbers, Arrays.copyOfRange(line.split(REGEX), NUM_START_INDEX, NUM_END_INDEX));
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Couldn't open input file");
    }
    return numbers;
  }
}
