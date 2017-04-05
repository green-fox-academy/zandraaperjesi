import java.util.Arrays;

public class Anagram {
  private String stringOne;
  private String stringTwo;

  public Anagram(String stringOne, String stringTwo) {
    this.stringOne = stringOne;
    this.stringTwo = stringTwo;
  }

  public boolean isAnagram () {
    char[] firstArray = this.stringOne.toCharArray();
    char[] secondArray = this.stringTwo.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    String firstWord = new String(firstArray);
    String secondWord = new String(secondArray);
    return firstWord.equals(secondWord);
  }
}