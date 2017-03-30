import javax.swing.*;
import javax.swing.text.BadLocationException;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

  public static final int ANGLE = 20;

  public static void mainDraw(Graphics graphics){
    lineDrawer(5, 200, 500, 200, 400, ANGLE, graphics);
  }

  public static void lineDrawer(int depth, int x1, int y1, int x2, int y2,int angle, Graphics g) {
    g.drawLine(x1, y1, x2, y2);
    if (depth > 0) {
      int upx2 = x2 + (int) (Math.sin(Math.toRadians(angle)) * 30);
      int upy2 = y2 - (int) (Math.cos(Math.toRadians(angle)) * 30);
      int upxx2 = x2 + (int) (Math.sin(Math.toRadians(360 - angle)) * 30);
      int upyy2 = y2 - (int) (Math.cos(Math.toRadians(360 - angle)) * 30);
      int upxxx2 = Math.abs(x1 - x2);
      int upyyy2 = Math.abs(y1 - y2);
      if (x1 > x2) {
        upxxx2 = x2 - upxxx2;
      }
      else {
        upxxx2 = x2 + upxxx2;
      }
      if (y1 > y2) {
        upyyy2 = y2 - upyyy2;
      }
      else {
        upyyy2 = y2 + upyyy2;
      }

      g.setColor(Color.BLUE);
      lineDrawer(depth - 1, x2, y2, upx2, upy2,angle + 20, g);
      lineDrawer(depth - 1, x2, y2, upxx2, upyy2,angle + 20, g);
      lineDrawer(depth - 1, x2, y2, upxxx2, upyyy2, angle, g);
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