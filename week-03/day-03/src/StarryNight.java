import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static int NR_STARS = 200;

  public static void mainDraw(Graphics graphics){
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)
    starDrawer(NR_STARS, graphics);
  }

  public static void starDrawer(int stars, Graphics g) {
    for (int i = 0; i < stars; i++) {
      int n = randomNum(255);
      Color starColor = new Color(n, n, n);
      g.setColor(starColor);
      g.fillRect(randomNum(299), randomNum(299), 2, 2);
    }
  }

  public static int randomNum(int cap) {
    int range = (cap) + 1;
    return (int)(Math.random() * range);
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
      this.setBackground(Color.black);
      mainDraw(graphics);

    }
  }

}