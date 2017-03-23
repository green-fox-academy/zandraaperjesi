import java.util.Scanner;

/**
 * Created by zandraa on 3/23/2017.
 */
public class Calculator {
  public static void main(String... args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String userInput = myScanner.nextLine();
    String[] seperateInput = userInput.split(" ");
    System.out.println(calculate(seperateInput));
  }

  private static int calculate (String[] count) {
    int a = Integer.parseInt(count[1]);
    int b = Integer.parseInt(count[2]);

    if (count[0].equals("+")) {
      return a + b;
    }
    else if (count[0].equals("-")) {
      return a - b;
    }
    else if (count[0].equals("*")) {
      return a * b;
    }
    else if (count[0].equals("/")) {
      return a / b;
    }
    else if (count[0].equals("%")) {
      return a % b;
    }
    else {
      return 117;
    }
  }
}

// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit
