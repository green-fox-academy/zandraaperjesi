import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student studentToAdd) {
    this.students.add(studentToAdd);
  }

  public void addMentor(Mentor mentorToAdd) {
    this.mentors.add(mentorToAdd);
  }

  public void info() {
    System.out.println("Lagopus " + this.className + " class has " + this.students.size()
            +  " students and " + this.mentors.size() + " mentors.");
  }
}
