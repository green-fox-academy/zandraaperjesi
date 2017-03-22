import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class Printer {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("What should I print?");
    String printThis = myScanner.nextLine();

    printer(printThis);
  }

  private static void printer(String toPrint) {
    System.out.println(toPrint);
  }
}
// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)