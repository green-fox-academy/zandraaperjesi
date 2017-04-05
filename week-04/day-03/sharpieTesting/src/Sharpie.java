public class Sharpie {
  String color;
  int width;
  int inkAmount = 100;

  public Sharpie(String color, int width) {
    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount -= 1;
  }

  public String getColor() {
    return this.color;
  }

  public int getInkAmount() {
    return this.inkAmount;
  }

  public int getWidth() {
    return this.width;
  }
}