import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zandraa on 3/27/2017.
 */
public class ReversedLines {
  public static void main(String[] args) {
    Path textPath = Paths.get("assets/reversed-lines.txt");
    List<String> textLines = new ArrayList<>();
    ArrayList<String> reversedLines = new ArrayList<>();

    try {
      textLines = Files.readAllLines(textPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    for (String line : textLines) {
      StringBuilder myStringBuilder = new StringBuilder(line);
      reversedLines.add(myStringBuilder.reverse().toString());
    }
  }
}
