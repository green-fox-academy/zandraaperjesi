import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zandraa on 3/23/2017.
 */
public class SolarSystem {
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    planetList.add(5, "Saturn");

    System.out.println(planetList);
  }
}
// Saturn is missing from the planetList
// Insert it into the correct position