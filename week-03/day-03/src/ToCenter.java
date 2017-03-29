import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToCenter {

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    for (int i = 0; i < 20; i++) {
      lineDrawer(300 / 20 * i, 0, graphics);
      lineDrawer(300 / 20 * i, 300, graphics);
      lineDrawer(0, 300 / 20 * i, graphics);
      lineDrawer(300, 300 / 20 * i, graphics);
    }
  }

  public static void lineDrawer(int x, int y, Graphics g) {
    g.drawLine(x, y, 150, 150);
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