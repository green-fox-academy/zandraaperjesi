public class Main {
  public static void main(String[] args) {
    Sharpie blue = new Sharpie("blue", 10);
    Sharpie green = new Sharpie("green", 12);
    Sharpie red = new Sharpie("red", 4);
    Sharpie yellow = new Sharpie("yellow", 1.5f);
    SharpieSet mySharpies = new SharpieSet();

    mySharpies.addSharpie(blue);
    mySharpies.addSharpie(green);
    mySharpies.addSharpie(red);
    mySharpies.addSharpie(yellow);

    for (int i = 0; i < 200; i++) {
      blue.use();
      red.use();
    }

    System.out.println(blue.inkAmount);

    SharpieSet.countUsable();
  }
}
