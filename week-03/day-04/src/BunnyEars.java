public class BunnyEars {
  public static void main(String[] args) {
    System.out.println(earCount(10));
  }

  public static int earCount(int bunnies) {
    if (bunnies == 1) {
      return 2;
    }
    else {
      return 2 + earCount(bunnies - 1);
    }
  }
}

