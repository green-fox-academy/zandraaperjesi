import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zandraa on 3/27/2017.
 */
public class Doubled {
  public static void main(String[] args) {
    List<String> textLines= new ArrayList<>();
    ArrayList<String> skimmedLines = new ArrayList<>();
    Path textPath = Paths.get("assets/duplicated-chars.txt");
    try {
      textLines = Files.readAllLines(textPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (String line : textLines) {
      StringBuilder myStringBuilder = new StringBuilder();
      myStringBuilder.append(line.charAt(0));
      for (int i = 1; i < line.length(); i++) {
        if (line.charAt(i) != line.charAt(i - 1)) {
          myStringBuilder.append(line.charAt(i));
        }
      }
      System.out.println(myStringBuilder.toString());
    }
  }
}
