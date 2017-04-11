import java.awt.*;

public class Character {
  int xPos;
  int yPos;
  String spriteOrientation = "hero-down.png";

  public void drawChar(Graphics g, int posX, int posY, String orient) {
    this.xPos = posX;
    this.yPos = posY;
    this.spriteOrientation = orient;
    PositionedImage image = new PositionedImage(spriteOrientation, xPos, yPos);
    image.draw(g);
  }
}
