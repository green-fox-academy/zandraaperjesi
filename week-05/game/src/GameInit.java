import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class GameInit {
  Character hero;
  //Character skeleton1 = new Character();
  //Character skeleton2 = new Character();
  //Character skeleton3 = new Character();
  //Character boss = new Character();
  java.util.List<Point> walls = new ArrayList<>();
  java.util.List<Point> enemyCoords = new ArrayList<>();
  RandomGenerator coordRNG = new RandomGenerator();
  int[][] mapCoords;
  //getwallCoords();
  //spawnEnemies();

  public GameInit() {
    this.hero = new Hero(0, 0, "hero-down.png");
    mapCoords = readMap("01.txt");
  }

  public int[][] readMap(String mapName) {
    String mapPath = "assets/" + mapName;
    java.util.List<String> mapLines = new ArrayList<>();
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


  public void spawnEnemies() {
    int skeletalCount = 0;
    while (skeletalCount < 4) {
      Point buffer = new Point(coordRNG.ranNum(), coordRNG.ranNum());
      if(!walls.contains(buffer) && !enemyCoords.contains(buffer)) {
        enemyCoords.add(buffer);
        skeletalCount += 1;
      }
    }
  }

  public void getwallCoords() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapCoords[i][j] == 1) {
          walls.add(new Point(j * 72, i * 72));
        }
      }
    }
  }
}
