import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoNew {
  public static String INPUT_PATH = "assets/otos.csv";
  public static String REGEX = ";";
  public static int NUM_START_INDEX = 11;
  public static int NUM_END_INDEX = 16;

  public static void main(String[] args) {
    inputReader();
  }

  public static void inputReader() {
    try {
      List<String> lines = Files.readAllLines(Paths.get(INPUT_PATH));
      List<String> numbers= new ArrayList<>();
      for (String line : lines) {
        Collections.addAll(numbers, Arrays.copyOfRange(line.split(REGEX), NUM_START_INDEX, NUM_END_INDEX));
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Couldn't open input file");
    }
  }
}
