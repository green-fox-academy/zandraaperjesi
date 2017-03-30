import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalBoxes {

  public static void mainDraw(Graphics graphics){
    boxDrawer(5, 0, 0, 486, graphics);
  }

  public static void boxDrawer(int depth,int x, int y, int size, Graphics g) {
    g.drawRect(x, y, size, size);

    if (depth > 0) {
      boxDrawer(depth - 1,x + size / 3, y, size / 3, g);
      boxDrawer(depth - 1, x, y + size / 3, size / 3, g);
      boxDrawer(depth - 1, x + size / 3, y + size / 3 * 2, size / 3, g);
      boxDrawer(depth - 1, x + size / 3 * 2, y + size / 3, size / 3, g);
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