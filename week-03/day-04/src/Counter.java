public class Counter {
  public static void main(String[] args) {
    System.out.println(counter(6));
  }

  public static int counter(int countFrom) {
    if (countFrom == 1) {
      return 1;
    }
    else {
      return countFrom + counter(countFrom - 1);
    }
  }
}
