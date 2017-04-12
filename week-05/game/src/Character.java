import java.awt.*;
import java.util.List;
public abstract class Character extends GameObject{
  List<Point> walls;

  public Character(int positionX, int positionY, String skin, List<Point> walls) {
    super(positionX, positionY, skin);
    this.walls = walls;
  }

  public void moveUp() {
    this.positionY -= 72;
  }

  public void moveDown() {
    this.positionY += 72;
  }

  public void moveLeft() {
    this.positionX -= 72;
  }

  public void moveRight() {
    this.positionX += 72;
  }
}
