import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static int LINES = 13;

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    for(int i = 0; i < LINES; i++) {
      lineDrawer(280 / LINES * i + 20, 280 / LINES * i + 20, graphics);
    }
  }

  public static void lineDrawer(int x, int y, Graphics g) {
    g.setColor(Color.MAGENTA);
    g.drawLine(x, 0, 300, y);
    g.setColor(Color.GREEN);
    g.drawLine(x, 300, 0, y);

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