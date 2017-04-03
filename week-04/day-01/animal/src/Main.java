public class Main {
  public static void main(String[] args) {

    Animal doggo = new Animal();
    Animal pupper = new Animal();

    for (int i = 0; i < 5; i++) {
      doggo.play();
      System.out.println(doggo.thirst);
      System.out.println(doggo.hunger);

      pupper.eat();
      System.out.println(pupper.hunger);
    }
  }
}
