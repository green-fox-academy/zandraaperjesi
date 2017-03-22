/**
 * Created by zandraa on 3/22/2017.
 */
public class AppendA {
  public static void main(String[] args) {
    String am = "kuty";

    System.out.println(appendA(am));
  }

  private static String appendA(String toApendTo) {
    return toApendTo + "a";
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `am` and assign the value `kuty` to it
// - Write a function called `appendA` that gets a string as an input
//   and appends an 'a' character to its end
// - Print the result of `appendA(am)`
