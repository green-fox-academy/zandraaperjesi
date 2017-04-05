import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    if(pool.size() / 2 == 1) {
      return pool.get((pool.size()-1)/2);
    }
    else {
      return (pool.get((pool.size() - 1) / 2) + (pool.get(pool.size() / 2))) / 2;
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'á', 'ú', 'ü', 'ű', 'ö', 'ő', 'é', 'í', 'ó').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    StringBuilder myStringBuilder = new StringBuilder(hungarian);
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        String s = new StringBuilder().append(c).append('v').append(c).toString();
        teve = teve.substring(0, i) + s + teve.substring(i + 1);
        i += 2;
        System.out.println(teve);
        length = teve.length();
      }
    }
    System.out.println(teve);
    return teve;
  }
}