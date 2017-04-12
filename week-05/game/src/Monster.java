import java.awt.*;
import java.util.List;

public class Monster extends Character{
  private RandomGenerator oneOOFour;

  public Monster(int positionX, int positionY, String skin, List<Point> walls) {
    super(positionX, positionY, skin, walls);
    this.oneOOFour = new RandomGenerator();
  }

  public void move() {
    int ranNum = oneOOFour.outOfFour();

    if(ranNum == 0) {
      if(this.moveMUp() == 1) {
        return;
      }
      else {move();}
    }
    else if(ranNum == 1) {
      if(this.moveMDown() == 1) {
        return;
      }
      else {move();}
    }
    else if(ranNum == 2) {
      if(this.moveMRight() == 1) {
        return;
      }
      else {move();}
    }
    else {
      if(this.moveMLeft() == 1) {
        return;
      }
      else {move();}
    }
  }

  public int moveMUp() {
    Point nextStep = new Point(this.positionX, this.positionY - 72);
    if(this.positionY > 0 && !this.walls.contains(nextStep)) {
      this.positionY -= 72;
      return 1;
    }
    return 0;
  }

  public int moveMDown() {
    Point nextStep = new Point(this.positionX, this.positionY + 72);
    if(this.positionY < 648 && !this.walls.contains(nextStep)) {
      this.positionY += 72;
      return 1;
    }
    return 0;
  }

  public int moveMLeft() {
    Point nextStep = new Point(this.positionX - 72, this.positionY);
    if(this.positionX > 0 && !this.walls.contains(nextStep)) {
      this.positionX -= 72;
      return 1;
    }
    return 0;
  }

  public int moveMRight() {
    Point nextStep = new Point(this.positionX + 72, this.positionY);
    if(this.positionX < 648 && !this.walls.contains(nextStep)) {
      this.positionX += 72;
      return 1;
    }
    return 0;
  }
}
