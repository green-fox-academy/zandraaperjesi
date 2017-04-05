public class Anagram {
  public String inputString;

  public Anagram(String inputString) {
    this.inputString = inputString;
  }

  public boolean checkForAnagram(String toCheck) {
    StringBuilder myStringbuilder = new StringBuilder(toCheck);
    return toCheck.equals(myStringbuilder.reverse().toString());
  }
}
