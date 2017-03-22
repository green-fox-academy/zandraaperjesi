import java.util.Arrays;

/**
 * Created by zandraa on 3/22/2017.
 */
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int arrayLen = aj.length;

    for (int i = 0; i < (arrayLen / 2); i++) {
      int buffer = 0;
      buffer = aj[i];
      aj[i] = aj[arrayLen - 1 - i];
      aj[arrayLen - 1 - i] = buffer;
    }

    System.out.println(Arrays.toString(aj));
  }
}

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`