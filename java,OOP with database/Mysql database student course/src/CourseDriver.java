public class CourseDriver {

   public static void main(String[] args) {
       Course course = new Course("computer science");

       Student student1 = new Student(24, 31, 50);
       Student student2 = new Student(24, 28, 79);
       Student student3 = new Student(45, 44, 66);
       Student student4 = new Student(79, 37, 21);
       Student student5 = new Student(89, 41, 76);

       course.addStudent(student1);
       course.addStudent(student2);
       course.addStudent(student3);
       course.addStudent(student4);
       course.addStudent(student5);

       course.roll();
       System.out.println("All student average is: " + course.average());
   }
}
