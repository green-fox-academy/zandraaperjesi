import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zandraa on 3/27/2017.
 */
public class EncodedLines {
  public static void main(String[] args) {
    List<String> encodedLines = new ArrayList<>();
    List<String> decodedLines = new ArrayList<>();
    Path inputPath = Paths.get("assets/encoded-lines.txt");
    Path outputPath = Paths.get("assets/decoded-lines.txt");

    try {
      encodedLines = Files.readAllLines(inputPath);
      for (String line : encodedLines) {
        StringBuffer decoder = new StringBuffer();
        for (int i = 0; i < line.length(); i++) {
          int charValue = line.charAt(i);
          if (!Character.isWhitespace(line.charAt(i))) {
            decoder.append(String.valueOf((char) (charValue - 1)));
          }
          else decoder.append(line.charAt(i));
        }
        System.out.println(decoder);
        decodedLines.add(decoder.toString());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      Files.write(outputPath, decodedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
