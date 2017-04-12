import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.*;


public class Board extends JComponent implements KeyListener {
GameInit game = new GameInit();

  public Board() {
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      Point nextStep = new Point(, heroCoordY - 72);
      if(heroCoordY > 0 && !walls.contains(nextStep)) {
        heroCoordY -= 72;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroStance = "hero-down.png";
      Point nextStep = new Point(heroCoordX, heroCoordY + 72);
      if(heroCoordY < 648 && !walls.contains(nextStep)) {
        heroCoordY += 72;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroStance = "hero-left.png";
      Point nextStep = new Point(heroCoordX - 72, heroCoordY);
      if(heroCoordX > 0 && !walls.contains(nextStep)) {
        heroCoordX -= 72;
      }
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroStance = "hero-right.png";
      Point nextStep = new Point(heroCoordX + 72, heroCoordY);
      if(heroCoordX < 648 && !walls.contains(nextStep)) {
        heroCoordX += 72;
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}