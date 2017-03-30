public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibo(7));
  }

  public static int fibo(int countTo) {
    if (countTo == 0) {
      return 0;
    }
    else if (countTo == 1) {
      return 1;
    }
    else {
      return fibo(countTo - 1) + fibo(countTo - 2);
    }
  }
}
