import java.util.Scanner;

/**
 * Created by zandraa on 3/21/2017.
 */
public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    System.out.println("What is your name?");
    Scanner myScanner = new Scanner(System.in);
    String name = myScanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
