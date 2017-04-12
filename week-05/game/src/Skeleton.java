import java.awt.*;

public class Skeleton extends Monster{
  private RandomGenerator oneOOFour;

  public Skeleton(int positionX, int positionY, String skin, java.util.List<Point> walls, int mapLevel) {
    super(positionX, positionY, skin, walls, mapLevel);
    this.oneOOFour = new RandomGenerator();
    this.hp = 2 * this.lvl * oneOOFour.outOfSix();
    this.dp = this.lvl / 2 * oneOOFour.outOfSix();
    this.sp = this.lvl * oneOOFour.outOfSix();
  }

}
