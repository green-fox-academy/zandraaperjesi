public class Power {
  public static void main(String[] args) {
    System.out.println(toThePowerOf(3, 2));
  }
  public static int toThePowerOf(int base, int toPower) {
    if (toPower == 1) {
      return base;
    }
    else {
      return base * toThePowerOf(base, toPower - 1);
    }
  }
}
