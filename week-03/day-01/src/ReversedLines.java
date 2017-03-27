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
    Path outputPath = Paths.get("assets/not-reversed-lines.txt");
    List<String> textLines = new ArrayList<>();
    List<String> reversedLines = new ArrayList<>();

    try {
      textLines = Files.readAllLines(textPath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (String reverseLine : textLines) {
      StringBuilder myStringBuilder = new StringBuilder(reverseLine);
      reversedLines.add(myStringBuilder.reverse().toString());
    }

    for (String line : reversedLines) {
      System.out.println(line);
    }

    try {
      Files.write(outputPath, reversedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
