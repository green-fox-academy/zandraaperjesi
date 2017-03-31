import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree2 {


  public static void mainDraw(Graphics graphics){
    int[] colors = randomRGB();
    lineDrawer(graphics, 300, 500, 0, 8, 50, colors[0], 1, colors[1]);
  }

  public static void lineDrawer(Graphics g, int x1, int y1, double angle, int depth, double length, int red, int green, int blue) {
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

      green += depth;
      g.setColor(new Color(red, green, blue));

      g.drawLine(x1, y1, x2, y2);
      g.drawLine(x1, y1, upx, upy);


      lineDrawer(g, x2, y2, angle + 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255);
      lineDrawer(g, x2, y2, angle - 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255);
      lineDrawer(g, upx, upy, angle - 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255);
      lineDrawer(g, upx, upy, angle + 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255);
    }
  }

  public static int[] randomRGB () {
    int[] rgb = new int[2];
    rgb[0] = 220 + (int)(Math.random() * 35);
    rgb[1] = 1 + (int)(Math.random() * 100);
    return rgb;
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }

}