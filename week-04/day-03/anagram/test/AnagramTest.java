import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {
  public Anagram anagramDecider;

  @Test
  public void checkForAnagram() throws Exception {
    anagramDecider = new Anagram("dog", "god");
    assertTrue(anagramDecider.isAnagram());
  }

  @Test
  public void checkForNotAnagram() throws Exception {
    anagramDecider = new Anagram("dog", "pupper");
    assertFalse(anagramDecider.isAnagram());
  }

}