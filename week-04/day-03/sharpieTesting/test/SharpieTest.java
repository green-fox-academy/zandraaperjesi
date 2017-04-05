import org.junit.Test;
import static org.junit.Assert.*;

public class SharpieTest {
  private Sharpie mySharpie;

  @Test
  public void testForUse() {
    mySharpie = new Sharpie("blue", 10);
    for (int i = 0; i < 10; i++) {
      mySharpie.use();
    }
    assertEquals(90, mySharpie.getInkAmount());
  }

  @Test
  public void testColor() {
    mySharpie = new Sharpie("green", 5);
    assertEquals("green", mySharpie.getColor());
  }

  @Test
  public void testWidth() {
    mySharpie = new Sharpie("red", 3);
    assertEquals(3, mySharpie.getWidth());
  }
}