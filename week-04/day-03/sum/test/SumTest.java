import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  public Sum testSum;
  public List<Integer> numbers;

  @Test
  public void sumUpMultiple() throws Exception {
    Sum testSum = new Sum();
    numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);
    assertEquals(18, testSum.sumUp(numbers));
  }

  @Test
  public void sumUpOne() throws Exception {
    Sum testSum = new Sum();
    numbers = new ArrayList<>();
    numbers.add(6);
    assertEquals(6, testSum.sumUp(numbers));
  }

  @Test
  public void sumUpEmpty() throws Exception {
    Sum testSum = new Sum();
    numbers = new ArrayList<>();
    assertEquals(0, testSum.sumUp(numbers));
  }

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  @Test
  public void sumUpNull() throws Exception {
    Sum testSum = new Sum();
    numbers = null;
    exception.expect(NullPointerException.class);
    testSum.sumUp(numbers);
  }
}