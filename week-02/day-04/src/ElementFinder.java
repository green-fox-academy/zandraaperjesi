import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zandraa on 3/23/2017.
 */
public class ElementFinder {
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

    if (arrayList.contains(7)) {
      System.out.println("Hoorray");
    }
    else {
      System.out.println("Noooooo");
    }

    boolean found = false;
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i) == 7) {
        found = true;
      }
    }
    if (found) {
      System.out.println("Hoorray");
    }
    else {
      System.out.println("Noooooo");
    }
  }
}

// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!