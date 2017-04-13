public abstract class GameObject {
  int positionX;
  int positionY;
  String skin;

  GameObject(int positionX, int positionY, String skin) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.skin = skin;
  }
}
