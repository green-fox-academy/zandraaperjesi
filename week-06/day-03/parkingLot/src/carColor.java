public enum CarColor {Blue, Green, Red, Yellow, Purple, Orange, Black, White;
  static CarColor returnColor() {
    return values()[(int) (Math.random() * values().length)];
  }
}