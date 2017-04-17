import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent implements KeyListener {
GameInit game;
List<GameObject> gameObjects;
List<Monster> monsters;
List<int[]> toPrint;
int mapLvl;
int[] heroStats;
HubWriter hubWriter;

  public Board() {
    setPreferredSize(new Dimension(1000, 720));
    setVisible(true);
    game = new GameInit("01.txt");
    gameObjects = game.start();
    monsters = game.getMonsters();
    heroStats = game.hero.getStats();
    mapLvl = 1;
    toPrint = new ArrayList<>();
    toPrint.add(heroStats);
    hubWriter = new HubWriter();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for(GameObject o : gameObjects) {
      PositionedImage p = new PositionedImage(o.skin, o.positionX, o.positionY);
      p.draw(graphics);
    }
    hubWriter.writeHub(toPrint, graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    List<int[]> buffer= new ArrayList<>();

    if (e.getKeyCode() == KeyEvent.VK_UP) {
        game.hero.moveUp();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
        game.hero.moveDown();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
        game.hero.moveLeft();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
        game.hero.moveRight();
    }
    if (game.hero.getMovecount() == 0 && e.getKeyCode() != KeyEvent.VK_SPACE) {
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
    for (int i = 0; i < monsters.size(); i++) {
      if (monsters.get(i).hp < 1 && gameObjects.contains(monsters.get(i))) {
        if (monsters.get(i).hasKey == 1) {
          game.hero.hasKey = 1;
        }
        gameObjects.remove(monsters.get(i));
        monsters.remove(monsters.get(i));
        game.hero.levelUp();
      }
    }
    heroStats = game.hero.getStats();
    for (Monster m : monsters) {
      if (m.positionX == game.hero.positionX && m.positionY == game.hero.positionY) {
        buffer.add(m.getStats());
      }
    }
    buffer.add(heroStats);
    toPrint = buffer;
    repaint();
  }
}