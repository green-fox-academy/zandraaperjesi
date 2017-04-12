public class Character extends GameObject{

  public Character(int positionX, int positionY, String skin) {
    super(positionX, positionY, skin);
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
