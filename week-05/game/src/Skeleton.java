import java.awt.*;

public class Skeleton extends Monster{
  private RandomGenerator die;

  public Skeleton(int positionX, int positionY, String skin, java.util.List<Point> walls, int mapLevel) {
    super(positionX, positionY, skin, walls, mapLevel);
    this.die = new RandomGenerator();
    this.hp = 2 * this.lvl * die.outOfSix();
    this.dp = this.lvl / 2 * die.outOfSix();
    this.sp = this.lvl * die.outOfSix();
    if(this.hp <= 0) {
      this.hp = 1;
    }
  }

  public Skeleton(int positionX, int positionY, String skin, java.util.List<Point> walls, int mapLevel, int key) {
    super(positionX, positionY, skin, walls, mapLevel);
    this.die = new RandomGenerator();
    this.hp = 2 * this.lvl * die.outOfSix();
    this.dp = this.lvl / 2 * die.outOfSix();
    this.sp = this.lvl * die.outOfSix();
    this.hasKey = key;
    if(this.hp <= 0) {
      this.hp = 1;
    }
  }
}
