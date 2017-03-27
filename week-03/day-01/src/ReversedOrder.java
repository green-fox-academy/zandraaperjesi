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
    String regex = " ";
    List<String> inOrder = new ArrayList<>();
    Path inputPath = Paths.get("assets/reversed-order.txt");
    try {
      List<String> inputLines = Files.readAllLines(inputPath);
      for (String line : inputLines) {
        StringBuilder myStringBuilder = new StringBuilder(line);
        String[] wordBuffer = myStringBuilder.reverse().toString().split(regex);
        myStringBuilder.setLength(0);
        for (int i = 0; i < wordBuffer.length; i++) {
          myStringBuilder.append(wordBuffer[i]);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
