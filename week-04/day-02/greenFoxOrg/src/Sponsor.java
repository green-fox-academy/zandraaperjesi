public class Sponsor extends Person{
  private String company;
  private int hiredStudents;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + getAge() +" year old " + getGender()
            + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    this.hiredStudents += 1;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
