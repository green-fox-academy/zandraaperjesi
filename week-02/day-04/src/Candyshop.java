import java.util.ArrayList;

/**
 * Created by zandraa on 3/23/2017.
 */
public class Candyshop {
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    arrayList.set(arrayList.indexOf(2), "Croissant");
    arrayList.set(arrayList.indexOf(false), "Ice cream");
    System.out.println(arrayList);
  }
}

// Accidentally we added "2" and "false" to the list.
// Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
// No, don't just remove the lines