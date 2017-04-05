import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  private String toCount;
  private Map<Character, Integer> occurence;

  public CountLetters(String inputString) {
    this.toCount = inputString;
    occurence = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      if(occurence.containsKey(inputString.charAt(i))) {
        occurence.replace(inputString.charAt(i), occurence.get(inputString.charAt(i)) + 1);
      }
      else {
        occurence.put(inputString.charAt(i), 1);
      }
    }
  }

  
}
