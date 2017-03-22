import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class Cuboid {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Cube's width: ");
    int x = myScanner.nextInt();
    System.out.println("Cube's other width: ");
    int y = myScanner.nextInt();
    System.out.println("Cube's height: ");
    int z = myScanner.nextInt();

    int surfaceArea = (x * y * 2 + z * x * 2 + z * y * 2);
    int volume = (y * x * z);
    System.out.println("Surface Area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
}
