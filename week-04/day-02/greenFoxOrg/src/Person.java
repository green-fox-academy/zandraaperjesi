public class Person {
  private String name;
  private int age;
  private String gender;

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public static void main(String[] args) {
    Person p = new Person();
    p.introduce();
  }
}
