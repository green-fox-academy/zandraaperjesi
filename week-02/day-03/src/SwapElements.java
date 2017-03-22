import java.util.Arrays;

/**
 * Created by zandraa on 3/22/2017.
 */
public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};

    String buffer;

    buffer = abc[0];
    abc[0] = abc[2];
    abc[2] = buffer;

    System.out.println(Arrays.toString(abc));
  }
}

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`