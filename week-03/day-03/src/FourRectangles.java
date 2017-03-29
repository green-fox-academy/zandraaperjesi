import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.GREEN);
    graphics.drawRect(23, 13, 10, 12);
    graphics.setColor(Color.BLUE);
    graphics.drawRect(45, 69, 20, 17);
    graphics.setColor(Color.YELLOW);
    graphics.drawRect(49, 100, 30, 12);
    graphics.setColor(Color.PINK);
    graphics.drawRect(23, 140, 40, 40);
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