public class StringX {
  public static void main(String[] args) {
    System.out.println(xToY("axaxaxax"));
  }

  public static String xToY(String withX) {
    StringBuilder myStringBuilder = new StringBuilder(withX);
    if (myStringBuilder.length() == 1) {
      if (myStringBuilder.charAt(0) == (char) 88 || myStringBuilder.charAt(0) == (char) 120) {
        myStringBuilder.setCharAt(0,'y');
        return myStringBuilder.toString();
      }
      else {
        return myStringBuilder.toString();
      }
    }
    else {
      if (myStringBuilder.charAt(0) == (char) 88 || myStringBuilder.charAt(0) == (char) 120) {
        myStringBuilder.setCharAt(0,'y');
        return myStringBuilder.charAt(0) + xToY(myStringBuilder.toString().substring(1));
      }
      else {
        return myStringBuilder.charAt(0) + xToY(myStringBuilder.toString().substring(1));
      }
    }
  }
}
