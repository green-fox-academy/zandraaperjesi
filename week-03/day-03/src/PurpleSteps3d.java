import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

  public static Color PURPLE = new Color(169, 67, 232);

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]
    int pushWith = 0;
    for (int i = 0; i < 6; i++) {
      pushWith += (i * 10 + 1);
      boxDrawer(pushWith + 11, i * 10 + 11, graphics);
    }
  }

  public static void boxDrawer(int coord,int size,  Graphics g) {
    g.setColor(PURPLE);
    g.fillRect(coord, coord, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(coord, coord, size, size);
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