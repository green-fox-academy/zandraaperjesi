import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zandraa on 3/27/2017.
 */
public class ReversedOrder {
  public static void main(String[] args) {
    List<String> inOrder = new ArrayList<>();
    Path inputPath = Paths.get("assets/reversed-order.txt");
    Path outputPath = Paths.get("assets/in-order.txt");
    try {
      List<String> inputLines = Files.readAllLines(inputPath);
      for (String lines : inputLines) {
        inOrder.add(0, lines);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (String line : inOrder) {
      System.out.println(line);
    }
    try {
      Files.write(outputPath, inOrder);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
