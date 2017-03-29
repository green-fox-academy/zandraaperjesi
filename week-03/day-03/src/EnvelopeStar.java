import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static final int LINES = 13;

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]
    for (int i = 0; i < LINES; i++) {
      lineDrawer(150 / LINES * i, 150, 150, 150 - 150 / LINES * i, graphics);
      lineDrawer(150 / LINES * i, 150, 150, 150 / LINES * i + 150, graphics);
      lineDrawer(300 - 150 / LINES * i, 150, 150, 150 - 150 / LINES * i, graphics);
      lineDrawer(300 - 150 / LINES * i, 150, 150, 150 / LINES * i + 150, graphics);
    }
  }

  public static void lineDrawer(int x1, int y1, int x2, int y2, Graphics g) {
    g.setColor(Color.BLUE);
    g.drawLine(x1, y1, x2, y2);
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