public class BunnyLine {
  public static void main(String[] args) {
    System.out.println(bunnyEarCounter(5));
  }

  public static int bunnyEarCounter(int bunnies) {
    if (bunnies == 1) {
      return 2;
    }
    else if (bunnies % 2 == 0) {
      return 3 + bunnyEarCounter(bunnies - 1);
    }
    else {
      return 2 + bunnyEarCounter(bunnies - 1);
    }
  }
}
