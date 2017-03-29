import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.
    Color[] colors = {Color.WHITE, Color.BLACK};
    for (int i = 0; i < 8; i++) {
      int y = i * 300 / 8;
      for (int j = 0; j < 8; j++) {
        int x = j * 300 / 8;
        squareDrawer(x, y, colors[(i + j) % 2], graphics);
      }
    }



  }

  public static void squareDrawer(int x, int y, Color color, Graphics g) {
    g.setColor(color);
    g.fillRect(x, y, 300 / 8, 300 / 8);
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