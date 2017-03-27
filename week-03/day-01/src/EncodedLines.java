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
    try {
      encodedLines = Files.readAllLines(inputPath);
      for (String line : encodedLines) {
        StringBuffer decoder = new StringBuffer();
        for (int i = 0; i < line.length(); i++) {
          int charValue = line.charAt(i);
          decoder.append(String.valueOf((char) (charValue - 1)));
        }
        System.out.println(decoder);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
