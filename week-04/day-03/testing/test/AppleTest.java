import org.junit.Before;
import static org.junit.Assert.*;

public class AppleTest {
  public Apple apple;

  @Before
  public void beforeEveryTest() {
    apple = new Apple();
  }
  
  @org.junit.Test
  public void getApple() throws Exception {
    assertEquals("apple", apple.getApple());
  }

}