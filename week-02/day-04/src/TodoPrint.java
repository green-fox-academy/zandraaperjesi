/**
 * Created by zandraa on 3/23/2017.
 */
public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";

    todoText =  "My todo:\n".concat(" - Buy milk\n").concat(" - Download games\n").concat("\t- Diablo\n");
    System.out.println(todoText);
  }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo