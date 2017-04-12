import java.awt.*;

public abstract class GameObject {
  int positionX;
  int positionY;
  String skin;

  GameObject(int positionX, int positionY, String skin) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.skin = skin;
  }

  public void drawChar(Graphics g) {
    PositionedImage image = new PositionedImage(skin, positionX, positionY);
    image.draw(g);
  }
}
