import java.awt.*;

public class Skeleton extends Monster{
  private RandomGenerator die;
  int hasKey;

  public Skeleton(int positionX, int positionY, String skin, java.util.List<Point> walls, int mapLevel) {
    super(positionX, positionY, skin, walls, mapLevel);
    this.die = new RandomGenerator();
    this.hp = 100 * this.lvl * die.outOfSix();
    this.dp = this.lvl / 2 * die.outOfSix();
    this.sp = 200 + this.lvl * die.outOfSix();
    this.hasKey = 0;
  }

  public Skeleton(int positionX, int positionY, String skin, java.util.List<Point> walls, int mapLevel, int key) {
    super(positionX, positionY, skin, walls, mapLevel);
    this.die = new RandomGenerator();
    this.hp = 100 * this.lvl * die.outOfSix();
    this.dp = this.lvl / 2 * die.outOfSix();
    this.sp = 200 + this.lvl * die.outOfSix();
    this.hasKey = key;
  }
}
