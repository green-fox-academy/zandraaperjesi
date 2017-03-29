import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pyramid {
  public static final int HEIGHT = 3;

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/triangles/r5.png]



  }

  public static void lineDrawer() {
    for (int i = 1; i < HEIGHT + 1; i++) {
      List<Point> toConnect = new ArrayList<>();
      int startPointX = 150 - 6 * i;
      int startPointY = 20 + 10 * i;
      for (int j = 0; j < HEIGHT * 2 + 1; j++) {
        toConnect.add(new Point(startPointX, startPointY));
        startPointX += 6;
        startPointY += 10 * (j % i * (-1));
      }

    }
  }
  

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}