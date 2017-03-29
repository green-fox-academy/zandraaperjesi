public class SumDigit {
  public static void main(String[] args) {
    System.out.println(digitSumer(12345));
  }
  public static int digitSumer(int digitsToAdd) {
    if (digitsToAdd < 10) {
      return digitsToAdd;
    }
    else {
      return (digitsToAdd % 10) + (digitSumer(digitsToAdd / 10));
    }
  }
}
