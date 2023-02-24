
import java.util.ArrayList;
import java.util.List;

public class Course {

   private List<Student> students = new ArrayList<>();
   private String courseName;

   public Course(String courseName) {
       super();
       this.courseName = courseName;
   }

   public void addStudent(Student student) {
       this.students.add(student);
   }

   public int average() {
       int total = 0;
       for (Student student : this.students) {
           total += student.average();
       }
       return total / this.students.size();
   }

   public void roll() {
       for (Student student : this.students) {
           System.out.println(student);
       }
   }
}