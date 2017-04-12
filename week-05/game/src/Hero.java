import java.awt.*;
import java.util.List;

public class Hero extends Character {

  public Hero(int positionX, int positionY, String skin, List<Point> walls) {
    super(positionX, positionY, skin, walls);
  }

  @Override
  public void moveUp() {
    this.skin = "hero-up.png";
    Point nextStep = new Point(this.positionX, this.positionY - 72);
    if(this.positionY > 0 && !this.walls.contains(nextStep)) {
      this.positionY -= 72;
    }
  }

  @Override
  public void moveDown() {
    this.positionY += 72;
    this.skin = "hero-down.png";
  }

  @Override
  public void moveLeft() {
    this.positionX -= 72;
    this.skin = "hero-left.png";
  }

  @Override
  public void moveRight() {
    this.positionX += 72;
    this.skin = "hero-right.png";
  }
}
