import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  private CountLetters letterCounter;

  @Test
  public void testForSingle() throws Exception{
    letterCounter = new CountLetters("a");
    assertEquals(1, letterCounter.timesInWord('a'));
  }
}