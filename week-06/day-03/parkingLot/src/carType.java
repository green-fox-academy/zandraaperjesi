public enum CarType {GM, Ford, Toyota, Chrysler, Honda, Nissan, Hyundai, KIA;
  static CarType returnType() {
    return values()[(int) (Math.random() * values().length)];
  }
}
