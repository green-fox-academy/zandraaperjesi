/**
 * Created by zandraa on 3/22/2017.
 */
public class AppendA2 {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};

    for (int i = 0; i < nimals.length; i++) {
      nimals[i] += "a";
    }

    for (int i = 0; i < nimals.length; i++) {
      System.out.println(nimals[i]);
    }
  }
}

// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end