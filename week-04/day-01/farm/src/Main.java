public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm();
    farm.breed();
    farm.breed();
    System.out.println(farm.animals.size());
    farm.slaughter();
    System.out.println(farm.animals.size());
  }
}
