/**
 * Created by zandraa on 3/23/2017.
 */
public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    reversed = reverser(reversed);
    System.out.println(reversed);
  }

  private static String reverser(String toReverse) {
    String correctOrder = "";
    for (int i = 0; i < toReverse.length(); i++) {
      correctOrder += (toReverse.charAt(toReverse.length() - 1 - i));
    }
    return correctOrder;
  }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
