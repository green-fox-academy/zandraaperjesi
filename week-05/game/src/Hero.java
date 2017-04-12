import java.awt.*;
import java.util.List;

public class Hero extends Character {
  private int movecount;
  private RandomGenerator die;

  public Hero(int positionX, int positionY, String skin, List<Point> walls) {
    super(positionX, positionY, skin, walls);
    this.die = new RandomGenerator();
    this.movecount = 0;
    this.hp = 20 + 3 * die.outOfSix();
    this.dp = 2 * die.outOfSix();
    this.sp = 5 + die.outOfSix();
  }

  public int getMovecount() {
    return this.movecount % 2;
  }

  @Override
  public void moveUp() {
    this.skin = "hero-up.png";
    Point nextStep = new Point(this.positionX, this.positionY - 72);
    if(this.positionY > 0 && !this.walls.contains(nextStep)) {
      this.positionY -= 72;
      this.movecount += 1;
    }
  }

  @Override
  public void moveDown() {
    this.skin = "hero-down.png";
    Point nextStep = new Point(this.positionX, this.positionY + 72);
    if(this.positionY < 648 && !this.walls.contains(nextStep)) {
      this.positionY += 72;
      this.movecount += 1;
    }
  }

  @Override
  public void moveLeft() {
    this.skin = "hero-left.png";
    Point nextStep = new Point(this.positionX - 72, this.positionY);
    if(this.positionX > 0 && !this.walls.contains(nextStep)) {
      this.positionX -= 72;
      this.movecount += 1;
    }
  }

  @Override
  public void moveRight() {
    this.skin = "hero-right.png";
    Point nextStep = new Point(this.positionX + 72, this.positionY);
    if(this.positionX < 648 && !this.walls.contains(nextStep)) {
      this.positionX += 72;
      this.movecount += 1;
    }
  }
}
