public class StringWithStars {
  public static void main(String[] args) {
    System.out.println(starAdder("thisIsAString"));
  }

  public static String starAdder(String toAddTo) {
    if (toAddTo.length() == 1) {
      return toAddTo;
    }
    else {
      return toAddTo.charAt(0) + "*" + starAdder(toAddTo.substring(1));
    }
  }
}
