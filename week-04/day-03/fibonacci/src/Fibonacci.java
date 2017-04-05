public class Fibonacci {

  public static int calcFibonacci(int countTo) {
    if (countTo == 0) {
      return 0;
    }
    else if (countTo == 1) {
      return 1;
    }
    else {
      return calcFibonacci(countTo - 1) + calcFibonacci(countTo - 2);
    }
  }
}