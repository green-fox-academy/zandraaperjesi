import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class GameInit {
  Character hero;
  List<Point> walls;
  java.util.List<GameObject> allObjects;
  java.util.List<Point> enemyCoords;
  RandomGenerator coordRNG;
  int[][] mapCoords;

  public GameInit(String map) {
    mapCoords = readMap(map);
    walls = new ArrayList<>();
    allObjects = new ArrayList<>();
    enemyCoords = new ArrayList<>();
    coordRNG = new RandomGenerator();
    getwallCoords();
    initMap();
    spawnEnemies();
    this.hero = new Hero(0, 0, "hero-down.png", walls);
    allObjects.add(hero);
    allObjects.add(new Monster((int)enemyCoords.get(0).getX(), (int)enemyCoords.get(0).getY(), "boss.png", walls));
    allObjects.add(new Hero((int)enemyCoords.get(1).getX(), (int)enemyCoords.get(1).getY(), "skeleton.png", walls));
    allObjects.add(new Hero((int)enemyCoords.get(2).getX(), (int)enemyCoords.get(2).getY(), "skeleton.png", walls));
    allObjects.add(new Hero((int)enemyCoords.get(3).getX(), (int)enemyCoords.get(3).getY(), "skeleton.png", walls));
  }

  public List<GameObject> start() {
    return allObjects;
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

  public void initMap() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapCoords[i][j] == 0) {
          Tile newTile = new Tile(j * 72, i * 72, "floor.png", false);
          allObjects.add(newTile);
        }
        else {
          Tile newTile = new Tile(j * 72, i * 72, "wall.png", true);
          allObjects.add(newTile);
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
