public class StringNoX {
  public static void main(String[] args) {
    System.out.println(xToY("axxext"));
  }

  public static String xToY(String withX) {
    StringBuilder myStringBuilder = new StringBuilder(withX);
    if (myStringBuilder.length() == 1) {
      if (myStringBuilder.charAt(0) == (char) 88 || myStringBuilder.charAt(0) == (char) 120) {
        myStringBuilder.deleteCharAt(0);
        return myStringBuilder.toString();
      }
      else {
        return myStringBuilder.toString();
      }
    }
    else {
      if (myStringBuilder.charAt(0) == (char) 88 || myStringBuilder.charAt(0) == (char) 120) {
        myStringBuilder.deleteCharAt(0);
        if (myStringBuilder.length() > 1 && (myStringBuilder.charAt(0) == (char) 88 || myStringBuilder.charAt(0) == (char) 120)) {
          return xToY(myStringBuilder.toString().substring(1));
        }
        if (myStringBuilder.length() > 1) {
          return myStringBuilder.charAt(0) + xToY(myStringBuilder.toString().substring(1));
        }
        else {
          return myStringBuilder.toString();
        }
      }
      else {
        return myStringBuilder.charAt(0) + xToY(myStringBuilder.toString().substring(1));
      }
    }
  }
}
