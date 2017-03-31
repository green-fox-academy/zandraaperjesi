import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree2 {

  public static void mainDraw(Graphics graphics){
    int[] colors = randomRGB();
    lineDrawer(500, 650, 0, 8, 80, colors[0], 1, colors[1], graphics);
  }

  public static void lineDrawer(int x1, int y1, double angle, int depth, double length, int red, int green, int blue, Graphics g) {
    if (depth > 0) {
      Graphics2D gTD = (Graphics2D) g;
      int[] coords = coordCounter(length, x1, y1, angle);
      green += depth;
      gTD.setColor(new Color(red, green, blue));
      gTD.setStroke(new BasicStroke((float)length / 4));

      gTD.drawLine(x1, y1, coords[0], coords[1]);
      gTD.drawLine(x1, y1, coords[2], coords[3]);

      lineDrawer(coords[0], coords[1], angle + 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255, g);
      lineDrawer(coords[0], coords[1], angle - 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255, g);
      lineDrawer(coords[2], coords[3], angle - 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255, g);
      lineDrawer(coords[2], coords[3], angle + 30, depth - 1, length * .8, (red + 10) % 255, green, Math.abs(blue - 10) % 255, g);
    }
  }

  public static int[] coordCounter(double len, int x, int y, double angle) {
    int x2 = x + (int) (Math.sin(Math.toRadians(angle)) * len);
    int y2 = y - (int) (Math.cos(Math.toRadians(angle)) * len);
    int upx = Math.abs(x - x2);
    int upy = Math.abs(y - y2);
    if (x > x2) {
      upx = (int)(x2 - upx * .9);
    }
    else {
      upx = (int)(x2 + upx * .9);
    }
    if (y > y2) {
      upy = (int)(y2 - upy * .9);
    }
    else {
      upy = (int)(y2 + upy * .9);
    }
    int[] coords = {x2, y2, upx, upy};
    return coords;
  }

  public static int[] randomRGB() {
    int[] rgb = new int[2];
    rgb[0] = 220 + (int)(Math.random() * 35);
    rgb[1] = 1 + (int)(Math.random() * 100);
    return rgb;
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(1000, 800));
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