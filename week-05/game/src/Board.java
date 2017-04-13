import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {
GameInit game;
List<GameObject> gameObjects;
List<Monster> monsters;
int mapLvl;
  int[] heroStats;

  public Board() {
    setPreferredSize(new Dimension(1000, 720));
    setVisible(true);
    game = new GameInit("01.txt");
    gameObjects = game.start();
    monsters = game.getMonsters();
    heroStats = game.hero.getStats();
    mapLvl = 1;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for(GameObject o : gameObjects) {
      PositionedImage p = new PositionedImage(o.skin, o.positionX, o.positionY);
      p.draw(graphics);
    }
    graphics.drawString("Hero (Level " + heroStats[3] + ") HP: " + heroStats[0] + " | DP: " + heroStats[1] + " | SP: " + heroStats[2], 750, 100);
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
        game.hero.moveDown();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
        game.hero.moveLeft();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
        game.hero.moveRight();
    }
    if (game.hero.getMovecount() == 0) {
      game.skeleton1.move();
      game.skeleton2.move();
      game.skeleton3.move();
      game.boss.move();
    }
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      for (Monster m : monsters) {
        if (m.positionX == game.hero.positionX && m.positionY == game.hero.positionY) {
          if(game.hero.getMovecount() == 0) {
            m.attack(game.hero);
            game.hero.attack(m);
            System.out.println(game.hero.hp);
          }
          else {
            game.hero.attack(m);
            m.attack(game.hero);
            System.out.println(game.hero.hp);
          }
        }
      }
    }
    for (Monster m : monsters) {
      if (m.hp < 1 && gameObjects.contains(m)) {
        gameObjects.remove(m);
      }
    }
    heroStats = game.hero.getStats();
    repaint();
  }
}