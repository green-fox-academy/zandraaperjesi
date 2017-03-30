import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

  public static final int ANGLE = 25;

  public static void mainDraw(Graphics graphics){
    lineDrawer(7, 300, 600, 300, 500, ANGLE, 80, graphics);
  }

  public static void lineDrawer(int depth, int x1, int y1, int x2, int y2, int angle, int length,  Graphics g) {
    g.drawLine(x1, y1, x2, y2);
    if (depth > 0) {
      length *= .9;
      int upx2 = x2 + (int) (Math.sin(Math.toRadians(angle)) * length);
      int upy2 = y2 - (int) (Math.cos(Math.toRadians(angle)) * length);
      int upxx2 = x2 + (int) (Math.sin(Math.toRadians(angle + 310 % 360)) * length);
      int upyy2 = y2 - (int) (Math.cos(Math.toRadians(angle + 310 % 360)) * length);
      int upxxx2 = Math.abs(x1 - x2);
      int upyyy2 = Math.abs(y1 - y2);
      if (x1 > x2) {
        upxxx2 = (int)(x2 - upxxx2 * .9);
      }
      else {
        upxxx2 = (int)(x2 + upxxx2 * .9);
      }
      if (y1 > y2) {
        upyyy2 = (int)(y2 - upyyy2 * .9);
      }
      else {
        upyyy2 = (int)(y2 + upyyy2 * .9);
      }

      lineDrawer(depth - 1, x2, y2, upxxx2, upyyy2, angle, length, g);
      if (x1 == x2 || x1 < x2) {
        lineDrawer(depth - 1, x2, y2, upx2, upy2, angle + 25, length, g);
        lineDrawer(depth - 1, x2, y2, upxx2, upyy2, angle + 25, length, g);
      }
      else
        lineDrawer(depth - 1, x2, y2, upx2, upy2, angle - 25, length, g);
      lineDrawer(depth - 1, x2, y2, upxx2, upyy2, angle - 25, length, g);
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