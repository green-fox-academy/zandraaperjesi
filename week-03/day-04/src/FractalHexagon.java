import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalHexagon {

  public static void mainDraw(Graphics graphics){


  }

  public static void hexagonPrinter(double x, double y, double diameter,  Graphics g) {
    Polygon p = new Polygon();
    for (int i = 0; i < 6; i++)
      p.addPoint((int) (x + diameter * Math.cos(i * 2 * Math.PI / 6)), (int) (y + diameter * Math.sin(i * 2 * Math.PI / 6)));
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