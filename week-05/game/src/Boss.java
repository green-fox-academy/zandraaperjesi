import java.awt.*;

public class Boss extends Monster{
  private RandomGenerator die;

  public Boss(int positionX, int positionY, String skin, java.util.List<Point> walls, int mapLevel) {
    super(positionX, positionY, skin, walls, mapLevel);
    this.die = new RandomGenerator();
    this.hp = 2 * this.lvl * die.outOfSix() + die.outOfSix();
    this.dp = this.lvl / 2 * die.outOfSix() + die.outOfSix() / 2;
    this.sp = this.lvl * die.outOfSix() + this.lvl;
  }
}
