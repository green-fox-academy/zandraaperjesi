import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {
GameInit game;
List<GameObject> gameObjects;

  public Board() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    game = new GameInit("01.txt");
    gameObjects = game.start();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for(GameObject o : gameObjects) {
      PositionedImage p = new PositionedImage(o.skin, o.positionX, o.positionY);
      p.draw(graphics);
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_UP) {
        game.hero.moveUp();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      Point nextStep = new Point(game.hero.positionX, game.hero.positionY + 72);
      if(game.hero.positionY < 648 && !game.walls.contains(nextStep)) {
        game.hero.moveDown();
      }
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      Point nextStep = new Point(game.hero.positionX - 72, game.hero.positionY);
      if(game.hero.positionX > 0 && !game.walls.contains(nextStep)) {
        game.hero.moveLeft();
      }
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      Point nextStep = new Point(game.hero.positionX + 72, game.hero.positionY);
      if(game.hero.positionX < 648 && !game.walls.contains(nextStep)) {
        game.hero.moveRight();
      }
    }
    repaint();
  }
}