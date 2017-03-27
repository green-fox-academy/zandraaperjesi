import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zandraa on 3/27/2017.
 */
public class Doubled {
  public static void main(String[] args) throws IOException {
    List<String> textLines = new ArrayList<>();
    ArrayList<String> nonDuplicateLines = new ArrayList<>();
    Path textPath = Paths.get("assets/duplicated-chars.txt");
    Path outputPath = Paths.get("assets/not-duplicated.txt");

    try {
      textLines = Files.readAllLines(textPath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (String line : textLines) {
      StringBuilder myStringBuilder = new StringBuilder();
      if (line.length() != 0) {
        myStringBuilder.append(line.charAt(0));
      }
      for (int i = 1; i < line.length(); i++) {
        if (line.charAt(i) != line.charAt(i - 1)) {
          myStringBuilder.append(line.charAt(i));
        }
      }
      System.out.println(myStringBuilder.toString());
      nonDuplicateLines.add(myStringBuilder.toString());
    }

    Files.write(outputPath, nonDuplicateLines);
  }
}
