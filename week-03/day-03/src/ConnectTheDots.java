import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics){
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
    Point[] box = {new Point(10, 10),
            new Point(290,  10),
            new Point(290, 290),
            new Point(10, 290)
    };

    Point[] toConnect = {new Point(50, 100),
            new Point(70, 70),
            new Point(80, 90),
            new Point(90, 90),
            new Point(100, 70),
            new Point(120, 100),
            new Point(85, 130),
            new Point(50, 100)
    };
    dotConnector(toConnect, graphics);
  }

  public static void dotConnector(Point[] points, Graphics g) {
    for (int i = 0; i < points.length - 1; i++) {
      g.drawLine(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);
    }
    g.drawLine(points[points.length - 1].x, points[points.length - 1].y, points[0].x, points[0].y);
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


// create a 300x300 canvas.