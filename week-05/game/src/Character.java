import java.awt.*;

public class Character {
  int xPos;
  int yPos;
  String spriteOrientation;

  public void drawChar(Graphics g, int posX, int posY, String orient) {
    PositionedImage image = new PositionedImage(spriteOrientation, xPos, yPos);
    this.xPos = posX;
    this.yPos = posY;
    this.spriteOrientation = orient;
    image.draw(g);
  }
}
