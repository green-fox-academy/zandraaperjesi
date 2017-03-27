import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zandraa on 3/27/2017.
 */
public class Lotto {
  public static void main(String[] args) throws IOException {
    String regex = ";";
    List<String> lottoLines = new ArrayList<>();
    //ArrayList<String> splitLines= new ArrayList<>();
    ArrayList<Integer> numbersFromLines = new ArrayList<>();
    try {
      Path filePath = Paths.get("assets/otos.csv");
      lottoLines = Files.readAllLines(filePath);
    } catch (IOException ex) {
      System.exit(1);
      System.out.println("couldn't open file");
    }
    for (int i = 0; i < lottoLines.size(); i++) {
      String[] splitUp = lottoLines.get(i).split(regex);
      for (int j = splitUp.length - 5; j < splitUp.length; j++) {
        StringBuilder intConverter = new StringBuilder();
        intConverter.append(splitUp[j]);
        numbersFromLines.add(Integer.parseInt(intConverter.toString()));
      }
    }
    System.out.println(numbersFromLines.toString());
  }
}
