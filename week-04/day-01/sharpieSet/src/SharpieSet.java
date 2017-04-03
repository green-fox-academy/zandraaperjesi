import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharpieSet {
  public static List<Sharpie> sharpies;
  public static int sharpieCount;

  public SharpieSet() {
    sharpies = new ArrayList<>();
    sharpieCount = 0;
  }

  public void addSharpie(Sharpie sharpieToAdd) {
    sharpies.add(sharpieToAdd);
    sharpieCount = sharpies.size();
  }

  public static void removeTrash() {
    Iterator<Sharpie> i = sharpies.iterator();
    int counter = 0;
    while(i.hasNext()) {
      Sharpie s = i.next();
      if(sharpies.get(counter).inkAmount <= 0) {
        i.remove();
        counter --;
      }
      counter ++;
    }
    sharpieCount = sharpies.size();
  }

  public static void countUsable() {
    SharpieSet.removeTrash();
    System.out.println(sharpieCount);
  }
}
