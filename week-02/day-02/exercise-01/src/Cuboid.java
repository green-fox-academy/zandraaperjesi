/**
 * Created by zandraa on 3/21/2017.
 */
public class Cuboid {
  public static void main(String[] args) {
    double x = 12.34;
    double y = 15.32;
    double z = 18.77;

    int surfaceArea = (int) (x * y * 2 + z * x * 2 + z * y * 2);
    int volume = (int) (y * x * z);
    System.out.println("Surface Area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
}
