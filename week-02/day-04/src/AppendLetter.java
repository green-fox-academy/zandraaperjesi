import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zandraa on 3/23/2017.
 */
public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    for (int i = 0; i < far.size(); i++) {
      far.set(i, far.get(i).concat("a"));
    }

    System.out.println(far);
  }
}

// Add "a" to every string in the far list.