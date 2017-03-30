import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree2 {

  public static void mainDraw(Graphics graphics){
    drawer(150, 150, 20, 40, 5, graphics);
  }

  public static void drawer(int x, int y, int angle, int length, int depth, Graphics g) {
    int x2 = x + (int) (Math.sin(Math.toRadians(angle)) * length);
    int y2 = y - (int) (Math.cos(Math.toRadians(angle)) * length);
    int x3 = x + (int) (Math.sin(Math.toRadians(320 + angle % 360)) * length);
    int y3 = y - (int) (Math.cos(Math.toRadians(320 + angle % 360)) * length);
    int x4 = Math.abs(x - x);
    int y4 = Math.abs(y - y);
    if (x > x) {
      x4 = (int)(x - x4 * .9);
    }
    else {
      x4 = (int)(x + x4 * .9);
    }
    if (y > y) {
      y4 = (int)(y - y4 * .9);
    }
    else {
      y4 = (int)(y + y4 * .9);
    }

    if (depth > 0) {
      g.drawLine(x, y, x2, y2);
      g.drawLine(x, y, x3, y3);
      g.drawLine(x, y, x4, y4);
      drawer(x4, y4, angle, 50, depth - 1, g);
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