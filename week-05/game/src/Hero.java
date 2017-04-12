public class Hero extends Character {

  public Hero(int positionX, int positionY, String skin) {
    super(positionX, positionY, skin);
  }

  @Override
  public void moveUp() {
    this.positionY -= 72;
    this.skin = "hero-up.png";
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
