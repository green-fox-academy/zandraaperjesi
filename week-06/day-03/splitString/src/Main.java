public class Main {
  public static void main(String[] args) {
    System.out.println(stringSpliter("cutMeHere", 5)[0]);
    System.out.println(stringSpliter("cutMeHere", 5)[1]);
  }

  public static String[] stringSpliter(String s, int i) {
    String[] toReturn = new String[2];
    try {
      toReturn[0] = s.substring(0, i);
      toReturn[1] = s.substring(i, s.length());
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    return toReturn;
  }
}
