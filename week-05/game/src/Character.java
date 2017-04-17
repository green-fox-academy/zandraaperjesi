import java.awt.*;
import java.util.List;
public abstract class Character extends GameObject{
  private RandomGenerator die = new RandomGenerator();
  List<Point> walls;
  int hp;
  int dp;
  int sp;
  int lvl;
  int hasKey;

  public void attack(Character enemy) {
    int sv = this.sp + die.outOfSix() * 2;
    if(sv > enemy.dp) {
      enemy.hp -= sv - enemy.dp;
    }
  }

  public Character(int positionX, int positionY, String skin, List<Point> walls) {
    super(positionX, positionY, skin);
    this.walls = walls;
    this.lvl = 1;
    this.hasKey = 0;
  }

  public int[] getStats() {
    int[] toReturn = {this.hp, this.dp, this.sp, this.lvl};
    return toReturn;
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
