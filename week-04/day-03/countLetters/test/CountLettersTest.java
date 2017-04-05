import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class CountLettersTest {
  private CountLetters letterCounter;

  @Test
  public void testForNone() throws Exception{
    letterCounter = new CountLetters("a");
    assertEquals(0, letterCounter.timesInWord('b'));
  }

  @Test
  public void testForSingle() throws Exception{
    letterCounter = new CountLetters("a");
    assertEquals(1, letterCounter.timesInWord('a'));
  }

  @Test
  public void testForDouble() throws Exception{
    letterCounter = new CountLetters("aab");
    assertEquals(2, letterCounter.timesInWord('a'));
  }

  @Test
  public void testForStartEnd() throws Exception{
    letterCounter = new CountLetters("abca");
    assertEquals(2, letterCounter.timesInWord('a'));
  }

  @Test
  public void testForSameMap() throws Exception{
    letterCounter = new CountLetters("alma");
    HashMap<Character, Integer> expected = new HashMap<>();
    expected.put('a', 2);
    expected.put('l', 1);
    expected.put('m', 1);
    assertEquals(expected, letterCounter.getLetterMap());
  }
}