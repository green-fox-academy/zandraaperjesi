import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  private String toCount;
  private Map<Character, Integer> occurence;

  public CountLetters(String inputString) {
    this.toCount = inputString;
    occurence = new HashMap<>();
    this.countLetters();
  }

  public void countLetters() {
    for (int i = 0; i < this.toCount.length(); i++) {
      if(occurence.containsKey(this.toCount.charAt(i))) {
        occurence.replace(this.toCount.charAt(i), occurence.get(this.toCount.charAt(i)) + 1);
      }
      else {
        occurence.put(this.toCount.charAt(i), 1);
      }
    }
  }

  public Map getLetterMap() {
    return occurence;
  }

  public int timesInWord(char c) {
    if(occurence.containsKey(c)) {
      return occurence.get(c);
    }
    else {
      return 0;
    }
  }
}
