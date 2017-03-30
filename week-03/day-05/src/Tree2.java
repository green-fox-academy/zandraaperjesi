import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree2 {


  public static void mainDraw(Graphics graphics){
    lineDrawer(graphics, 300, 500, 0, 7, 50);
  }

  public static void lineDrawer(Graphics g, int x1, int y1, double angle, int depth, double length) {
    if (depth > 0) {
      int x2 = x1 + (int) (Math.sin(Math.toRadians(angle)) * length);
      int y2 = y1 - (int) (Math.cos(Math.toRadians(angle)) * length);
      int upx = Math.abs(x1 - x2);
      int upy = Math.abs(y1 - y2);
      if (x1 > x2) {
        upx = (int)(x2 - upx * .9);
      }
      else {
        upx = (int)(x2 + upx * .9);
      }
      if (y1 > y2) {
        upy = (int)(y2 - upy * .9);
      }
      else {
        upy = (int)(y2 + upy * .9);
      }

      g.drawLine(x1, y1, x2, y2);
      g.drawLine(x1, y1, upx, upy);

      lineDrawer(g, x2, y2, angle + 30, depth - 1, length * .8);
      lineDrawer(g, x2, y2, angle - 30, depth - 1, length * .8);
      lineDrawer(g, upx, upy, angle - 30, depth - 1, length * .8);
      lineDrawer(g, upx, upy, angle + 30, depth - 1, length * .8);
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