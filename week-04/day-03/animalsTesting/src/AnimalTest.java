import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  private Animal myAnimal;

  @Test
  public void testEat() {
    myAnimal = new Animal();
    myAnimal.eat();
    assertEquals(49, myAnimal.getHunger());
  }

  @Test
  public void testDrink() {
    myAnimal = new Animal();
    myAnimal.drink();
    myAnimal.drink();
    assertEquals(48, myAnimal.getThirst());
  }

  @Test
  public void testPlay() {
    myAnimal = new Animal();
    myAnimal.play();
    assertEquals(51, myAnimal.getThirst());
  }

  @Test
  public void testInitial() {
    myAnimal = new Animal();
    assertEquals(50, myAnimal.getThirst());
  }
}