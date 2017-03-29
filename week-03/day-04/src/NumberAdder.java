public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(6));
  }

  public static int numberAdder(int addTill) {
    if (addTill == 1) {
      return 1;
    }
    else {
      return addTill + numberAdder(addTill - 1);
    }
  }
}
