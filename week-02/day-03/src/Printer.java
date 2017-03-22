import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class Printer {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("How many lines do you want to print?");
    int linesToPrint = myScanner.nextInt();

    String[] toPrint = new String[linesToPrint];

    myScanner.nextLine();

    for (int i = 0; i < linesToPrint; i++) {
      System.out.println("Line " + (i + 1) + " please:");
      toPrint[i] = myScanner.nextLine();
    }

    printer(toPrint);
  }

  private static void printer(String... toPrint) {

    for (String print : toPrint) {
      System.out.println(print);
    }

  }
}
// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)