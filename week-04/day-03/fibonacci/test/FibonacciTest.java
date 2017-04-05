import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
  private Fibonacci fibonacci;

  @Test
  public void testForRightAmount() {
    fibonacci = new Fibonacci();
    assertEquals(8, fibonacci.calcFibonacci(6));
  }
}