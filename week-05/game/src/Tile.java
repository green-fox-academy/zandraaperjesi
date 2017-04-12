public class Tile extends GameObject{
  boolean isWall;

  public Tile(int positionX, int positionY, String skin, boolean wall) {
    super(positionX, positionY, skin);
    this.isWall = wall;
  }
}
