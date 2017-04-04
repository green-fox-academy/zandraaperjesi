import java.util.ArrayList;
import java.util.List;

public class LogopusClass {
  private String className;
  private List<Student> students = new ArrayList<>();
  private List<Mentor> mentors = new ArrayList<>();

  public void addStudent(Student studentToAdd) {
    this.students.add(studentToAdd);
  }

  public void addMentor(Mentor mentorToAdd) {
    this.mentors.add(mentorToAdd);
  }

  public void info() {
    System.out.println("Lagopus " + className + "class has " + students.size()
            +  " students and " + mentors.size() + "mentors.");
  }
}
