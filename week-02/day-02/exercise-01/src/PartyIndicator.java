import java.util.Scanner;

/**
 * Created by zandraa on 3/22/2017.
 */
public class PartyIndicator {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("How many girls?");
    int girls = myScanner.nextInt();
    System.out.println("How many boys?");
    int boys = myScanner.nextInt();

    if (girls == 0) {
      System.out.println("Sausage party");
    }
    else if (girls + boys < 20) {
      System.out.println("Average party...");
    }
    else if (girls != boys && girls + boys > 20) {
      System.out.println("Quite cool party!");
    }
    else if (girls == boys && girls + boys > 20){
      System.out.println("The party is exellent!");
    }

  }
}

// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people