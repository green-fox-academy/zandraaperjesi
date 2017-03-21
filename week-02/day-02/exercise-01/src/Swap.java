/**
 * Created by zandraa on 3/21/2017.
 */
public class Swap {
  public static void main(String[] args) {
    int a = 123;
    int b = 526;

    int buffer = a;
    a = b;
    b = buffer;

    System.out.println(a);
    System.out.println(b);
  }
}
