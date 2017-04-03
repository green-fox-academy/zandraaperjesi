public class Main {
  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("green", 1.5f);

    for (int i = 0; i <35 ; i++) {
      sharpie.use();
    }

    System.out.println(sharpie.inkAmount);
  }
}
