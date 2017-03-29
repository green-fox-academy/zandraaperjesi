import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/super-hexagon/r6.gif]

    for (int i = 0; i < 3; i++) {
      hexagonPrinter(10 + i * 20, 10 + i * 20, graphics);
    }
  }

  public static void hexagonPrinter(int x, int y, Graphics g) {
    Polygon p = new Polygon();
    for (int i = 0; i < 6; i++)
      p.addPoint((int) (x + 20 * Math.cos(i * 2 * Math.PI / 6)), (int) (y + 20 * Math.sin(i * 2 * Math.PI / 6)));
    g.drawPolygon(p);
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