import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  int heroCoordX;
  int heroCoordY;
  String heroStance;
  Character hero = new Character();
  Character skeleton1 = new Character();
  Character skeleton2 = new Character();
  Character skeleton3 = new Character();
  List<Point> walls = new ArrayList<>();
  List<Point> skeletalCoords = new ArrayList<>();
  RandomGenerator coordRNG = new RandomGenerator();
  int[][] mapCoords;

  public Board() {
    heroCoordX = 0;
    heroCoordY = 0;
    heroStance = "hero-down.png";
    mapCoords = readMap("01.txt");
    getwallCoords();
    spawnSkeletals();

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    drawMap(graphics);
    drawHero(graphics);
    skeleton1.drawChar(graphics, (int) skeletalCoords.get(0).getX(), (int) skeletalCoords.get(0).getY(), "skeleton.png");
    skeleton2.drawChar(graphics, (int) skeletalCoords.get(1).getX(), (int) skeletalCoords.get(1).getY(), "skeleton.png");
    skeleton3.drawChar(graphics, (int) skeletalCoords.get(2).getX(), (int) skeletalCoords.get(2).getY(), "skeleton.png");
  }

  public void spawnSkeletals() {
    int skeletalCount = 0;
    while (skeletalCount < 3) {
      Point buffer = new Point(coordRNG.ranNum(), coordRNG.ranNum());
      System.out.println(buffer);
      if(!walls.contains(buffer)) {
        skeletalCoords.add(buffer);
        skeletalCount += 1;
      }
    }
  }

  public int[][] readMap(String mapName) {
    String mapPath = "assets/" + mapName;
    List<String> mapLines = new ArrayList<>();
    int[][] coords = new int[10][10];
    try {
      Path filePath = Paths.get(mapPath);
      mapLines = Files.readAllLines(filePath);
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          coords[i][j] = (int) mapLines.get(i).charAt(j) - 48;
        }
      }
    } catch (IOException ex) {
      System.out.println("couldn't open file");
    }
    return coords;
  }

  public void drawHero(Graphics g) {
    hero.drawChar(g, heroCoordX, heroCoordY, heroStance);
  }

  public void drawMap(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapCoords[i][j] == 0) {
          PositionedImage image = new PositionedImage("floor.png", i * 72, j * 72);
          image.draw(graphics);
        }
        else {
          PositionedImage image = new PositionedImage("wall.png", i * 72, j * 72);
          image.draw(graphics);
        }
      }
    }
  }

  public void getwallCoords() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapCoords[i][j] == 1) {
          walls.add(new Point(i * 72, j * 72));
        }
      }
    }
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      heroStance = "hero-up.png";
      Point nextStep = new Point(heroCoordX, heroCoordY - 72);
      if(heroCoordY > 0 && !walls.contains(nextStep)) {
        heroCoordY -= 72;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroStance = "hero-down.png";
      Point nextStep = new Point(heroCoordX, heroCoordY + 72);
      if(heroCoordY < 648 && !walls.contains(nextStep)) {
        heroCoordY += 72;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroStance = "hero-left.png";
      Point nextStep = new Point(heroCoordX - 72, heroCoordY);
      if(heroCoordX > 0 && !walls.contains(nextStep)) {
        heroCoordX -= 72;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroStance = "hero-right.png";
      Point nextStep = new Point(heroCoordX + 72, heroCoordY);
      if(heroCoordX < 648 && !walls.contains(nextStep)) {
        heroCoordX += 72;
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}