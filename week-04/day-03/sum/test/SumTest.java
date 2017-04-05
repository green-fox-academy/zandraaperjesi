import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumTest {
  public Sum testSum;

  @Before
  public void beforeTest() {
    testSum = new Sum();
  }

  @Test
  public void sumUp() throws Exception {
    assertEquals(19, testSum.sumUp());
  }

}