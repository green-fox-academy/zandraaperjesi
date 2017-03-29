public class Counter {
  public static void main(String[] args) {
    System.out.println(counter(6));
  }

  public static String counter(int countFrom) {
    if (countFrom == 1) {
      //System.out.println(1);
      return "" + 1;
    }
    else {
      return "" + countFrom + "\n" + counter(countFrom - 1);
    }
  }
}
